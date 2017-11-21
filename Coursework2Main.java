/**
 * "Driver class" to exercise some of the functionalities provided by the
 * Item hierarchy.
 *
 * @author Babatope Bankole
 */
public class Coursework2Main {

    /* Some constants */

    /** Number of units for an item. */
    private static final int NUMBER_OF_ITEM1 = 2;

    /* Some helper methods to generate test objects */

    /**
     * @return an exemplary PhysicalItem
     */
    public static PhysicalItem mkPhysicalItem1() {
        return new PhysicalItem("Jacket", 8000, NUMBER_OF_ITEM1);
    }

    /**
     * @return an exemplary PhysicalItem with negative price
     */
    public static PhysicalItem mkPhysicalItem2() {
        return new PhysicalItem("Item of negative price", -200, 1);
    }

    /**
     * @return an exemplary JPod
     */
    public static JPod mkJPod() {
        return new JPod("JPod Deluxe", 20000, 5);
    }

    /**
     * @return an exemplary PrintBook
     */
    public static PrintBook mkPrintBook() {
        return new PrintBook("Effective Java, 3rd edition", 6000,
            8, "9780134685991", 432);
    }

    /**
     * @return an exemplary MusicTrack
     */
    public static MusicTrack mkMusicTrack() {
        return new MusicTrack("London Calling", 99, 5324213L, 198); // L for long 
    }

    /**
     * @return an exemplary EBook
     */
    public static EBook mkEBook() {
        return new EBook("Java and all that", 1000, 4224000L, "9780000000002");
    }

    /* Methods that exercise objects in (and related to) the Item hierarchy */

    /**
     * Helper method to sell a single unit of an item and print about it.
     *
     * @param item  must not be null
     */
    private static void runItem(Item item) {
        int pence = item.sellOne();
        System.out.println("  -> Sold for: " + Item.computePriceString(pence));
        System.out.println(item);
    }

    /**
     * Exercises some of the functionality of the class PhysicalItem.
     */
    public static void runPhysicalItem() {
        PhysicalItem item1 = mkPhysicalItem1();
        System.out.println(item1);
        for (int i = 0; i < NUMBER_OF_ITEM1; i++) {
            runItem(item1);
        }
        System.out.println();

        try {
            int pence = item1.sellOne();
        } catch (OutOfStockException e) {
            System.out.println(e);
        }

        try {
            PhysicalItem item2 = mkPhysicalItem2();
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
        System.out.println();
    }
    
    /**
     * Exercises some of the functionality of the class JPod.
     */
    public static void runJPod() {
        JPod item = mkJPod();
        System.out.println(item);

        // Be careful to run such a loop only on items with bounded supply;
        // if an item is /always/ in stock, the loop will not terminate!
        while (item.inStock()) {
            runItem(item);
        }
        System.out.println();
    }

    /**
     * Exercises some of the functionality of the class PrintBook.
     */
    public static void runPrintBook() {
        PrintBook item = mkPrintBook();
        System.out.println(item);
        runItem(item);
        System.out.println();
    }

    /**
     * Exercises some of the functionality of subclasses of DataItem.
     */
    public static void runDataItem() {
        DataItem item1 = mkMusicTrack();
        System.out.println(item1);
        runItem(item1);
        System.out.println();
        DataItem item2 = mkEBook();
        System.out.println(item2);
        runItem(item2);
        System.out.println();
    }

    /**
     * Exercises some of the functionality of the interface Book.
     */
    public static void runBooks() {
        Book[] books = {
            mkPrintBook(),
            mkEBook()
        };
        System.out.println("*** Our Books ***");
        for (Book b : books) {
            System.out.println("ISBN: " + b.getISBN());
        }
    }

    /**
     * Main method for exercising classes from the Item hierarchy.
     *
     * @param args ignored
     */
    public static void main(String[] args) {
        runPhysicalItem();
        runJPod();
        runPrintBook();
        runDataItem();
        runBooks();
    }

/*

*** PhysicalItem ***
Name: Jacket
Price: GBP 80.00
Units left: 2
  -> Sold for: GBP 80.00
*** PhysicalItem ***
Name: Jacket
Price: GBP 80.00
Units left: 1
  -> Sold for: GBP 80.00
*** PhysicalItem ***
Name: Jacket
Price: GBP 80.00
Units left: 0

OutOfStockException: Item out of stock!
java.lang.IllegalArgumentException: Expected pricePence >= 0; found -200

*** JPod ***
Name: JPod Deluxe
Price: GBP 200.00
Units left: 5
  -> Sold for: GBP 200.00
*** JPod ***
Name: JPod Deluxe
Price: GBP 200.00
Units left: 4
  -> Sold for: GBP 200.00
*** JPod ***
Name: JPod Deluxe
Price: GBP 400.00
Units left: 3
  -> Sold for: GBP 400.00
*** JPod ***
Name: JPod Deluxe
Price: GBP 600.00
Units left: 2
  -> Sold for: GBP 600.00
*** JPod ***
Name: JPod Deluxe
Price: GBP 800.00
Units left: 1
  -> Sold for: GBP 800.00
*** JPod ***
Name: JPod Deluxe
Price: GBP 1000.00
Units left: 0

*** PrintBook ***
Name: Effective Java, 3rd edition
Price: GBP 60.00
Units left: 8
ISBN: 9780134685991
Pages: 432
  -> Sold for: GBP 60.00
*** PrintBook ***
Name: Effective Java, 3rd edition
Price: GBP 60.00
Units left: 7
ISBN: 9780134685991
Pages: 432

*** MusicTrack ***
Name: London Calling
Price: GBP 0.99
Bytes: 5324213
Seconds: 198
  -> Sold for: GBP 0.99
*** MusicTrack ***
Name: London Calling
Price: GBP 0.99
Bytes: 5324213
Seconds: 198

*** EBook ***
Name: Java and all that
Price: GBP 10.00
Bytes: 4224000
ISBN: 9780000000002
  -> Sold for: GBP 10.00
*** EBook ***
Name: Java and all that
Price: GBP 10.00
Bytes: 4224000
ISBN: 9780000000002

*** Our Books ***
ISBN: 9780134685991
ISBN: 9780000000002

 */
}

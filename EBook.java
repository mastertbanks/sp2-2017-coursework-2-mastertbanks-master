/**
 * An electronic book with a name, a price in pence, a size in bytes, and
 * an ISBN. Since not all electronic books have a fixed number of pages,
 * this class does not implement the interface HasPages.
 *
 *   @author Babatope Bankole
 */
public class EBook extends DataItem implements Book {

    
    private String isbn;

    /**
     * Constructs a new PrintBook according to the parameter values.
     *
     * @param name  the name of this PrintBook, must not be null
     * @param pricePence  the price of this PrintBook in pence, must be greater
     *  than or equal to 0
     * @param sizeBytes  the size of the EBook in bytes;
     *  must be greater than 0
     * @param isbn  the ISBN-13 of the book, must consist only of digits
     *  and must be a well-formed ISBN-13
     */
    public EBook(String name, int pricePence, long sizeBytes, String isbn) {
        super(name,pricePence,sizeBytes);
        if(Book.checkWellFormedISBN(isbn)==true){ 
            this.isbn=isbn;
        }
        else{
        throw new IllegalArgumentException("Please check the ISBN number!");
        }
    }
    
    
    /**
     * Check if Ebook item is in stock.
     *
     * @return true or false if Ebook found
     */
    public boolean inStock(){
        return super.inStock();
    }

    /**
     * Returns the price of this Item in pence.
     *
     * @return the price of this Item in pence
     */
    public int computePricePence() {
        return super.computePricePence();
    }
    
    /**
     * Returns the SizeByte of the Ebook.
     *
     * @return the SizeByte of the EBook
     */
    public long getSizeBytes(){
        return super.getsizeBytes();
    }
    
    
    /**
     * Returns the name of this EBook Item.
     *
     * @return the name of this Ebook Item
     */
    public String getName(){
            return super.getName();
    }

    /**
     * Returns the ISBN for EBook.
     *
     * @return the ISBN for Ebook
     */
    public String getISBN(){
        return this.isbn;
    }

    /**
     * collect all information about item to be displayed.
     *
     * @param collect all information about item to be displayed .
     * @Override
     */
    @Override
    public String toString() {
        return super.toString()
            + "\nBytes: " + this.getSizeBytes()
            + "\nISBN: " + this.getISBN();
    }
}

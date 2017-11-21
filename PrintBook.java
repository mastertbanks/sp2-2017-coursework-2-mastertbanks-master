/**
 * A printed book with a name, a price, a number of units in stock,
 * an ISBN, and a number of pages.
 *
 *   @author Babatope Bankole
 */
public class PrintBook extends PhysicalItem implements HasPages, Book {

    private int pages;
    private String isbn;

    /**
     * Constructs a new PrintBook according to the parameter values.
     *
     * @param name  the name of this PrintBook, must not be null
     * @param pence  the price of this PrintBook in pence, must be greater
     *  than or equal to 0
     * @param howMany  the number of units we have of this PrintBook,
     *  must be greater than or equal to 0
     * @param isbn  the ISBN-13 of the book, must consist only of digits
     *  and must be a well-formed ISBN-13
     * @param pages  the number of pages of the book, must be greater than 0
     */
    public PrintBook(String name, int pence, int howMany, String isbn, int pages) {
        super(name,pence,howMany);
        if(pages>=0 && Book.checkWellFormedISBN(isbn)==true){ 
            this.pages=pages;
            this.isbn=isbn;
        }
        else{
        throw new IllegalArgumentException("Please check the number of pages inserted or isbn number!");
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
     * Returns the Numbers of this Item.
     *
     * @return the Numbers of this Item left
     */
    public int getHowMany(){
    return super.getHowMany();
    }
    
    
    /**
     * Returns the name of this Item.
     *
     * @return the name of this Item
     */
    public String getName(){
            return super.getName();
    }
            
    public int getPages(){
        return this.pages;
    }
    
    
     /**
     * Returns the ISBN of this Item.
     *
     * @return the ISBN of this Item
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
        return super.toString() + "\nISBN: " + this.getISBN()
            + "\nPages: " + this.getPages();
    }
}

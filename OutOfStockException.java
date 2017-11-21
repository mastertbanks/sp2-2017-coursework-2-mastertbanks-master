/**
 * To be thrown when an Item is attempted to be sold when it is out of stock.
 *
 * @author Babatope Bankole
 */
public class OutOfStockException extends RuntimeException {
    /**
     * To be called when error is expected.
     *
     * @param To be used when error will be expected to occur in program
     */
    public OutOfStockException(){
        //to do
    }
   
   /**
     * To be called when error is expected with customised message.
     *
     * @param To be used when error will be expected to occur in program with customised message to display
     */
    public OutOfStockException(String message){
    super(message);
    }
}

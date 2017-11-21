/**
 * A DataItem is a file of digital data with a certain size in bytes.
 * It has a name and a price in pence.
 *
 *  * @author Babatope Bankole
 */
public abstract class DataItem extends Item {
    private long sizeBytes;
    public DataItem(String name, int pricePence, long sizeBytes ){
        super(name,pricePence);
        if(sizeBytes>=0){
            this.sizeBytes=sizeBytes;
    }
   }

    public boolean inStock(){
      return true;
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
     * Returns the SizeBytes of this Item.
     *
     * @return the SizeBYte of this Item
     */
    public long getsizeBytes(){
    return this.sizeBytes;
   }
   
    /**
     * Returns the name of this Item.
     *
     * @return the name of this Item
     */public String getName(){
    return super.getName();
   }
   
   /**
     * collect all information about item to be displayed.
     *
     * @param collect all information about item to be displayed .
     * @Override
     */
    @Override
    
    public String toString() {
        return super.toString() + "\n Size Bytes: " + this.sizeBytes;
    }
   
}

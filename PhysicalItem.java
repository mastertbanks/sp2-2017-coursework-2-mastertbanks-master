/**
 * A physical object (a chair, a clock, a bicycle, a jacket, ...).
 * It has a name and a price. At any time, a certain number of
 * (presumably identical) units of this item is in stock (at least 0).
 *
 *  @author Babatope Bankole
 */
public class PhysicalItem extends Item {
     private int howMany; 
    // TO DO

    /**
     * Constructs a new PhysicalItem according to the parameters.
     *
     * @param name  the name of this PhysicalItem; must not be null
     * @param pricePence  the price of the item in pence; must not be negative
     *  (0 is allowed)  
     * @param howMany  number of units we have of this PhysicalItem;
     *  must not be negative (0 is allowed)
     */
    public PhysicalItem(String name, int pricePence, int howMany) {
         super(name,pricePence);
        if (howMany < 0) {
            throw new IllegalArgumentException("Expected How Many >= 0; found "
                    + howMany);
        }
        else{
        this.howMany=howMany;
    } 
    }
    public boolean inStock(){
        boolean status;
    if(this.howMany>0){
    status=true;
    }
     else{ status= false;}
     return status;
    }

    /**
     * Returns the price of this Item in pence.
     *
     * @return the price of this Item in pence
     */
    public int computePricePence() {
        return super.computePricePence();
    }
    
    public int getHowMany(){
    return this.howMany;
    }
    /**
     * Returns the name of this Item.
     *
     * @return the name of this Item
     */
    public String getName(){
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
        return super.toString() + "\nUnits left: " + this.getHowMany();
    }
}

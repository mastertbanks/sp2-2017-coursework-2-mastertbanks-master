/**
 * A JPod is a PhysicalItem with a name, a price, and a number of units
 * in stock. Similar to PhysicalItem, but with a rather specific way of
 * computing the price due to its popularity when only few items are left
 * in stock.
 *
 *   @author Babatope Bankole
 */
public class JPod extends PhysicalItem {

    // TO DO

    /**
     * Constructs a new JPod according to the parameters.
     *
     * @param name  the name of this JPod
     * @param pricePence  the initial price of the item in pence;
     *  must not be negative (0 is allowed)
     * @param howMany  number of units we have of this JPod;
     *  must not be negative (0 is allowed)
     */
    public JPod(String name, int pricePence, int howMany) {
        super(name,pricePence,howMany);
    }

    /**
     * Check if item is in stock.
     *
     * @return true or false if item found or not
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
     * @return the Numbers of this Item
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
            

}

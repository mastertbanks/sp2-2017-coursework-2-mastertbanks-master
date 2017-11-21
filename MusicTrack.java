/**
 * A MusicTrack has a name, a price in pence, a size in bytes, and a duration
 * in seconds.
 *
 * @author Babatope Bankole
 */
public class MusicTrack extends DataItem {

    private int durationSeconds;

    /**
     * Constructs a MusicTrack according to the parameters.
     *
     * @param name  the name of the MusicTrack; must not be null
     * @param pricePence  the price in pence; must not be less than 0
     *  (0 itself is allowed) 
     * @param sizeBytes  the size of the MusicTrack in bytes;
     *  must be greater than 0
     * @param durationSeconds  the duration of the MusicTrack in seconds;
     *  must be greater than 0
     */
    public MusicTrack(String name, int pricePence, long sizeBytes, int durationSeconds) {
        super(name,pricePence,sizeBytes);
        if(durationSeconds>0){
            this.durationSeconds=durationSeconds;
        }
        else{ 
            throw new IllegalArgumentException("Please check the Duration of the music track again!");
        }
    }
    
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
     * Returns the SizeBytes of this Item.
     *
     * @return the SizeBYte of this Item
     */
    public long getSizeBytes(){
        return super.getsizeBytes();
    }
    
    
    /**
     * Returns the name of this Item.
     *
     * @return the name of this Item
     */
    public String getName(){
            return super.getName();
    }
    
    public int getDurationSeconds(){
        return this.durationSeconds;
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
            + "\nSeconds: " + this.getDurationSeconds();
    }
}

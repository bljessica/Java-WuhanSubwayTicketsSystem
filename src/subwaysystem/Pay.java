package subwaysystem;

public abstract class Pay {
	
    protected double distance;
    protected double fee;
    
    /**
     * count the fee
     */
    protected abstract double count();
    
}

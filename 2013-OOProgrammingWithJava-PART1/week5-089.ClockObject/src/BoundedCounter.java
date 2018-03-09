
public class BoundedCounter {
    private int value;
    private int upperLimit;
    
    public BoundedCounter(int upperLimit) {
        this.upperLimit = upperLimit;
        this.value = 0;
    }
    
    public void next() {
        if (this.value >= this.upperLimit) {
            this.value = 0;
        } else {
            this.value++;
        }
    }
    
    public String toString() {
        String stringVal = String.valueOf(this.value);
        if (this.value < 10) {
            stringVal = "0" + stringVal;
        }
        
        return stringVal;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        if (value < 0 || value > this.upperLimit) {
            return;
        }
        this.value = value;
    }
}

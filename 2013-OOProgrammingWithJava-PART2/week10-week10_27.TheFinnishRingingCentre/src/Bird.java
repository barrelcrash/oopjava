
public class Bird {

    private String name;
    private String latinName;
    private int ringingYear;

    public Bird(String name, String latinName, int ringingYear) {
        this.name = name;
        this.latinName = latinName;
        this.ringingYear = ringingYear;
    }
    
    public String getLatinName() {
        return this.latinName;
    }
    
    public int getRingingYear() {
        return this.ringingYear;
    }

    @Override
    public String toString() {
        return this.latinName + " (" + this.ringingYear + ")";
    }
    
    @Override
    public boolean equals(Object other) {
        if (other != null && getClass() == other.getClass()) {
            Bird bird = (Bird) other;
            return this.latinName.equals(bird.getLatinName())
                    && this.ringingYear == bird.getRingingYear();
        }
        
        return false;
    }
    
    @Override
    public int hashCode() {
        return this.ringingYear + this.latinName.hashCode();
    }
}



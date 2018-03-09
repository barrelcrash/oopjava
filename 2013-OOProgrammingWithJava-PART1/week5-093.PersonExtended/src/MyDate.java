
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int pv, int kk, int vv) {
        this.day = pv;
        this.month = kk;
        this.year = vv;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    /*
     * In assignment 92 method differneceInYears was added to MyDate 
     * Copy the method here since it eases this assignment considerably.
     */
    public int differenceInYears(MyDate compared) {
        MyDate lesserDate;
        MyDate greaterDate;
        
        if (this.earlier(compared)) {
            lesserDate = this;
            greaterDate = compared;
        } else {
            lesserDate = compared;
            greaterDate = this;
        }
        
        int lesserSubYear = 365 - ((lesserDate.month - 1) * 30) - lesserDate.day;
        int greaterSubYear = ((greaterDate.month - 1) * 30) + greaterDate.day;
        int fullYears = (Math.abs(this.year - compared.year) - 1) * 365;
        return (lesserSubYear + greaterSubYear + fullYears) / 365;
    }

  
}
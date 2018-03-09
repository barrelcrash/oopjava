public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
        this.year = year;
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

    public int differenceInYears(MyDate comparedDate) {
        MyDate lesserDate;
        MyDate greaterDate;
        
        if (this.earlier(comparedDate)) {
            lesserDate = this;
            greaterDate = comparedDate;
        } else {
            lesserDate = comparedDate;
            greaterDate = this;
        }
        
        int lesserSubYear = 365 - ((lesserDate.month - 1) * 30) - lesserDate.day;
        int greaterSubYear = ((greaterDate.month - 1) * 30) + greaterDate.day;
        int fullYears = (Math.abs(this.year - comparedDate.year) - 1) * 365;
        return (lesserSubYear + greaterSubYear + fullYears) / 365;
    }
}

package ProjectManageBook;

public class Date {
    private int day,month,year;

    public Date(int day,int month,int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }

    public int getDay(){
        return this.day;
    }
    public int getMonth(){
        return this.month;
    }
    public int getYear(){
        return this.year;
    }
    public void setDay(int d){
        this.day=d;
    }
    public void setMonth(int m){
        this.month=m;
    }
    public void setYear(int y){
        this.year=y;
    }

}

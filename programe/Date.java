package programe;

public class Date {
    private final int maxDysInAMonth = 30;
    private final int maxMonthInAYear =12;
    private int day;
    private int month;
    private int year;
    public Date(int day,int month,int year){
      this.day=day;
      this.month=month;
      this.year=year;
      if (isValidDate()==false){
          this.year = 2000;
          this.month = 1;
          this.day = 1;
          System.out.println("not legal");
      }else {
          System.out.println("legal");
      }
    }
    //פעם אבעה תיחתוב תקטה שמתיחסים לחודש ק30 ימים בהתחלה
    private boolean isValidDate(){
       if (day>maxDysInAMonth||month>maxMonthInAYear){
          return false;
       }else {
           return true;
       }
    }
    private boolean isLeapYear (int year) {
        return (this.year%4==0 && this.year%100!=0) || (this.year%400==0) ? true : false;
    }
    public String toString(){
        String StrDare;
        StrDare = ""+day+"/"+month+"/"+year;
        return StrDare;
    }
    public boolean equals(Date other){
        if (other.day==this.day&&other.month==this.month&&other.year==this.year) {
            return true;
        }else {
            return false;
        }
    }
    public boolean before(Date other){
        if (other.day<this.day&&other.month<this.month&&other.year<this.year) {
            return true;
        }else {
            return false;
        }
    }
    public void addDays(int num) {
        day += num;
        int numMonthToAdd;
        if (day>maxDysInAMonth){
            numMonthToAdd = day/maxDysInAMonth;
            day -= maxDysInAMonth*numMonthToAdd;
            month+=numMonthToAdd;
            if (month >maxMonthInAYear){
                int numOfYearsToAdd;
                numOfYearsToAdd=month/maxMonthInAYear;
                month -=numOfYearsToAdd*maxMonthInAYear;
                year += numOfYearsToAdd;
            }
        }
    }
}

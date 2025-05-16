package programe;

public class Date {
    private int day;
    private int month;
    private int year;
    public Date(int day,int month,int year){
      this.day=day;
      this.month=month;
      this.year=year;
      if (isValidDate()==false){
          year = 2000;
          month = 1;
          day = 1;
          System.out.println("not legal");
      }else {
          System.out.println("legal");
      }
    }
    private boolean isValidDate(){
        switch (month){
            case 1:
                if (day>31){return false;}
                break;
            case 2:
                if (day>28){return false;}
                break;
            case 3:
                if (day>31){return false;}
                break;
            case 4:
                if (day>30){return false;}
                break;
            case 5:
                if (day>31){return false;}
                break;
            case 6:
                if (day>30){return false;}
                break;
            case 7:
                if (day>31){return false;}
                break;
            case 8:
                if (day>31){return false;}
                break;
            case 9:
                if (day>30){return false;}
                break;
            case 10:
                if (day>31){return false;}
                break;
            case 11:
                if (day>30){return false;}
                break;
            case 12:
                if (day>31){return false;}
                break;
        }
        if (month>12&&year >-1){
            return false;
        }
        return true;
    }
    private boolean isLeapYear (int year) {
        return (this.year%4==0 && this.year%100!=0) || (this.year%400==0) ? true : false;
    }
}

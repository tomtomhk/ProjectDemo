package daysmonthV1;

public class DaysNuminMonthV1 {
    LeapYearV1 leapYear;
    
    public DaysNuminMonthV1(LeapYearV1 leapYear){
        this.leapYear = leapYear;
    }
    
    public int getDaysNuminMonth(int month, int year){
        int daysNum;
        if(year < 1){
            daysNum = -1;
            return daysNum;
        }
        
        boolean isLeapYear = leapYear.isLeapYear(year);
        daysNum = MonthV1.daysInMonth(month, isLeapYear);
        
        return daysNum;
    }
}



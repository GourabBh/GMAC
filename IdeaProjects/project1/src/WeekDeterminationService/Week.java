package WeekDeterminationService;

public class Week {
    int day, month, year;
    Week(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    Week() {}
    public int validateDate(Week w){
        //check year validity
        int d = w.day, m = w.month, y = w.year;
        if(year >= 1800 && y <= 2999){
            //check month validity
            if(m >= 1 && m <= 12){
                //check day validity
                if(d >= 1 && d <= 31){
                    if((d >= 1 && d <= 30) && (m == 4 || m == 6 || m == 9 || m == 11))
                        return 1; //valid date
                    else if((d >= 1 && d <= 30) && (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12))
                        return 1; //valid date
                    else if((d >= 1 && d <= 28) && (m == 2))
                        return 1; //valid date
                    else if(d == 29 && m == 2 && ((y % 400 == 0) || (y % 4 == 0 && y % 4 != 0)))
                        return 1;
                    else
                        return 0;
                }
                else{
                    return 0;
                }
            }
            else{
                return 0;
            }
        }
        else{
            return 0;
        }
    }

    public int weekDay(Week w){
        int wday = 0, day = w.day, month = w.month, year = w.year;
        wday = (day + ((153 * (month + 12 * ((14 - month) / 12) - 3) + 2) / 5) +
                (365 * (year + 4800 - ((14 - month) / 12)))
                + ((year + 4800 - ((14 - month) / 12)) / 4)
                - ((year + 4800 - ((14 - month) / 12)) / 100)
                + ((year + 4800 - ((14 - month) / 12)) / 400)
                - 32045)
        % 7;
        return wday;
    }
}

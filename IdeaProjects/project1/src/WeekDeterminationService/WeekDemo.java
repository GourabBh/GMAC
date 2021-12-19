package WeekDeterminationService;

public class WeekDemo {
    public static void main(String[] args) {

        int wDayNo;
        String dayNames[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        Week w = new Week(22, 2, 2015);
        if(w.validateDate(w) == 1){
            System.out.println("Date is correct!");
            wDayNo = w.weekDay(w);
            System.out.println("Week day is : "+dayNames[wDayNo]);
        }
        else{
            System.out.println("Date is incorrect");
        }

    }
}

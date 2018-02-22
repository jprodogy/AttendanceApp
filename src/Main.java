import java.time.LocalDate;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        ArrayList<Record> RList = new ArrayList<>();
        RList.add(new Record(10, "Jordan", LocalDate.of(2018, 3, 26)));
        RList.add(new Record(15, "Chris", LocalDate.of(2018, 7, 18)));
        RList.add(new Record(3, "James", LocalDate.of(2018, 5, 2)));
        RList.add(new Record(7, "Michael", LocalDate.of(2017, 12, 1)));
        RList.add(new Record(4, "Connor", LocalDate.of(2018, 2, 17)));
        RList.add(new Record(11, "John", LocalDate.of(2017, 10, 23)));
        RList.add(new Record(17, "Carl", LocalDate.of(2017, 8, 9)));

        // which students have the least absences
        String lowName = RList.get(0).getName();
        int lowAbsences = RList.get(0).getAbsence();
        for (int i = 0; i < RList.size(); i++) {
            if (lowAbsences > RList.get(i).getAbsence()){
                lowAbsences = RList.get(i).getAbsence();
                lowName = RList.get(i).getName();
            }
        }

        //


    }
}



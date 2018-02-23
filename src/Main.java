import java.time.LocalDate;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);

        System.out.println(records(3));





    }

    public static ArrayList<Record> records(int numRec){
        ArrayList<Record> records = new ArrayList<>();
        Random rand = new Random();
        ArrayList<String> names = new ArrayList<>();
        names.add("Jordan");
        names.add("Chris");
        names.add("James");
        names.add("Michael");
        names.add("Connor");
        names.add("John");
        names.add("Carl");
        names.add("Robert");
        names.add("Mark");
        names.add("Myles");
        names.add("Kenny");
        names.add("Thomas");
        for (int i = 0; i < numRec; i++) {
            String uniName = names.get(rand.nextInt(12));
            int abs = rand.nextInt(20);
            LocalDate dates = LocalDate.now().minusDays(rand.nextInt(30)).minusMonths(rand.nextInt(12)).minusYears(rand.nextInt(10));
            records.add(new Record(abs, uniName, dates));
        }
        return records;
    }

    /*
    // which students have the least absences
    public static ArrayList<String> NameLeastAbsences(){
        String leastAbs = record.get(0).getName();
        int lowAbsences = record.get(0).getAbsence();
        for (int i = 0; i < record.size(); i++) {
            if (lowAbsences > record.get(i).getAbsence()){
                lowAbsences = record.get(i).getAbsence();
                leastAbs = record.get(i).getName();
            }
        }
    }*/
}



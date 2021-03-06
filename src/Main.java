import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.*;

public class Main {
    static final int RANGE_OF_DAYS = 30;
    static final int RANGE_OF_MONTHS = 12;
    static final int RANGE_OF_YEARS = 10;
    static final int NUM_ABSENCES = 20;
    static final int NUM_DAYS_FE = 20;


    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);

        ArrayList<Record> records = RecordGener(20);
        System.out.println(records);


        ArrayList<String> studentsWithMinAbsences = NameLeastAbsences(records);
        System.out.println(studentsWithMinAbsences);

        ArrayList<String> studentNamesFE = StudentsFE(records, NUM_DAYS_FE);
        System.out.println(studentNamesFE);







    }

    public static ArrayList<Record> RecordGener(int numRec){

        ArrayList<Record> records = new ArrayList<>();
        Random rand = new Random();
        ArrayList<String> names = new ArrayList<>();
        String[] approvedNames = { "Jordan", "Chris", "James", "Michael", "Connor", "John", "Carl", "Robert", "Mark", "Myles", "Kenny", "Thomas"};
        names.addAll(Arrays.asList(approvedNames));
        for (int i = 0; i < numRec; i++) {
            String uniName = names.get(rand.nextInt(approvedNames.length));
            int abs = rand.nextInt(NUM_ABSENCES);
            LocalDate dates = LocalDate.now().minusDays(rand.nextInt(RANGE_OF_DAYS)).minusMonths(rand.nextInt(RANGE_OF_MONTHS)).minusYears(rand.nextInt(RANGE_OF_YEARS));
            records.add(new Record(abs, uniName, dates));
        }
        return records;
    }

    public static int Minimum(ArrayList<Record> record){
        int lowAbsence = record.get(0).getAbsence();
        for (Record myRecord: record) {
            if (lowAbsence > myRecord.getAbsence()) {
                lowAbsence = myRecord.getAbsence();
            }
        }
        return lowAbsence;
    }

    // which students have the least absences/ still figuring out how to do this
    public static ArrayList<String> NameLeastAbsences(ArrayList<Record> record){
        ArrayList<String> leastAbsNames = new ArrayList<>();
        int min = Minimum(record);
        for (Record myRecord: record) {
            if (min == myRecord.getAbsence()) {
                leastAbsNames.add(myRecord.getName());
            }
        }
        return leastAbsNames;
    }

    public static ArrayList<String> StudentsFE(ArrayList<Record> record, int FE){
        ArrayList<String> studentFe = new ArrayList<>();
        for(Record myRecord: record){
            if (FE <= myRecord.getAbsence()){
                studentFe.add(myRecord.getName());
            }
        }
        return studentFe;
    }


    public static LocalDate FELastAbsDate(ArrayList<Record> record, ArrayList<String> names){
        LocalDate lowDate = record.get(0).getDateOfLastAbsence();
        for (int i = 0; i < record.size(); i++) {
            if (lowDate.isBefore(lowDate) && record.get(i).getName() == names.get(i)) {
                lowDate = record.get(i).getDateOfLastAbsence();
            }
        }
        return lowDate;

    }

}




import java.time.LocalDate;

public class Record {
    private int absence;
    private String name;
    private LocalDate dateOfLastAbsence;
    private LocalDate dateAllAbsent;
    private LocalDate lastDateAttendance;

    public Record(){


    }

    public int getAbsence(){
        return absence;
    }

    public String getName(){
        return name;
    }

    public LocalDate getDateOfLastAbsence(){
        return dateOfLastAbsence;
    }




}

import java.time.LocalDate;
import java.util.Objects;

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

    public LocalDate getDateAllAbsent(){
        return dateAllAbsent;
    }

    public LocalDate getLastDateAttendance(){
        return lastDateAttendance;
    }

    public void setAbsence(int abs) {
        absence = abs;
    }

    public void  setName(String n){
        name = n;
    }

    public void setDateOfLastAbsence(LocalDate date){
        dateOfLastAbsence = date;
    }

    public void setDateAllAbsent(LocalDate date){
        dateAllAbsent = date;
    }

    public void setLastDateAttendance(LocalDate date){
        lastDateAttendance = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }else {
            return false;
        }

    }

    @Override
    public String toString() {
        return "Record{" +
                "absence=" + absence +
                ", name='" + name + '\'' +
                ", dateOfLastAbsence=" + dateOfLastAbsence +
                ", dateAllAbsent=" + dateAllAbsent +
                ", lastDateAttendance=" + lastDateAttendance +
                '}';
    }
}

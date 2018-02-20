import java.time.LocalDate;
import java.util.Objects;

public class Record {
    private int absence;
    private String name;
    private LocalDate dateOfLastAbsence;

    public Record(int abs, String n, LocalDate date) {
        absence = abs;
        name = n;
        dateOfLastAbsence = date;
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


    public void setAbsence(int abs) {
        absence = abs;
    }

    public void  setName(String n){
        name = n;
    }

    public void setDateOfLastAbsence(LocalDate date){
        dateOfLastAbsence = date;
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
                '}';
    }
}

import java.time.LocalDate;
import java.util.Objects;

public class Record {
    private int absence;
    private String name;
    private LocalDate dateOfLastAbsence;


    public Record() {
        absence = 0;
        name = "";
        dateOfLastAbsence = null;
    }

   public Record(int abs, String n, LocalDate date){
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
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Record record = (Record) o;
        return absence == record.absence &&
                Objects.equals(name, record.name) &&
                Objects.equals(dateOfLastAbsence, record.dateOfLastAbsence);
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

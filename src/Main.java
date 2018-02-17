import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);

        //add a welcome message for the user
        System.out.println("\n\nHello, AttendanceApp!\n");

        //read the users name
        System.out.println("What is your name?");
        String name = keyb.next();
        attendance absences = new attendance(name);

        /*
        //output a welcome message
        String name = displayWelcomeMessage();

        //create absences
        ArrayList<Attendance> absences = createRandomAbsences(name.length(), 10);

         */

        //elements of the array
        ArrayList elements = absences.elements();
        System.out.println("The elements are " + elements);

        //how many students had perfect attendance
        int perfect = absences.perfectA();
        System.out.println(perfect + " people had perfect attendance\n");

        //average of all absences
        int average = absences.average();
        System.out.println("The average is of absences is " + average);

        //
        double perfectPer = absences.perfectPercent();
        System.out.printf("\n%.0f percent\n", perfectPer);

        //
        System.out.println("How many absences?");
        int x = keyb.nextInt();

        System.out.println("Indexes:" + absences.absence(x));


        System.out.println("What is y?");
        int y = keyb.nextInt();
        System.out.println("What is x?");
        int x1 = keyb.nextInt();
        System.out.println(absences.absenceCh(y, x1));
        System.out.println(absences.sortAbs());
        System.out.println(absences.shuffle());
        System.out.println("There are " + absences.UniqueAbs() + " absences");
        System.out.println(absences.absenceVal());
        System.out.println(absences.USort());
        System.out.println(absences.URandom());


    }


    /*
    public static String displayWelcomeMessage(){

    }

    public static ArrayList<Integer> createRandomAbsences(int length, int i){

    }
    */
}



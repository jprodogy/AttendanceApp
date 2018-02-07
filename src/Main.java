import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        //add a welcome message for the user
        System.out.println("\n\nHello, AttendanceApp!\n");

        //read the users name and output it as the apps welcome message
        System.out.println("What is your name?");
        String name = keyb.next();
        System.out.printf("Hello %s, AttendanceApp!\n\n", name);

        attendance attApp = new attendance(name);

        System.out.println(attApp.perfectA() +  " people had perfect attendance\n");
        System.out.println("The average is of absences is " + attApp.average());
        System.out.printf("\n%.0f percent\n", attApp.perfectPercent());
        attApp.absence();
        attApp.absenceCh();
        attApp.sortAbs();
        attApp.shuffle();
        System.out.println("There are " + attApp.UniqueAbs() + " absences");
        attApp.absenceVal();
        System.out.println(attApp.USort());

    }
}



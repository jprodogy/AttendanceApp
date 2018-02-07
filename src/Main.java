import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        //add a welcome message for the user
        System.out.println("\n\nHello, AttendanceApp!\n");

        //read the users name, output it as the apps welcome message
        System.out.println("What is your name?");
        String name = keyb.next();
        System.out.printf("Hello %s, AttendanceApp!\n\n", name);

        attendance attApp = new attendance(name);

        System.out.println("The elements are " + attApp.elements());
        System.out.println(attApp.perfectA() +  " people had perfect attendance\n");
        System.out.println("The average is of absences is " + attApp.average());
        System.out.printf("\n%.0f percent\n", attApp.perfectPercent());
        System.out.println("How many absences?");
        int x = keyb.nextInt();
        System.out.println("Indexes:" + attApp.absence(x));
        System.out.println("What is y?");
        int y = keyb.nextInt();
        System.out.println("What is x?");
        int x1 = keyb.nextInt();
        System.out.println(attApp.absenceCh(y, x1));
        System.out.println(attApp.sortAbs());
        System.out.println(attApp.shuffle());
        System.out.println("There are " + attApp.UniqueAbs() + " absences");
        System.out.println(attApp.absenceVal());
        System.out.println(attApp.USort());
        System.out.println(attApp.URandom());

    }
}



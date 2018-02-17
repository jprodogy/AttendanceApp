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

        //find percentage of students with perfect attendance out of people with lesser than 3 absences
        double perfectPer = absences.perfectPercent();
        System.out.printf("\n%.0f percent\n", perfectPer);

        //Which students had [X] absences?
        System.out.println("How many absences?");
        int x = keyb.nextInt();
        ArrayList<Integer> xAbs = absences.absence(x);
        System.out.println("Indexes:" + xAbs);

        //Add x to any absences greater than y
        System.out.println("What is y?");
        int y = keyb.nextInt();
        System.out.println("What is x?");
        int x1 = keyb.nextInt();
        System.out.println(absences.absenceCh(y, x1));

        //Sort the absences using a library function.
        ArrayList<Integer> sortList = absences.sortAbs();
        System.out.println(sortList);

        //Shuffle the absences using a library function.
        ArrayList<Integer> randList = absences.shuffle();
        System.out.println(absences.shuffle());

        //How many absences are unique?
        int Unique = absences.UniqueAbs();
        System.out.println("There are " + Unique + " absences");

        //How many of each absence value are there?
        Map<Integer, ArrayList<String>> absVal = absences.absenceVal();
        System.out.println(absVal);

        //write a user defined sort function
        ArrayList<Integer> USortList = absences.USort();
        System.out.println(USortList);

        //write a user defined random function
        ArrayList<Integer> URandList = absences.URandom();
        System.out.println(URandList);


    }


    /*
    public static String displayWelcomeMessage(){

    }

    public static ArrayList<Integer> createRandomAbsences(int length, int i){

    }
    */
}



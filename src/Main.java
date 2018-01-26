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

        //create then output the list of absences
        ArrayList<Integer> absList = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < name.length(); i++) {
            absList.add(rand.nextInt(11));
        }
        System.out.println("The elements are " + absList);

        //calculate how many students had perfect attendance
        int count = 0;
        for (int i = 0; i < absList.size(); i++) {
            if (absList.get(i) == 0){
                count++;
            }
        }
        System.out.println(count +  " people had perfect attendance");

        //what is the average of all absences
        int sum = 0;
        int average = 0;
        for (int i = 0; i < absList.size() ; i++) {
            sum += absList.get(i);
        }
        average = sum / absList.size();
        System.out.println("The average is of absences is " + average);

        //find percentage of students with perfect attendance out of people with lesser than 3 absences
        double percent = 0;
        double count2 = 0;
        for (int i = 0; i < absList.size(); i++) {
            if (absList.get(i) <= 3){
                count2++;
            }
        }
        percent = (count / count2) * 100;
        System.out.printf("%.0f percent\n", percent);

        //Which students had [X] absences?
        System.out.println("How many absences?");
        int x = keyb.nextInt();
        ArrayList<Integer> xppl = new ArrayList<>();

        for (int i = 0; i < absList.size(); i++) {
            if (absList.get(i) == x){
                xppl.add(i);
            }
        }
        System.out.println("Indexes" + xppl);

        //Add x to any absences greater than y
        System.out.println("What Index would you like to change.");
        int x1 = keyb.nextInt();
        System.out.println("How many absences?");
        int y = keyb.nextInt();
        for (int i = 0; i < absList.size(); i++) {

        }







    }
}



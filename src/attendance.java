import java.util.*;

public class attendance {
    Scanner keyb = new Scanner(System.in);
    private ArrayList<Integer> absList;

    //create then output the list of absences
    public attendance(String name){
        absList = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < name.length(); i++) {
            absList.add(rand.nextInt(11));
        }
        System.out.println("The elements are " + absList);
    }

    //calculate how many students had perfect attendance
    public int perfectA(){
        int count = 0;
        for (int i = 0; i < absList.size(); i++) {
            if (absList.get(i) == 0){
                count++;
            }
        }
       return count;
    }

    //what is the average of all absences
    public int average(){
        int sum = 0;
        int average = 0;
        for (int i = 0; i < absList.size() ; i++) {
            sum += absList.get(i);
        }
        average = sum / absList.size();
        return average;
    }

    //find percentage of students with perfect attendance out of people with lesser than 3 absences
    public double perfectPercent(){
        double percent = 0;
        double count2 = 0;
        for (int i = 0; i < absList.size(); i++) {
            if (absList.get(i) <= 3){
                count2++;
            }
        }
        percent = (perfectA() / count2) * 100;
        return percent;
    }

    //Which students had [X] absences?
    public void absence(){
        System.out.println("How many absences?");
        int x = keyb.nextInt();
        ArrayList<Integer> xppl = new ArrayList<>();

        for (int i = 0; i < absList.size(); i++) {
            if (absList.get(i) == x){
                xppl.add(i);
            }
        }
        System.out.println("Indexes: " + xppl);;
    }

    //Add x to any absences greater than y
    public void absenceCh(){
        System.out.println("What is y?");
        int y = keyb.nextInt();
        System.out.println("What is x?");
        int x1 = keyb.nextInt();
        for (int i = 0; i < absList.size(); i++) {
            if (y < absList.get(i)){
                x1 += absList.get(i);
                if (x1 < 0){
                    absList.set(i, 0);
                }else if(x1 > 15){
                    absList.set(i, 15);
                }else{
                    absList.set(i, x1);
                }
            }
        }
        System.out.println(absList);
    }

    //Sort the absences using a library function.
    public void sortAbs(){
        Collections.sort(absList);
        System.out.println(absList);
    }

    //Shuffle the absences using a library function.
    public void shuffle(){
        Collections.shuffle(absList);
        System.out.println(absList);
    }

    //How many absences are unique?
    public int UniqueAbs(){
        Set<Integer> Uni = new HashSet<>(absList);
        int UniqueI = absList.size() - Uni.size();
        return UniqueI;
    }

    //How many of each absence value are there?
    public int absenceVal(){
        Map<Integer, String> intMap = new HashMap<>();
        for (int i = 0; i < absList.size(); i++) {
            intMap.put(absList.get(i), "*");
        }
        System.out.println(intMap.get(15));
        return 0;
    }
}

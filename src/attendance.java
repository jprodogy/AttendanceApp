import java.util.*;

public class attendance {
    private ArrayList<Integer> absList;
    private ArrayList<Integer> sortList;
    private ArrayList<Integer> randList;
    private ArrayList<String> namesList;
    private ArrayList<String> randNList;
    private Random rand;


    //*create then output the list of absencesgafdsgafd
    hello world
    public attendance(String name){
        absList = new ArrayList<>();
        rand = new Random();
        for (int i = 0; i < name.length(); i++) {
            absList.add(rand.nextInt(11));
        }

    }

    public ArrayList<Integer> elements(){
        return absList;
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

    //*Which students had [X] absences?
    public ArrayList<Integer> absence(int x){
        ArrayList<Integer> xppl = new ArrayList<>();

        for (int i = 0; i < absList.size(); i++) {
            if (absList.get(i) == x){
                xppl.add(i);
            }
        }
        return xppl;
    }

    //*Add x to any absences greater than y
    public ArrayList<Integer> absenceCh(int y, int x1){
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
        return absList;
    }

    //*Sort the absences using a library function.
    public ArrayList<Integer> sortAbs(){
        Collections.sort(absList);
        return absList;
    }

    //*Shuffle the absences using a library function.
    public ArrayList<Integer> shuffle(){
        Collections.shuffle(absList);
        return absList;
    }

    //How many absences are unique?
    public int UniqueAbs(){
        Set<Integer> Uni = new HashSet<>(absList);
        int UniqueI = absList.size() - Uni.size();
        return UniqueI;
    }

    //*How many of each absence value are there?
    public Map<Integer, ArrayList<String>> absenceVal(){
        Map<Integer, ArrayList<String>> intMap = new HashMap<>();
        for (int j = 0; j <= 15; j++) {
            ArrayList<String> intList = new ArrayList<>();
            for (int i = 0; i < absList.size(); i++) {
                if (j == absList.get(i)){
                    intList.add("*");
                }
            }
            intMap.put(j, intList);
        }
       return intMap;
    }

    //write a user defined sort function
    public ArrayList<Integer> USort(){
        sortList = new ArrayList<>();
        for (int i = 0; i < 16; i++) {
            if (absList.contains(i)){
                for (int j = 0; j < absList.size(); j++) {
                    if (i == absList.get(j))
                    sortList.add(absList.get(j));
                }
            }
        }
        return sortList;
    }

    //write a user defined random function
    public ArrayList<Integer> URandom(){
        randList = new ArrayList<>();
        rand = new Random();
        for (int i = 0; i < absList.size(); i++) {
            randList.add(rand.nextInt(randList.size() + 1), absList.get(i));
        }
        return randList;
    }

    public ArrayList<String> namesGen() {
        namesList = new ArrayList<>();
        namesList.add("Chris");
        namesList.add("Thomas");
        namesList.add("Joseph");
        namesList.add("Connor");
        namesList.add("Lorien");
        return namesList;
    }

    public ArrayList<String> shuffleNames(){
        rand = new Random();
        randList = new ArrayList<>();
        for (int i = 0; i < namesList.size(); i++) {
            randNList.add(rand.nextInt(randList.size() + 1), namesList.get(i));
        }
        return randNList;
    }

    //Using the 5 names, create another list that has the same size as the absences list.
    public ArrayList<String> newAbsList() {
        ArrayList<String> newabsList1 = new ArrayList<>();
        for (int i = 0; i < absList.size(); i++) {

        }
        return newabsList1;
    }
}

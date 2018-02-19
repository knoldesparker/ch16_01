import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

public class ex02 {
    public static void main(String[] args) {
        LinkedIntList list = new LinkedIntList(); //Makes a linklist using the LinkedIntList
        LinkedIntList list2 = new LinkedIntList();
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);
        list.add(10);
        //Adds values

        //uses method with the list
        max(list);
        max(list2); //Idk how to display an exseption..
    }
    public static void max (LinkedIntList list) {
        int max = 0; //makes a max int to save the maximum value
            for (int i = 0; i < list.size(); i++) { // runs thu the list length
                if (list.get(i) > max) { //
                    max = list.get(i);
                }
                if (list.size() == 0){
                    //throw (NoSuchElementException);
                }
            }
        System.out.println(max);

    }

}

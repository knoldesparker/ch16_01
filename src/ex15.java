import com.sun.org.apache.xpath.internal.operations.And;

import java.util.List;

public class ex15 {
    public static void main(String[] args) {
        LinkedIntList list = new LinkedIntList();
        LinkedIntList list2 = new LinkedIntList();

        //list 1
        list.add(1);
        list.add(2);
        list.add(3);

        //list 2
        list2.add(3);
        list2.add(2);
        list2.add(1);

        System.out.println(notEqual(list,list2));
    }

    public static boolean notEqual(LinkedIntList list1, LinkedIntList list2){

        for (int i = 0; i < list1.size() ; i++) {
            if(list1.get(i) == list2.get(i)) { //Compares the i values
                if (list1.size() == list2.size()) { //Compares the size value
                    return true;}
            }else{
                return false; }
        }
        return false; }
}

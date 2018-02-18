import java.util.List;

public class ex01 {
    public static void main(String[] args) {
        LinkedIntList list = new LinkedIntList();

        list.add(0, 5);
        list.add(1, 10);
        list.add(2,15);
        list.add(3,20);
        System.out.println(list);
        set(list, 1, 5);
        System.out.println(list);
        System.out.println(list.get(1)); //display the value of index 1
    }

    public static void set(LinkedIntList list, int index, int value) {
        ListNode k = list.nodeAt(index); //Edit the ListNode method from private to public in order to use the nodeAt
        k.data = value;                  //Set the value at the note to the value from the method call

    }
}

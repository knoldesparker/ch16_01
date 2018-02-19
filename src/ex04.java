import java.util.List;

public class ex04 {
    public static void main(String[] args) {
        LinkedIntList list = new LinkedIntList();
        list.add(1);
        list.add(18);
        list.add(2);
        list.add(7);
        list.add(18);
        list.add(39);
        list.add(18);
        list.add(40);

        lastIndexOf(list,18);

    }
    public static void lastIndexOf (LinkedIntList list, int value){
    int a = 0;
        for (int i = 0; i < list.size(); i++) {
            if(value == list.get(i)){
                a = i;
            }

        }
        System.out.println(a);
    }
}

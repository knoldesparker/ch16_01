import java.util.NoSuchElementException;

public class ex07 {
    public static void main(String[] args) {
        LinkedIntList list = new LinkedIntList();

        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);
        deleteBack(list);

    }

    public static void deleteBack(LinkedIntList list){

        if (list.size() ==0){
            throw new NoSuchElementException();
        }else {
            System.out.println(list);
            int listSize = list.size() -1;
            System.out.println(list.get(listSize));
            list.remove(listSize);
            System.out.println(list);
        }
    }



}

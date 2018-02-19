
public class ex05 {
    public static void main(String[] args) {
        LinkedIntList list = new LinkedIntList();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(3);
        list.add(3);
        list.add(6);
        list.add(9);
        list.add(15);
        list.add(15);
        list.add(23);
        list.add(23);
        list.add(23);
        list.add(40);
        list.add(40);

        countDuplicates(list);



    }
    public static void countDuplicates (LinkedIntList list){
        LinkedIntList compareList = new LinkedIntList();
        int dubs = 0;
        int pointer = 0;

        while (list.size() > compareList.size()){           //Runs while the list is bigger than the compare list
            if (compareList.contains(list.get(pointer))){  //checks if compare has the value in the list
                compareList.add(list.get(pointer));        //If true add the value to the list and add a value to dubs
                dubs++;
            } else {
                compareList.add(list.get(pointer));         //If list does not contain add the value
            }
            pointer++; //Makes the pointer move when it looks in the list.
        }
        System.out.println(dubs); }
}

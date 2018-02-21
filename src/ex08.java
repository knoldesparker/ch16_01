public class ex08 {
    public static void main(String[] args) {
        LinkedIntList list = new LinkedIntList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        switchPairs(list);
    }
    public static void switchPairs(LinkedIntList list){
        System.out.println(list); //Prinsts the list before swap
        for (int i = 0; i < list.size(); i++) { //Fori loop that look in the list
            int swip = list.get(i); //adds a value to be swap
            int swap = list.get(i)+1; //adds a second value to be swap

            list.set(i+1,swip); //swaps the values
            list.set(i,swap);   //swaps the values

            i++;

        }
        System.out.println(list); //prints the newly swaped list
    }
}

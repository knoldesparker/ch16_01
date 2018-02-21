public class ex09 {
    public static void main(String[] args) {
    LinkedIntList list = new LinkedIntList();

    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);

        System.out.println(stutter(list));
    }

    public static LinkedIntList stutter(LinkedIntList list)
    {
        System.out.println(list); //Prints out the normal list
        LinkedIntList temp = new LinkedIntList(); //makes a temp list to hold the doublet values

        for (int i = 0; i < list.size() ; i++) { //looks thou the list

            temp.add(temp.size(),list.get(i)); //Adds each value two times
            temp.add(temp.size(),list.get(i));
        }

        for (int i = 0; i < list.size();) { // Removes all the values form the list
            list.remove(i);
        }
        for (int k = 0; k < temp.size() ; k++) { //adds all the values from the temp list, containing the doubelt numbers
            list.add(temp.get(k));
        }
        return list;
    }
}

public class ex03 {
    public static void main(String[] args) {
        LinkedIntList list = new LinkedIntList();

        list.add(5);
        list.add(1);
        list.add(3);
        list.add(4);
        System.out.println(isSorted(list));
    }

    public static boolean isSorted(LinkedIntList list) {
        boolean isSort = false;

        int value = 0;
        for (int i = 0; i < list.size(); i++) { //trevers thugh the list
            if (list.get(i) >= value) { //if the value on the index matches the int variable its a sortet list
                value = list.get(i); //Sets the value to the
                isSort = true; //Sets sortet to true
            } else {
                isSort = false;
            }

        }
        return isSort; //returns soretet

    }
}

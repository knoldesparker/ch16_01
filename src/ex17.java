public class ex17 {
    public static void main(String[] args) {
        LinkedIntList list = new LinkedIntList();

        list.add(8);
        list.add(13);
        list.add(17);
        list.add(4);
        list.add(9);
        list.add(12);
        list.add(98);
        list.add(41);
        list.add(7);
        list.add(23);
        list.add(0);
        list.add(92);
        removeRange(list,1,5);

    }

    public static void removeRange (LinkedIntList list,int start, int end){
        System.out.println(list);
        for (int i = start; i < end; i++) {
            list.remove(start);

        }
        System.out.println(list);
    }
}

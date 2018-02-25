public class ex20 {
    public static void main(String[] args) {

        LinkedIntList list = new LinkedIntList();

        list.add(10);
        list.add(31);
        list.add(42);
        list.add(23);
        list.add(44);
        list.add(75);
        list.add(86);

        shift(list);

    }

    public static void shift(LinkedIntList list) {
        ListNode even = null; // even index
        ListNode lastEven = null; // last even index
        ListNode odd = null; // odd index
        ListNode lastOdd = null; // last odd index plads

        ListNode currentIndex = list.front;
        int i = 0;

        while(currentIndex != null) {               //runs while new value is found
            if(i % 2 == 0) {                        //if I is even
                if(even == null) {                  //if even is null set even to current index
                    even = currentIndex;
                    lastEven = currentIndex;
                } else {                            //if even has a value set evenLast to the found value. (last on list)
                    lastEven.next = currentIndex;
                    lastEven = currentIndex;
                }
                currentIndex = currentIndex.next;   //Moves to next list element
                lastEven.next = null;               //Sets the last index to null



            } else {                                //If I is a odd number
                if(odd == null) {                   //And if odd has null value
                    odd = currentIndex;             //Set odd to the value of currentIndex
                    lastOdd = currentIndex;
                } else {                            //If odd has a value
                    lastOdd.next = currentIndex;    //If odd has a value, set the lastOdd value in the list to the currentIndex value
                    lastOdd = currentIndex;
                }
                currentIndex = currentIndex.next;   //Iterator that looks thou the loop
                lastOdd.next = null;
            }
            i++;                                    //When a value/ number han been found, i++ to get to the next number in the list

        }
        list.front = even;                          //Sets all values in even to be first in the list
        lastEven.next = odd;                        //Sets the odd values to come after all the even values
        System.out.println(list);                   //Prints the list
    }
}


package Utils;



public class Printer {

    public static String printLinkedList(ListNode list){
        if(list==null)
            return "No suitable for this case";

        StringBuilder s = new StringBuilder();
        s.append('[');
        while(list != null){
            s.append(list.val);
            if(list.next != null) {
                s.append(',');
                s.append(' ');
            }
            list = list.next;
        }
        s.append(']');
        return s.toString();
    }

    public static String printArray(int[] array){

        if(array==null)
            return "No suitable for this case";

        StringBuilder s = new StringBuilder();
        s.append('[');
        for(int i=0; i<array.length; i++){
            s.append(array[i]);
            if(i<array.length-1) {
                s.append(',');
                s.append(' ');
            }
        }
        s.append(']');
        return s.toString();
    }
}

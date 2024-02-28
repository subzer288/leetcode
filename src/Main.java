import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        TwoSums twosums = new TwoSums(new int[]{2,7,11,15}, 9);
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers(l1, l2);
        ListNode sol = addTwoNumbers.solution();
        System.out.println(printArray(twosums.solution()));
        System.out.println(printLinkedList(sol));

    }

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
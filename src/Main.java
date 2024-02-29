import Problem.*;
import Utils.*;

public class Main {
    public static void main(String[] args) {

        System.out.println(LongestSubString.solution("abcabcbb"));
        System.out.println(Printer.printArray(TwoSums.solution(new int[]{2,7,11,15}, 9)));
        System.out.println(Printer.printLinkedList(
                AddTwoNumbers.solution(
                        new ListNode(2, new ListNode(4, new ListNode(3))),
                        new ListNode(5, new ListNode(6, new ListNode(4))))
        ));
        System.out.println(MedianOfTwoSortedArrays.solution(new int[]{1,2,3}, new int[]{4,5,6}));

    }




}
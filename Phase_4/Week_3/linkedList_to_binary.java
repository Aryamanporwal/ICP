package Phase_4.Week_3;
import java.util.*;
public class linkedList_to_binary {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public int getDecimalValue(ListNode head) {
        StringBuilder sb = new StringBuilder();
        while(head!= null){
            sb.append(head.val);
            head = head.next;
        }

        return Integer.parseInt(sb.toString(), 2);
    }

}

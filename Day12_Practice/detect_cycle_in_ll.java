package Day12_Practice;

public class detect_cycle_in_ll {
          public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
  public boolean hasCycle(ListNode head){
    if(head == null || head.next == null) return false;
    ListNode slow = head;
    ListNode fast = head;
    while(fast!=null){
        if(slow == null) return false;
        slow = slow.next;
        if(fast.next == null) return false;
        fast = fast.next.next;
        if(fast == slow){
            return true;
        }
    }
    return false;
  }
}

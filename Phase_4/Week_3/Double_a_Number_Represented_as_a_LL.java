package Phase_4.Week_3;

public class Double_a_Number_Represented_as_a_LL {
   public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
  static int crr = 0;
  public ListNode doubleIt(ListNode head){
    // int num = 0;
    // if(head == null) return null;
    // while(head.next != null){
    //     num  = num*10 + head.val;
    //     head = head.next;
    // }

    // num = 2*num;
    // String s = String.valueOf(num);
    // ListNode temp = null;
    // for(char ch : s.toCharArray()){
    //     temp.val = Integer.parseInt(ch+"");
    //     temp= temp.next;  
    // }
    // return temp;

    crr = 0;
        rec(head);
        if (crr == 0) {
            return head;
        }

        ListNode temp = new ListNode(crr, head);
        return temp;
    }

    public static void rec(ListNode node) {
        if (node == null) {
            return;
        }
        rec(node.next);
        int n = node.val * 2;
        int d = n % 10;
        node.val = d + crr;
        crr = n / 10;
    }
}


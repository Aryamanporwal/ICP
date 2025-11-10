package Day12_Practice;

public class reverse_nodes_in_k {

 public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

    class Solution {
        public int len(ListNode head){
            int count = 0;
            while(head!=null){
                count++;
                head = head.next;
            }
            return count;
        }

        public ListNode reverseKGroup(ListNode head, int k) {
            int N = len(head);
            int groups = N/k;
            ListNode prevHead = null;
            ListNode currHead = head;
            ListNode ansNode = null;
            for(int i = 0 ; i<groups ;i++ ){
                ListNode prev = null;
                ListNode curr = currHead;
                ListNode nextNode = null;
                for(int j = 0 ; j<k ; j++){
                    nextNode = curr.next;
                    curr.next = prev;
                    prev = curr;
                    curr = nextNode;
                }
                if(prevHead == null){
                    ansNode = prev;
                }
                else{
                    prevHead.next = prev;
                }
                prevHead = currHead;
                currHead = curr;
            }
            //link the last incomplete group and if last group was complete
            //currHead would be null
            prevHead.next = currHead;
            return ansNode;
        }
    }
}

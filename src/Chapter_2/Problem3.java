package Chapter_2;

public class Problem3 {
//    Implement an algorithm to delete a node in the middle of a single linked list, given only access to that node
        public static void main(String[] args) {
            System.out.println("Done in leetcode - 2095");
        }
        public static ListNode deleteMiddle(ListNode head) {
            if(head.next == null){
                return null;
            }
            ListNode p1 = head;
            ListNode returnedNode = head;
            int count = 1 ;
            while(head.next != null){
                head = head.next;
                count++;
            }
            for(int i = 0 ; i < count/2 -1 ; i++){
                p1 = p1.next;
            }
            p1.next = p1.next.next;
            return returnedNode;
        }

}

 class ListNode {
     int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

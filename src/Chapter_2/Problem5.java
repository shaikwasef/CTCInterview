package Chapter_2;

public class Problem5 {
    public static void main(String[] args) {
        System.out.println("Done on leet code 142");
    }

    public ListNode detectCycle(ListNode head) {
        if(head ==null || head.next == null ){
            return null;
        }
        ListNode slow = head.next;
        ListNode fast = head.next.next;

        while(slow !=null  && fast!=null && fast.next !=null && fast != slow){
            slow = slow.next ;
            fast= fast.next.next;
        }
        if(slow == null || fast == null || fast.next == null){
            return null;
        }
        while(head != slow){
            head = head.next;
            slow = slow.next;
        }

        return head;

    }

   class ListNode {
     int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }

}

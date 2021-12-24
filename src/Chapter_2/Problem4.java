package Chapter_2;

public class Problem4 {
    public static void main(String[] args) {
        System.out.println("Solved on leetcode-2");
    }
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode answer = new ListNode(l1.val + l2.val);
            ListNode returnedNode = answer;

            l1 = l1.next;
            l2 = l2.next;
            while(l1 !=null || l2!=null || answer !=null){
                if(answer.val >= 10){
                    ListNode newNode= new ListNode(answer.val / 10);
                    answer.val = answer.val%10;
                    answer.next = newNode;
                }
                if(l1 == null && l2 == null){
                    break;
                }
                ListNode newNode= new ListNode(0);
                if(l1 == null){
                    if(answer.next !=null){
                        answer.next.val += l2.val;
                    }else{
                        newNode.val = l2.val;
                    }
                    l2 = l2.next;

                }else if(l2 == null){
                    if(answer.next !=null){
                        answer.next.val += l1.val;
                    }else{
                        newNode.val = l1.val;
                    }
                    l1 = l1.next;

                }else{
                    if(answer.next !=null){
                        answer.next.val += l1.val  + l2.val;
                    }else{
                        newNode.val = l1.val + l2.val;
                    }
                    l2 = l2.next;
                    l1 = l1.next;
                }

                if(answer.next!=null){
                    answer = answer.next;
                }else{
                    answer.next = newNode;
                    answer = answer.next;
                }
            }
            return returnedNode ;
        }
      public class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
}

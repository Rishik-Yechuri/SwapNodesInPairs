class SwapNodesInPairs {
    public static void main(String[] args){
        try{
            SwapNodesInPairs obj = new SwapNodesInPairs();
            obj.run(args);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void run(String[] args){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        ListNode newHead = swapPairs(head);
        while(newHead!=null){
            System.out.print(newHead.val + " ");
            newHead = newHead.next;
        }
    }
    public ListNode swapPairs(ListNode head) {
        ListNode currNode = head;
        ListNode node1;
        ListNode node2;
        ListNode node3;
        ListNode node4;
        boolean keepGoing = true;
        if(head == null || head.next == null){
            return head;
        }
        head = head.next;
        while(keepGoing){
            //node1 = null;
            node4 = null;
            node2 = null;
            node3 = null;
            node1 = currNode;
            if(node1 == null || node1.next == null){
                keepGoing = false;
            }
            else{
                node2 = node1.next;
                if(node2 != null){
                    node3 = node2.next;
                    if(node3!=null){
                        node4 = node3.next;
                    }
                }
                node2.next = node1;
                if(node4==null){
                    node1.next = node3;
                }else{
                    node1.next = node4;
                }
                currNode = node3;
            }
        }
        return head;
    }
}
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode tail, point;
        ListNode newHead = new ListNode(0);

        newHead.next = head;
        point = newHead;
        tail = head;

        for ( int i = 0; i < n - 1 && tail.next != null; i++){
            tail = tail.next;
        }

        while (tail.next != null){
            point = point.next;
            tail = tail.next;
        }

        point.next = point.next.next;

        return newHead.next;
    }
} 

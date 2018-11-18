import java.util.LinkedList;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null)    return head;
        ListNode list = new ListNode(0);
        list.next = head;
        ListNode tail = list;
        ListNode point = list;
        LinkedList<ListNode> buffer = new LinkedList<>();


        loop: while (true){
            // 尾指针遍历 k 个结点
            for ( int i = 0; i < k; i++){
                tail = tail.next;

                if (tail == null)   break loop;
            }

            ListNode tmp = tail.next;

            while (point.next != tmp){
                buffer.addFirst(point.next);
                point.next = point.next.next;
            }
            while (!buffer.isEmpty()){
                point.next = buffer.getFirst();
                buffer.removeFirst();
                point = point.next;
            }
            point.next = tmp;
            tail = point;
        }

        return list.next;

    }
}

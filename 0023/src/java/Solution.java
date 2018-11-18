/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0)  return null;

        int len = lists.length;
        int last = len - 1;


        while (last >= 0 && lists[last] == null){
            last--;
        }

        if(last < 0)    return null;

        for (int i = 0; i <= last; i++){
            if (lists[i] == null){
                swap(lists, i, last);
                last--;
            }
        }

        ListNode head = new ListNode(0);
        ListNode point = head;

        while (last > 0){
            int min = 0, minValue = lists[0].val;

            for(int i = 0; i <= last;i++){
                if(minValue > lists[i].val){
                    min = i;
                    minValue = lists[i].val;
                }
            }
            point.next = lists[min];
            lists[min] = lists[min].next;
            point = point.next;
            if(lists[min] == null){
                swap(lists, min, last);
                last--;
            }
        }

        point.next = lists[last];

        return head.next;
    }

    private void swap(ListNode[] lists, int index, int last){

        ListNode tmp = lists[last];
        lists[last] = lists[index];
        lists[index] = tmp;
    }
}

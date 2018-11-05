public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int[] num = new int[2];
        int sum;
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode l = new ListNode(0);
        ListNode p = l;
        ListNode q = p;

        while(null != p1 && null != p2)
        {
            sum = p1.val + p2.val;
            num[0] = sum % 10;
            num[1] = sum / 10;

            q.val += num[0];
            num[1] += q.val / 10;
            q.val %= 10;
            q.next = new ListNode(num[1]);
            p = q;
            q = q.next;
            p1 = p1.next;
            p2 = p2.next;
        }

        if(null == p1)
            p.next = p2;
        else
            p.next = p1;

        while (0 != num[1])
        {
            if (null == p.next)
            {
                p.next = new ListNode(num[1]);
            }
            else
            {
                p.next.val += num[1];
            }
            num[1] = p.next.val / 10;
            p.next.val %= 10;
            p = p.next;

        }
        return l;
    }
}

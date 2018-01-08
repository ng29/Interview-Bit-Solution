public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start = head;
    ListNode slow = start, fast = start;
    for(int i=1; i<=n+1; i++)   {
        if(fast!=null)
        fast = fast.next;
        else    break;
    } if(fast == null) {
        start = start.next;
        return start;

    }
    while(fast != null) {
        slow = slow.next;
        fast = fast.next;
    }
    slow.next = slow.next.next;
    return start;
    }
}

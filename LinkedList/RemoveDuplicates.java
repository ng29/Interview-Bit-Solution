public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while(current!=null && current.next!=null)
            if(current.next.val>current.val) current = current.next;
            else current.next = current.next.next;
        return head;
    }
}

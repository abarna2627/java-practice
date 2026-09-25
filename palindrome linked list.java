lass Solution {
    public boolean isPalindrome(ListNode head) {
    if(head==null || head.next==null){
        return true;
    }
    ListNode slow=head;
    ListNode fast=head;
    while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
    }
    ListNode pn=null,nn=null;
    ListNode cn=slow;
    while(cn!=null){
        nn=cn.next;
        cn.next=pn;
        pn=cn;
        cn=nn;
    }
    ListNode first=head;
    ListNode second=pn;
    while(second!=null){
        if(first.val !=second.val){
            return false;}
            first=first.next;
            second=second.next;
        }
    return true;
    }
}
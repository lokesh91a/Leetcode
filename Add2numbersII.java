public class Add2numbersII {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode h1 = null;
        reverse(h1, l1);
        ListNode h2 = null;
        reverse(h2, l1);
        int sum = 0, carry  = 0;
        ListNode head = null;
        ListNode current = null;
        while(h1!=null && h2!=null){
            sum = h1.val + h2.val + carry;
            if(sum>9)     {
                carry = 1;
                sum -= 10;
            }
            else carry = 0;
            if(head==null)   {
                head = new ListNode(sum);
                current = head;
            }
            else{
                current.next = new ListNode(sum);
                current = current.next;
            }
            h2 = h2.next;
            h1 = h1.next;
        }
        while(h1!=null){
            sum = h1.val + carry;
            if(sum>9)     {
                carry = 1;
                sum -= 10;
            }
            else carry = 0;
            current.next = new ListNode(sum);
            current = current.next;
            h1 = h1.next;
        }
        while(h2!=null){
            sum = h2.val + carry;
            if(sum>9)     {
                carry = 1;
                sum -= 10;
            }
            else carry = 0;
            current.next = new ListNode(sum);
            current = current.next;
            h2 = h2.next;
        }
        if(carry==1){
            current.next = new ListNode(1);
            current = current.next;
        }

        ListNode finalHead = null;
        reverse(finalHead, head);
        return finalHead;
    }

    public ListNode reverse(ListNode head, ListNode current){
        if(current.next==null){
            head = current;
            return current;
        }
        ListNode temp = reverse(head, current.next);
        temp.next = current;
        System.out.println(current.val);
        return current;
    }

}
package node.listNode;


public class ListNode {
    public int val;
    public ListNode next;
    private static ListNode head = new ListNode();
    private static ListNode cur = head;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNodeBuild build() {
        return new ListNodeBuild();
    }

    @Override
    public String toString() {
        return val + "  " + next;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

     public static class ListNodeBuild {

        public ListNodeBuild() {

        }

        public ListNodeBuild add(Integer val) {
            cur.next = new ListNode(val);
            cur = cur.next;
            return this;
        }

        public ListNode build() {
            return head.next;
        }
    }
}

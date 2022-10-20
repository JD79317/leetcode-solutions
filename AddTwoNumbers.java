public class AddTwoNumbers {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    public ListNode addTwoNumbers(ListNode first, ListNode second) {
        ListNode result = null;
        boolean carry = false;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            int sum = 0;
            boolean add = false;
            if (first != null) {
                add = true;
                sum += first.val;
                first = first.next;
            }
            if (second != null) {
                add = true;
                sum += second.val;
                second = second.next;
            }
            if (carry) {
                add = true;
                sum += 1;
                carry = false;
            }

            if (sum > 9) {
                sum = sum - 10;
                carry = true;
                list.add(sum);
            } else {
                if (sum == 0 && !add) {
                    break;
                } else {
                    list.add(sum);
                }
            }

        }
        for (int i = list.size() - 1; i >= 0; i--) {
            result = new ListNode(list.get(i), result);
        }
        return result;
    }
}

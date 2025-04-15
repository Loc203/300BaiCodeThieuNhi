package problems;
/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 *
 *
 * Example 1:
 *
 *
 * Input: l1 = [2,4,3], l2 = [5,6,4]
 * Output: [7,0,8]
 * Explanation: 342 + 465 = 807.
 * Example 2:
 *
 * Input: l1 = [0], l2 = [0]
 * Output: [0]
 * Example 3:
 *
 * Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
 * Output: [8,9,9,9,0,0,0,1]
 *
 *
 * Constraints:
 *
 * The number of nodes in each linked list is in the range [1, 100].
 * 0 <= Node.val <= 9
 * It is guaranteed that the list represents a number that does not have leading zeros.*/

public class problem2 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, current = dummyHead;
        int memory = 0;

        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int temp = memory + x + y;

            memory = 0;
            if (temp >= 10) {
                temp = temp % 10;
                memory = 1;
            }
            current.next = new ListNode(temp);
            current = current.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (memory > 0) {
            current.next = new ListNode(1);
        }

        return dummyHead.next;
    }

    /**
     * Ta return dummyHead.next thay vì current vì dummyHead chỉ là một node giả được tạo ra để giúp dễ dàng xây dựng danh sách liên kết kết quả.
     * Lý do không return current:
     * - current là con trỏ di chuyển trong quá trình xây dựng danh sách.
     * - Đến cuối vòng lặp, current trỏ đến node cuối cùng, không phải node đầu tiên của danh sách.
     * - Nếu return current, ta chỉ nhận được phần cuối danh sách thay vì toàn bộ danh sách.
     *
     * Lý do return dummyHead.next:
     * - dummyHead luôn trỏ đến node đầu tiên của danh sách hợp lệ.
     * - dummyHead.next chính là phần đầu thực sự của danh sách liên kết mà ta đã xây dựng.
     * - Ta bỏ qua node giả dummyHead (chứa giá trị 0 không cần thiết) để trả về danh sách đúng.
     *
     * 👉 Có thể hình dung như việc tạo một danh sách tên người tham gia một sự kiện:
     * - dummyHead là tờ giấy trắng ban đầu.
     * - current di chuyển và lần lượt viết tên lên giấy.
     * - Khi hoàn tất, ta không cần giữ lại phần giấy thừa ban đầu (dummyHead), mà chỉ cần phần có nội dung (dummyHead.next).
     * **/
    /**
     * ------------Copilot
     *
     * class Solution {
     *     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
     *         ListNode dummyHead = new ListNode(0);
     *         ListNode p = l1, q = l2, current = dummyHead;
     *         int carry = 0;
     *
     *         while (p != null || q != null) {
     *             int x = (p != null) ? p.val : 0;
     *             int y = (q != null) ? q.val : 0;
     *             int sum = carry + x + y;
     *             carry = sum / 10;
     *             current.next = new ListNode(sum % 10);
     *             current = current.next;
     *             if (p != null) p = p.next;
     *             if (q != null) q = q.next;
     *         }
     *
     *         if (carry > 0) {
     *             current.next = new ListNode(carry);
     *         }
     *
     *         return dummyHead.next;
     *     }
     * }*/
}

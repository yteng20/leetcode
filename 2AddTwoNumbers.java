//You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
//You may assume the two numbers do not contain any leading zero, except the number 0 itself.

//Input: l1 = [2,4,3], l2 = [5,6,4]
//Output: [7,0,8]
//Explanation: 342 + 465 = 807.

//explaination used: https://leetcode.com/problems/add-two-numbers/solutions/1835535/java-c-a-very-beautiful-explanation-ever-exists/ 

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        int carry = 0; //进一
        
        while(l1 != null || l2 != null || carry == 1){
            int sum = 0; 
            if(l1 != null){ 
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){ 
                sum += l2.val;
                l2 = l2.next;
            }
            sum += carry;
            carry = sum/10; //if the number greater than 9... get the digits before the last digit
            ListNode node = new ListNode(sum % 10); // the last digit
            curr.next = node; 
            curr = curr.next; 
        }

        return dummy.next;
    }
}

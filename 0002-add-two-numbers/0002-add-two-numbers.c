/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2) {
    struct ListNode *temp1 = l1;
    struct ListNode *temp2 = l2;
    struct ListNode *head = NULL;
    struct ListNode *tail = NULL;
    int carry = 0;

    while (temp1 != NULL || temp2 != NULL || carry != 0) {
        int sum = carry;
        if (temp1 != NULL) {
            sum += temp1->val;
            temp1 = temp1->next;
        }
        if (temp2 != NULL) {
            sum += temp2->val;
            temp2 = temp2->next;
        }

        carry = sum / 10;
        sum = sum % 10;

        struct ListNode *newnode = (struct ListNode*)malloc(sizeof(struct ListNode));
        newnode->val = sum;
        newnode->next = NULL;

        if (head == NULL) {
            head = newnode;
            tail = newnode;
        } else {
            tail->next = newnode;
            tail = newnode;
        }
    }

    return head;
    
}
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* mergeNodes(ListNode* head) {
        ListNode *pseudo= new ListNode (0);
        ListNode *ptr= pseudo;
        ListNode *temp= head;
        temp=temp->next;
        int sum=0;
        while(temp!=NULL){
            while(temp->val!=0){
                sum+=temp->val;
                temp=temp->next;
            }
            ptr->next= new ListNode (sum);
            ptr=ptr->next;
            temp=temp->next;
            sum=0;
        }
        return pseudo->next;
    }
};
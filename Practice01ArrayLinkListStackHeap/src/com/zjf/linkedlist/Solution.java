/**
 * description:  链表练习
 * date:         2022/8/12 20:17
 * author        ZhuJunfei
 */

package com.zjf.linkedlist;

public class Solution {
    public ListNode reverseList(ListNode head) {
        // 翻转链表
        // 模板, 遍历链表
        // 因为要指向前一个节点, 因此需要维护前一个节点
        ListNode last = null;

        while(head != null){
            // 需要注意的是, 我们处理的是n条边, 所以用head
            // head指向last会丢失它的next节点, 所以也需要维护
            ListNode nextNode = head.next;
            head.next = last;
            last = head;
            head = nextNode;
        }
        return last;
    }
}

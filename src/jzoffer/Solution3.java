package jzoffer;

import java.util.ArrayList;

/**
 * 从尾到头打印链表
 *
 * 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
 * @author ZhaoJun
 * @date 2019/8/12 15:30
 */

public class Solution3 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> result = new ArrayList<>();
        generate(listNode,result);
        return result;
    }

    private void generate(ListNode listNode, ArrayList<Integer> result) {
        if (listNode != null) {
            generate(listNode.next, result);
            result.add(listNode.val);
        }
    }

    public static class ListNode {
        int val;
        ListNode next = null;
        ListNode(int val) {
            this.val = val;
        }
    }
}

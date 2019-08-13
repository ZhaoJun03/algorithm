package jzoffer;

/**
 * 跳台阶
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 *
 * @author ZhaoJun
 * @date 2019/8/13 17:24
 */

public class Solution8 {

    public int JumpFloor(int target) {
        int a = 1, b = 2;
        if (target <= 2) {
            return target;
        }
        for (int i = 3; i <= target; i++) {
            int temp = a + b;
            a=b;
            b = temp;
        }
        return b;
    }
}

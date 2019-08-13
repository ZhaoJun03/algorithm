package jzoffer;

/**
 * 斐波那契数列
 *
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。n<=39
 * @author ZhaoJun
 * @date 2019/8/13 17:09
 */

public class Solution7 {
    public int Fibonacci(int n) {
        int a = 0, b = 1;
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    public static void main(String[] args) {
        Solution7 solution7 = new Solution7();
        int fibonacci = solution7.Fibonacci(3);
        System.out.println(fibonacci);
    }
}

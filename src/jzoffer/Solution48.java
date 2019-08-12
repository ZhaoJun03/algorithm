package jzoffer;

/**
 * 不用加减乘除做加法
 *
 * 写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。
 * @author ZhaoJun
 * @date 2019/8/12 13:44
 */

public class Solution48 {

    //想不到。。。膜拜想到的大神
    public static int Add(int num1,int num2) {
        while (num2 != 0) {
            int temp = num1 ^ num2;
            num2 = (num1 & num2) << 1;
            num1 = temp;
        }
        return num1;
    }

    public static void main(String[] args) {
        System.out.println(Add(95, 11));
    }
}

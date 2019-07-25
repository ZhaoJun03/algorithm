package jzoffer;

/**
 * 求1+2+3+...+n
 *
 * 求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
 *
 * @author ZhaoJun
 * @date 2019/7/25 18:17
 */

public class Solution47 {


    public int Sum_Solution(int n) {
        int result = n;
        boolean bool = (n > 0) && ((result += Sum_Solution(n - 1)) > 0);
        return result;
    }
}

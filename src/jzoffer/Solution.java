package jzoffer;

/**
 * 把字符串转换成整数
 *
 * 将一个字符串转换成一个整数(实现Integer.valueOf(string)的功能，但是string不符合数字要求时返回0)，要求不能使用字符串转换整数的
 * 库函数。 数值为0或者字符串不是一个合法的数值则返回0。
 *
 * 输入描述:输入一个字符串,包括数字字母符号,可以为空
 *
 * 输出描述:如果是合法的数值表达则返回该数字，否则返回0
 *
 * 示例1
 * 输入
 * +2147483647
 *     1a33
 * 输出
 * 2147483647
 *     0
 * @author ZhaoJun
 * @date 2019/8/12 14:19
 */

public class Solution {
    public static int StrToInt(String str) {
        if (str == null) {
            return 0;
        }
        char[] chars = str.toCharArray();
        int length = chars.length;
        boolean lt0 = false;
        int result = 0;
        for (int i = 0; i < length; i++) {
            if (i == 0) {
                if (chars[i] == '-'){
                    lt0 = true;
                } else if (chars[i] >= '0' && chars[i] <= '9') {
                    result = chars[i] - '0';
                }
            } else {
                if (chars[i] >= '0' && chars[i] <= '9') {
                    result = result * 10 + (chars[i] - '0');
                } else {
                    return 0;
                }
            }
        }
        return lt0 ? -result : result;
    }

    public static void main(String[] args) {
        System.out.println(StrToInt("+2147483647"));
    }
}

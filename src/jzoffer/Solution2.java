package jzoffer;

/**
 * 替换空格
 *
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后
 * 的字符串为We%20Are%20Happy。
 *
 * @author ZhaoJun
 * @date 2019/7/25 18:09
 */

public class Solution2 {
    public String replaceSpace(StringBuffer str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                sb.append("%20");
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
}

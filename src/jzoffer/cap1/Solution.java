package jzoffer.cap1;

/**
 *  二维数组中的查找
 *
 * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到
 * 下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 *
 * @author ZhaoJun
 * @date 2019/7/25 17:55
 */
public class Solution {

    public boolean Find(int target, int[][] array) {
        int rowCount = array.length;
        int colCount = array[0].length;
        for (int i = rowCount - 1, j = 0; j < colCount && i >= 0; ) {
            if (target == array[i][j]) {
                return true;
            } else if (target < array[i][j]) {
                i--;
            } else if (target > array[i][j]) {
                j++;
            }
        }
        return false;
    }
}

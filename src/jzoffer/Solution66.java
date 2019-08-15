package jzoffer;

/**
 * 机器人的运动范围
 * <p>
 * 地上有一个m行和n列的方格。一个机器人从坐标0,0的格子开始移动，每一次只能向左，右，上，下四个方向移动一格，但是不能进入
 * 行坐标和列坐标的数位之和大于k的格子。 例如，当k为18时，机器人能够进入方格（35,37），因为3+5+3+7 = 18。但是，它不能
 * 进入方格（35,38），因为3+5+3+8 = 19。请问该机器人能够达到多少个格子？
 *
 * @author ZhaoJun
 * @date 2019/8/13 17:29
 */

public class Solution66 {

    public int movingCount(int threshold, int rows, int cols) {
        boolean[][] visited = new boolean[rows][cols];
        return compute(visited, rows, cols, 0, 0, threshold);
    }

    public int compute(boolean[][] visited, int rows, int cols, int r, int c, int threshold) {
        if (r < 0 || r >= rows || c < 0 || c >= cols || visited[r][c] || getSum(r, c) > threshold) {
            return 0;
        }
        visited[r][c] = true;
        return compute(visited, rows, cols, r + 1, c, threshold) +
                compute(visited, rows, cols, r - 1, c, threshold) +
                compute(visited, rows, cols, r, c + 1, threshold) +
                compute(visited, rows, cols, r, c - 1, threshold) + 1;
    }

    private static int getSum(int i, int j) {
        int sum = 0;
        while (i > 0) {
            sum += i % 10;
            i = i / 10;
        }
        while (j > 0) {
            sum += j % 10;
            j = j / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Solution66 solution66 = new Solution66();
        int sum = solution66.movingCount(10, 1, 100);
        System.out.println(sum);
    }


}

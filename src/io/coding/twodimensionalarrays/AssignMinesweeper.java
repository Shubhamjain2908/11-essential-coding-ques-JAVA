package io.coding.twodimensionalarrays;

import java.util.Arrays;

public class AssignMinesweeper {
    public static void main(String[] args) {
        // NOTE: The following input values will be used for testing your solution.
        int[][] bombs1 = {{0, 2}, {2, 0}};
        // mineSweeper(bombs1, 3, 3) should return:
        // [[0, 1, -1],
        //  [1, 2, 1],
        //  [-1, 1, 0]]
        System.out.println(Arrays.deepToString(mineSweeper(bombs1, 3, 3)));

        int[][] bombs2 = {{0, 0}, {0, 1}, {1, 2}};
        // mineSweeper(bombs2, 3, 4) should return:
        // [[-1, -1, 2, 1],
        //  [2, 3, -1, 1],
        //  [0, 1, 1, 1]]
        System.out.println(Arrays.deepToString(mineSweeper(bombs2, 3, 4)));

        int[][] bombs3 = {{1, 1}, {1, 2}, {2, 2}, {4, 3}};
        // mineSweeper(bombs3, 5, 5) should return:
        // [[1, 2, 2, 1, 0],
        //  [1, -1, -1, 2, 0],
        //  [1, 3, -1, 2, 0],
        //  [0, 1, 2, 2, 1],
        //  [0, 0, 1, -1, 1]]
        System.out.println(Arrays.deepToString(mineSweeper(bombs3, 5, 5)));
    }

    // Implement your solution below.
    public static int[][] mineSweeper(int[][] bombs, int numRows, int numCols) {
        int[][] field = new int[numRows][numCols];
        for (int b = 0; b < bombs.length; b++) {
            int[] bomb = bombs[b];
            int x = bomb[0];
            int y = bomb[1];
            field[x][y] = -1;
            for (int i = x-1; i < x + 2; i++) {
                for (int j = y-1; j < y + 2; j++) {
                    if (i>=0 && i < numRows && j>=0 && j < numCols && field[i][j] != -1) {
                        field[i][j] += 1;
                    }
                }
            }
        }

        return field;
    }
}

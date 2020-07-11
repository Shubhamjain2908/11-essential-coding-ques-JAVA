package io.coding.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IsRotation {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(4, 5, 6, 7, 1, 2, 3));
        System.out.println(isRotation(list1, list2));
    }
    private static boolean isRotation(List<Integer> list1, List<Integer> list2) {
        if (list1.size() != list2.size()) return false;
        int key = list1.get(0);
        int key_i = -1;
        for (int i = 0; i < list2.size(); i++) {
            if (list2.get(i) == key) {
                key_i = i;
                break;
            }
        }
        if (key_i == -1) {
            return false;
        }
        for (int i = 0; i < list1.size(); i++) {
            int j = (key_i + i) % list1.size();
            if (list1.get(i) != list2.get(j)) {
                return false;
            }
        }
        return true;
    }
}

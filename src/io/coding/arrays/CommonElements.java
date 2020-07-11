package io.coding.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonElements {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 3, 4, 6, 7, 9));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 4, 5, 9, 10));
        System.out.println(commonElements(list1, list2));
    }
    private static List<Integer> commonElements(List<Integer> list1, List<Integer> list2) {
        int p1 = 0;
        int p2 = 0;
        List<Integer> result = new ArrayList<>();
        while (p1 < list1.size() && p2 < list2.size()) {
            int A = list1.get(p1);
            int B = list2.get(p2);
            if (A == B) {
                result.add(B);
                p1++;
                p2++;
            } else if(A > B) {
                p2++;
            } else {
                p1++;
            }
        }
        return result;
    }
}

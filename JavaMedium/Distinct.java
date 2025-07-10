package JavaMedium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.*;

public class Distinct {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 6, 6, 3, 3, 2, 1, 4, };
        Map <Integer , Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);

        }

        List<Integer> distinct = new ArrayList<>();
        for (int num : arr) {
            if (map.get(num) == 1) {
                distinct.add(num);
            }
        }
        System.out.println(distinct);
    }
}

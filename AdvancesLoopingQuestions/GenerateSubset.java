package AdvancesLoopingQuestions;

import java.util.ArrayList;
import java.util.List;

public class GenerateSubset {
    public static void main(String[] args) {
        int[] set = { 1, 2, 3 };
        List<Integer> current = new ArrayList<>();
        Generatersubset(set, 0, current);
    }

    static void Generatersubset(int[] set, int index, List<Integer> current) {
        if (index == set.length) {
            System.out.println(current);
            return;
            
        }

        current.add(set[index]);
        Generatersubset(set , index+1 , current);

        current.remove(current.size()-1);
        Generatersubset(set , index+1 , current);

    }
}

package study.demo;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorTest {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, new Comparator<int[]>() {
            public int compare(int[] person1, int[] person2) {
                if (person1[0] != person2[0]) {
                    return person2[0] - person1[0];
                } else {
                    return person1[1] - person2[1];
                }
            }
        });
        return people;
    }

    public static void main(String[] args) {
        int [][]people={{7,1},{4,4},{7,0},{5,0},{6,1},{5,2}};
        int[][] ints = new ComparatorTest().reconstructQueue(people);

    }
}

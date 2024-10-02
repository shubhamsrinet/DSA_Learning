package dsa.array.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindDuplicateNumber {
    public static void main(String[] args){
        System.out.println("Enter the array length here :");
        int[] array = {3,1,3,4,2};
        System.out.println(findDuplicate(array));
    }

    private static int findDuplicate(int[] array) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : array){
            if(!map.containsKey(i)){
                map.put(i,1);
            }else {
                return i;
            }
        }
        return 0;
    }
}

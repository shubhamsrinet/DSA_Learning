package dsa.array.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SingleNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array length here :");
        int length = sc.nextInt();
        int[] array = new int[length];
        System.out.println("Enter the array here :");
        for(int i =0 ;i<length;i++){
            array[i] = sc.nextInt();
        }
        System.out.println(singleNumber(array));
    }

    private static int singleNumber(int[] array) {
        //[2,2,1]
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : array){
            if(!map.containsKey(i)){
                map.put(i,1);
            }else{
                int val = map.get(i);
                map.put(i,++val);
            }
        }
        return map.entrySet().stream().
                filter(entry -> entry.getValue() != null && entry.getValue() == 1).
                map(Map.Entry::getKey).findFirst().orElse(-1);
    }
}

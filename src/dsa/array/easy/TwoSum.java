package dsa.array.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array length here :");
        int length = sc.nextInt();
        int[] array = new int[length];
        System.out.println("Enter the array here :");
        for(int i =0 ;i<length;i++){
            array[i] = sc.nextInt();
        }
        int target = sc.nextInt();
//        Input: nums = [2,7,11,15], target = 9
//        Output: [0,1]
        System.out.println(Arrays.toString(twoSum(array,target)));
    }

    private static int[] twoSum(int[] array, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<array.length;i++){
            int reduce = target - array[i];
            if(map.containsKey(reduce)){
                return new int[]{i, map.get(reduce)};
            }
            map.put(array[i], i);
        }
        return null;
    }
}

//Initialize an empty hash map (numToIndexMap) to store the numbers we've seen so far and their corresponding indices.
//Iterate over the array using a for loop.
//For each number nums[i], calculate the difference diff between the target and the current number (diff = target - nums[i]).
//Check if diff exists in numToIndexMap. If it does, it means we've found the two numbers that add up to the target. Return their indices [i, numToIndexMap.get(diff)].
//If diff does not exist in the map, store the current number and its index in numToIndexMap.
//If no such pair is found by the end of the loop, return null. (Though according to the problem constraints, a solution is guaranteed, so this case won't occur.)

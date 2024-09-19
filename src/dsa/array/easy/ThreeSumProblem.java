package dsa.array.easy;

import java.util.*;

public class ThreeSumProblem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array length here :");
        int length = sc.nextInt();
        int[] array = new int[length];
        System.out.println("Enter the array here :");
        for(int i =0 ;i<length;i++){
            array[i] = sc.nextInt();
        }
        System.out.println(threeSum(array));
    }

    private static List<List<Integer>> threeSum(int[] array) {

        Set<List<Integer>> res = new HashSet<>();

        Arrays.sort(array);

        for(int i=0;i<array.length-2;i++){
            int left = i+1;
            int right = array.length-1;
            while(left < right){
                if((array[i]+ array[left]+array[right])==0){
                    res.add(Arrays.asList(array[i], array[left],array[right]));
                    left++;
                    right--;
                }else if((array[i]+ array[left]+array[right])<0){
                    left++;
                }else if((array[i]+ array[left]+array[right])> 0){
                    right--;
                }
            }
        }
        return new ArrayList<>(res);
    }
}

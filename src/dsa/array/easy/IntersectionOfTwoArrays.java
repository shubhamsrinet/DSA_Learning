package dsa.array.easy;

import java.util.*;

public class IntersectionOfTwoArrays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first array length here :");
        int length1 = sc.nextInt();
        int[] array1 = new int[length1];
        System.out.println("Enter the first array here :");
        for(int i =0 ;i<length1;i++){
            array1[i] = sc.nextInt();
        }
        System.out.println("Enter the first array length here :");
        int length2 = sc.nextInt();
        int[] array2 = new int[length2];
        System.out.println("Enter the second array here :");
        for(int i =0 ;i<length2;i++){
            array2[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(intersectionArrays(array1,array2)));
    }

    private static int[] intersectionArrays(int[] array,int[] array2) {
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> resultList = new ArrayList<>();

        for(int i : array){
            map.put(i,map.getOrDefault(i, 0)+1);
        }
        for(int i : array2){
            if(map.containsKey(i) && map.get(i) > 0){
                resultList.add(i);
                map.put(i,map.get(i)-1);
            }
        }

        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        return result;
    }
}

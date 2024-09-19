package dsa.array.easy;

import java.util.PriorityQueue;
import java.util.Scanner;

public class KthLargestElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array length here :");
        int length = sc.nextInt();
        int[] array = new int[length];
        System.out.println("Enter the array here :");
        for(int i =0 ;i<length;i++){
            array[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(kthLargest(array,k));
    }

    private static int kthLargest(int[] array,int k) {
        //[3,2,1,5,6,4], k = 2

        PriorityQueue<Integer> queue = new PriorityQueue<>(k);
        for(int i : array){
            queue.add(i);
            if(queue.size()>k){
                queue.poll();
            }
        }
        return queue.peek();
    }
}

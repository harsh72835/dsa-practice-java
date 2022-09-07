package Array;

import java.util.Scanner;

public class FindElement{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int element = scn.nextInt();
        System.out.println(findElement(arr,element));
    }
    static boolean findElement(int[] arr, int element){
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if(element == arr[i]) {
                flag = true;
            }
        }
        return flag;
    }
}
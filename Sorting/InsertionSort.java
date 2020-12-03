package Sorting;

import java.util.Scanner;

public class InsertionSort {
    static void insertion(int arr[]){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int key=arr[i];
            int j=i-1;
            while (j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }

    public static void main(String[] args) {
        int[] arr=new int[4];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            arr[i]=sc.nextInt();
        }
        insertion(arr);
        for (int i = 0; i < 4; i++) {
            System.out.println(arr[i]);
        }
    }
}

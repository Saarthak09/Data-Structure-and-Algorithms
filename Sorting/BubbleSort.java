package Sorting;

import java.util.Scanner;

public class BubbleSort {
    static void bubble(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
          for (int j=0;j<n-1-i;j++){
              if(arr[j]>arr[j+1]){
                  int t=arr[j];
                  arr[j]=arr[j+1];
                  arr[j+1]=t;
              }
          }
        }
    }

    public static void main(String[] args) {
        int[] arr=new int[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        bubble(arr);
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }
    }
}

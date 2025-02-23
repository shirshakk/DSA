package Array.Assignment;

import java.util.Scanner;

public class Q2 {
    public static int Search(int []arr,int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter the element:");
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the key:");
        int key=sc.nextInt();
        int result=Search(arr,key);
        System.out.println("The index is:"+result);
        sc.close();
    }
}

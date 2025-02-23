package Array.Assignment;

import java.util.Scanner;

public class Q1 {
    public static boolean Dublicate(int []arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
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
        boolean result=Dublicate(arr);
        System.out.println("Array contain dublicate element:"+result);
        sc.close();
    }
}

package Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int []number={5,4,1,3,2};
        for(int i=0;i<number.length;i++){
            for(int j=0;j<number.length-1;j++){
                if(number[j]>number[j+1]){
                    int temp=number[j];
                    number[j]=number[j+1];
                    number[j+1]=temp;
                }
            }
        }
        for(int i=0;i<number.length;i++){
            System.out.print(number[i]+" ");
        }
    }
}

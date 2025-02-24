package Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int number[]={5,4,1,3,2};
        for(int i=0;i<number.length;i++){
            int smallest=i;
            for(int j=i+1;j<number.length;j++){
                if(number[smallest]>number[j]){
                    smallest=j;
                }
            }
            int temp=number[smallest];
            number[smallest]=number[i];
            number[i]=temp;
        }
        for(int i=0;i<number.length;i++){
            System.out.print(number[i]+" ");
        }
    }
}

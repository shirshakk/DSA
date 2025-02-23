package Array;

public class BinarySearch {
    public static int BS(int []number,int key){
        int start=0;
        int end=number.length-1;
        while(start<=end){
            int mid=(end-start)/2+start;
            if(number[mid]==key){
                return mid;
            }
            else if(number[mid]>key){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[]={2,4,6,8,10,12,14,16};
        int key=10;
        int ans=BS(number,key);
        System.out.print(ans);
    }
}

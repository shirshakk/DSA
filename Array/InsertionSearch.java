package Array;
class InsertionSearch{
    public static void main(String[] args) {
        int number[]={2,4,6,8,10,12,14,16};
        int key=10;
        for(int i=0;i<number.length;i++){
            if(number[i]==key){
                System.out.println(i);
            }
        }
    }
}
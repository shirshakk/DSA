package Loops;

public class HalfInvertedPyramid {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            for(int j=7;j>0;j--){
                for(int k=0;k<i;k++){
                    j--;
                    System.out.print("");
                }
                for(int l=0;l<j;l++){
                    System.out.print("*");
                }
                for(int k=0;k<i;k++){
                    j--;
                    System.out.print("");
                }
            }
            System.out.println();
        }
    }
}

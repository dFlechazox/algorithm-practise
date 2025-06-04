package homework;

import java.util.Scanner;

public class Upc {
    public static void main(String args[]){
        upc();
    }
    public static void upc(){
        int a=0,b=0;
        int nums[]=new int[11];
        int[] outputupc=new int[12];
        Scanner in=new Scanner(System.in);
        nums[11] = in.nextInt();
        for (int i=0;i<11;i++){
            if (i%2==0){
                a=a+i;
            }
            else {
                b=b+i;
            }
        }
        int x=10-(((3*a+b)%10)%10);
        for (int i=0;i<11;i++){
            outputupc[i]=nums[i];
        }
        outputupc[11]=x;
        System.out.print(outputupc);
    }
}

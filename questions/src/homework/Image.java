package homework;

import java.util.Scanner;

public class Image {
    public static void image(){
        Scanner in=new Scanner(System.in);
        int[] nums=new int[10];
        int a=0,b=0,c=0,d=0,e=0,f=0,g=0,x=0,y=0,z=0;
        for (int i=0;i<10;i++){
            if (nums[i]>=0&&nums[i]<10){
                a++;
            }
            if (nums[i]>=10&&nums[i]<20){
                b++;
            }
            if (nums[i]>=20&&nums[i]<30){
                c++;
            }
            if (nums[i]>=30&&nums[i]<40){
                d++;
            }if (nums[i]>=40&&nums[i]<50){
                e++;
            }if (nums[i]>=50&&nums[i]<60){
                f++;
            }
            if (nums[i]>=60&&nums[i]<70){
                g++;
            }
            if (nums[i]>=70&&nums[i]<80){
                x++;
            }
            if (nums[i]>=80&&nums[i]<90){
                y++;
            }
            if (nums[i]>=90&&nums[i]<100){
                z++;
            }
        }
    }
}

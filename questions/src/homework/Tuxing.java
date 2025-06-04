package homework;

public class Tuxing {
    public static void main(String args[]){
        tuxinga(7);
        tuxingb(7);
        tuxingc(7);
        tuxingd(7);
        tuxinge(7);
    }
    public static void tuxinga(int size){
        int length = size;
        int height = size;
        for (int i=0;i<height;i++) {
            for (int j=0;j<length;j++) {
                if ( i == 0 ) {
                    System.out.print("* ");
                }
                else if (i == height-1) {
                    System.out.print("* ");
                }
                else if (j == 0 || j == length-1) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void tuxingb(int size){
        int length = size;
        int height = size;
        for (int i=0;i<height;i++) {
            for (int j=0;j<length;j++) {
                if ( i == 0 ) {
                    System.out.print("* ");
                }
                else if (i == height-1) {
                    System.out.print("* ");
                }
                else if (j == i) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void tuxingc(int size){
        int length = size;
        int height = size;
        for (int i=0;i<height;i++) {
            for (int j=0;j<length;j++) {
                if ( i == 0 ) {
                    System.out.print("* ");
                }
                else if (i == height-1) {
                    System.out.print("* ");
                }
                else if (j == length-i-1) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void tuxingd(int size){
        int length = size;
        int height = size;
        for (int i=0;i<height;i++) {
            for (int j=0;j<length;j++) {
                if ( i == 0 ) {
                    System.out.print("* ");
                }
                else if (i == height-1) {
                    System.out.print("* ");
                }
                else if (j == i || j == length-i-1) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void tuxinge(int size){
        int length = size;
        int height = size;
        for (int i=0;i<height;i++) {
            for (int j=0;j<length;j++) {
                if ( i == 0 ) {
                    System.out.print("* ");
                }
                else if (i == height-1) {
                    System.out.print("* ");
                }
                else if (j == 0 || j == length-1 || j == i || j == length-i-1) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}



package Patterns;

import java.util.Scanner;
public class Pyramid {
    public static void main(String[] args) {
        Scanner dru = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = dru.nextInt();
        for (int i=1; i<=num; i++){
            for (int j=i; j<num; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=(2*i-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

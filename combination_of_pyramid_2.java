package Patterns;

import java.util.Scanner;

public class combination_of_pyramid_2 {
    public static void main(String[] args) {
        Scanner dru = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = dru.nextInt();
        for (int i=num; i>=1; i--){
            for (int j=i; j<num; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=(2*i-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=2; i<=num; i++){
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

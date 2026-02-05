
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner dru = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = dru.nextInt();
        for (int i=1; i<=num; i++){
            for (int j=i; j<=num; j++){
                System.out.print(" ");
            }
            for (int j=1;j<=2*i-1; j++){
                if (j==1 || j==2*i-1 || i==num){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}


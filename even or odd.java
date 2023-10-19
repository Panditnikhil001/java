package loops;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number : ");
        n = sc.nextInt();
        sc.close();

        for (int i = 1; i <= n; i++) {
            if ((i&1) == 0) {
                System.out.println(i+" is Even");
            } else {
                System.out.println(i+" is Odd");
            }
        }
    }
}
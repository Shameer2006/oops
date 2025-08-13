package kl;

import java.util.Scanner;

public class sh {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = s.nextInt();
        
        int f = 0, sec = 1;  
        
        System.out.print("Fibonacci: ");
        
        for (int i = 1; i <= n; i++) {
            System.out.print(f + " ");
            int next = f + sec;
            f = sec;
            sec = next;
        }
        
        s.close();
    }
}

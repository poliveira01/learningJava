/*
switch — options menu

create a program that displays the following menu:

1 - add  
2 - subtract  
3 - multiply  
4 - divide  
5 - exit

use a switch statement to perform the selected operation. the program should repeat until the user chooses "exit".
*/

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        int op;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\n\n1 - add");
        System.out.println("2 - subtract");
        System.out.println("3 - Multiply");
        System.out.println("4 - Divide");
        System.out.println("5 - Exit");

        System.out.print("\n:");
        op = sc.nextInt();
        switch(op) {
            case 1:
                System.out.println("Adding...");
                break;
            case 2:
                System.out.println("Subtracting...");
                break;
            case 3:
                System.out.println("Multiplying...");
                break;
            case 4:
                System.out.println("Dividing...");
                break;
            case 5:
                System.out.println("Leaving...");
                break;
        }
        sc.close();
    }
}
 

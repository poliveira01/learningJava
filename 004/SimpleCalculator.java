/*

 Functions — Simple Calculator

Create a function called calculate that takes two numbers and an operator (+, -, *, /). The function should return the result of the operation.

Extra challenge: Handle division by zero!

*/

import java.util.Scanner;

public class SimpleCalculator {

    public static int calculator(int n1, int n2, char op) {
        int result = 0;

        if(op == '+')
            result = n1+n2;
        else if (op == '-')
            result = n1-n2;
        else if (op == '*')
            result = n1*n2;
        else
            result = n1/n2;
        
        return result;
}



    public static void main(String[] args) {
        int result;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Number: ");
        int n1 = sc.nextInt();
        System.out.print("Number: ");
        int n2 = sc.nextInt();
        System.out.print("Operator: ");
        char op = sc.next().charAt(0);
        

        if(n2==0) {
            System.out.printf("\n%d%c%d Error! Division by zero!\n\n", n1, op, n2);
            return;
        }
            
            result = calculator(n1, n2, op);

        System.out.printf("\n%d %c %d = %d\n", n1, op, n2, result);

    }

}


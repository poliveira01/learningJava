/*
Nested while Loops — Triangle of Asterisks

Ask the user to enter an integer n. Use nested while loops to draw a triangle of asterisks with n rows.

Example:
If n = 5:

*  
**  
***  
****  
*****

*/

public class TriangleOfAsterisks {
    public static void main(String[] args) {
        int i = 1;
        
        while(i<6) {
            int j = 1;

            System.out.println();
            while(j<=i) {
                System.out.print("*");
                j++;
            }
            i++;
        }
        System.out.println();
    }
}


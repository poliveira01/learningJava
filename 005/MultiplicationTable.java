/*
Nested for Loops — Multiplication Table

Create a program that displays the multiplication table from 1 to 10 using nested for loops.

Expected output:

1 x 1 = 1  
1 x 2 = 2  
...  
10 x 10 = 100

*/

public class MultiolicationTable {
    public static void main(String[] args) {
        for(int i=1; i <=10; i++) {
            System.out.print("\n");
            for(int j=1; j<=10; j++){
                System.out.printf("%d * %d = %d\n",i, j, i*j); 
            }
        }
    }
}


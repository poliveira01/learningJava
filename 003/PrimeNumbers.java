/*
    Prime numbers
*/

public class PrimeNumbers {
    public static boolean isPrime(int nr) {
        if(nr != 2 && nr%2 == 0) {
            return false;
        }
    
        for(int i=nr-1; i>1; i--) {
            if(nr%i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        for(int i=1; i<20; i++) {
            if(i == 1 || i == 2) {
                System.out.printf(" %d,", i);
            }
            else if(isPrime(i)){
                System.out.printf(" %d,", i);
        }
    }
    }
}
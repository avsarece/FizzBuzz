package lab1;

public class Multiples {
    public static void main(String[] args) {
        System.out.println(multiples(1000,3,5));
    }

     static int multiples(int n , int a , int b) {
        int count = 0;
        for (int c = 1; c < n ; c++) {
            if (c % a == 0 || c % b == 0) {
                count++;
            }
        }
        return count;
    }
}
public class Palindrome {
    static int reverseNumber(int n) {
        int reversed_n = 0;
        while (n > 0) {
            reversed_n = reversed_n * 10 + n % 10;
            n = n / 10;
        }
        return reversed_n;
    }

    public static void main(String[] args) {
        int n = 12321;
        int reverseN = reverseNumber(n);
        System.out.println("reverse of =" + reverseN);
    }
}
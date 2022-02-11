//Write a Java program to find out whether the given String is Palindrome or not.
class Problem4 {
    public static void main(String args[]) {
        int r, sum = 0, temp;
        // It is the number variable to be checked for palindrome
        int n = 454;
        temp = n;
        while (n > 0) {
            // getting remainder 
            r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if (temp == sum)
            System.out.println("palindrome number ");
        else
            System.out.println("not palindrome");
    }
}

public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println("*************************************");
        System.out.println(isPalindrome(707));
        System.out.println("**************************************");
        System.out.println(isPalindrome(11212));


    }

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int digit = 0;
        int tempNumber = number;

        // Compute the reverse
        while (tempNumber != 0) {
            digit = tempNumber % 10;
            //System.out.println("first digit is " + digit);
            reverse = reverse * 10 + digit;
            //System.out.println("first reverse is " + reverse);
            tempNumber = tempNumber / 10;
            //System.out.println("first tempNumber is " + tempNumber);
            //System.out.println("-------------------");

        }

        // The integer is palindrome if integer and reverse are equal
        if (number == reverse) {
            return true;
        } else {
            return false;
        }
    }


}

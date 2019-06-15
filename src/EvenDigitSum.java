public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println("*******************************");
        System.out.println(getEvenDigitSum(252));
        System.out.println("*********************************");
        System.out.println(getEvenDigitSum(-22));

    }

    public static int getEvenDigitSum(int number) {

        if (number < 0) {
            return -1;
        }
        int tempNumber = number;
        int sum = 0;
        int lastDigit;

        while (tempNumber > 0) {
            lastDigit = tempNumber % 10;
            //System.out.println("last digit is " + lastDigit);
            if (lastDigit % 2 == 0) {
                sum = sum + lastDigit;
                //System.out.println("sum is " + sum);

            }
            tempNumber = tempNumber / 10;
            //System.out.println("tempNumber continue is " + tempNumber);
            //System.out.println("--------");
        }
        return sum;


    }
}

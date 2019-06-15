public class FirstLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println("*********************************");
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println("*********************************");
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println("*********************************");
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println("*********************************");
        System.out.println(sumFirstAndLastDigit(-10));



    }

    public static int sumFirstAndLastDigit(int number){
        if (number < 0){
            return -1;
        }
        int tempNumber = number;
        int firstDigit = 0;
        int lastDigit = number % 10;
        int sum;

        while (tempNumber > 0){
            firstDigit = tempNumber % 10;
            //System.out.println("first time first digit: " + firstDigit);
            tempNumber = tempNumber/10;
            //System.out.println("first time tempnumber: " + tempNumber);
            //System.out.println("-------------");
        }
        sum = firstDigit + lastDigit;
        return sum;


    }
}

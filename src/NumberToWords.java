public class NumberToWords {
    public static void main(String[] args) {

        System.out.println(reverse(123));
        System.out.println(reverse(100));  // this shows as 1
        System.out.println("***********");

        System.out.println(getDigitCount(100));
        System.out.println(getDigitCount(123));
        System.out.println(getDigitCount(0));
        System.out.println("***********");


        numberToWords(234);
        System.out.println("***********");
        numberToWords(100);

    }

    public static void numberToWords(int number){
        if (number < 0)
        {
            System.out.println("Invalid Value");;
        }
        int lastDigit = 0;
        int count = 0;
        int reversedNumberForAReason = reverse(number); // reversing the number so that the output is correct
        int noOfDigits = getDigitCount(number);

        while (reversedNumberForAReason != 0){
            lastDigit = reversedNumberForAReason % 10;
             //System.out.println("last digit of the reversedNumberforareason is " + lastDigit);
            count++;
             //System.out.println("Count is " + count);
            reversedNumberForAReason = reversedNumberForAReason / 10;
             //System.out.println("left out number after removing last digit of reversedNumberforareason is " + reversedNumberForAReason);
             //System.out.println("------");
            switch (lastDigit){
                case 0:
                    System.out.println("Zero");
                    break;

                case 1:
                    System.out.println("One");
                    break;

                case 2:
                    System.out.println("Two");
                    break;

                case 3:
                    System.out.println("Three");
                    break;

                case 4:
                    System.out.println("Four");
                    break;

                case 5:
                    System.out.println("Five");
                    break;

                case 6:
                    System.out.println("Six");
                    break;

                case 7:
                    System.out.println("Seven");
                    break;

                case 8:
                    System.out.println("Eight");
                    break;

                case 9:
                    System.out.println("Nine");
                    break;


            }
        }
        while (count < noOfDigits){
            System.out.println("Zero");
            count++;
            //System.out.println("Count ( if count is less than noofdigits) is " + count);

        }

    }




    public static int reverse(int number){
        int reversedNumber = 0;
        while (number != 0){
            reversedNumber = reversedNumber * 10 + number % 10;
            // System.out.println("Reversed number is " + reversedNumber);
            number = number / 10;
            // System.out.println("number is " + number);
        }
        return reversedNumber;

    }



    public static int getDigitCount(int number){
        if (number < 0) {
            return  -1;

        }
        int count = 0;
        do {
            number = number / 10;
            //System.out.println("number is " + number);
            count++;
            //System.out.println("Count is " + count);
            //System.out.println("----------");

        } while (number != 0);
        return count;
    }
}

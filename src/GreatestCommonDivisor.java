public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25,15));
        System.out.println("***********************");
        System.out.println(getGreatestCommonDivisor(12,30));
        System.out.println("***********************");
        System.out.println(getGreatestCommonDivisor(9,18));
        System.out.println("***********************");
        System.out.println(getGreatestCommonDivisor(81,153));




    }

    public static int getGreatestCommonDivisor(int first, int second){

        if (first < 10 || second < 10)
        {
            return -1;
        }
        while(first != 0 && second != 0) // until either one of them is 0
        {
            int tempNumber = second;
            System.out.println("Temp number (second number) is " +tempNumber);
            second = first % second;
            System.out.println("Second Number is " + second);
            first = tempNumber;
            System.out.println("first Number is " + first);
            System.out.println("--------");

        }
        return first + second; // either one is 0, so return the non-zero value
    }
}

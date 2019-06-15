public class SharedDigit {
    public static void main(String[] args) {

        System.out.println(hasSharedDigit(12,23));
        System.out.println(hasSharedDigit(9,99));
        System.out.println(hasSharedDigit(15,55));
        System.out.println(hasSharedDigit(12,43));




    }

    public static boolean hasSharedDigit(int number1, int number2) {

        if (number1 < 10 || number1 > 99 || number2 <10 || number2 > 99)
        {
            return false;
        }
        int leftnumber1 = number1 / 10;
        int rightnumber1 = number1 % 10;
        int leftnumber2 = number2 / 10;
        int rightnumber2 = number2 % 10;
        //System.out.println(leftnumber1+" "+leftnumber2+" "+rightnumber1+" "+rightnumber2);

        if ((leftnumber1 == leftnumber2) || (leftnumber1 == rightnumber2) || (rightnumber1 == leftnumber2) || (rightnumber1 == rightnumber2))
        {
            return true;
        }
    return false;
    }



}
// else if ((number1/10)== (number2/10)||
//         (number1/10 )==( number2 % 10)||
//         (number1 % 10)== (number2/10) ||
//         (number1 % 10) == (number2 % 10)){
//
//         }return true;
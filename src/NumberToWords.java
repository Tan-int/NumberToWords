public class NumberToWords {

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }

        int reversedNumber = reverse(number);
        int zeroCount = (getDigitCount(number)) - getDigitCount(reversedNumber);
        int digitCount = getDigitCount(reversedNumber);

        while (digitCount > 0) {
            int digitToPrint = reversedNumber % 10;
            digitCount--;
            switch (digitToPrint) {
                default:
                    System.out.println("Invalid Value");
                    break;
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
            }
            reversedNumber /= 10;
        }
        for (int i = zeroCount; zeroCount > 0; zeroCount--) {
            System.out.println("Zero");
        }
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }

        int digitCount = 1;
        for (int i = 0; number > 0; i++) {
            if ((number / 10) != 0) {
                digitCount++;
            }
            number /= 10;
        }
        return digitCount;
    }

    public static int reverse(int number) {
        int reversed = 0;

        while (number != 0) {
            reversed *= 10;
            reversed += number % 10;
            number /= 10;
        }

        return reversed;
    }

}

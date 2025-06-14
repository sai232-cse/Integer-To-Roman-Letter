public class IntegerToRomanLetter{
    public static void main(String[] args) {
        int number = 2524; // example number
        int thousands = number / 1000;
        int hundreds = (number % 1000) / 100;
        int tens = (number % 100) / 10;
        int ones = number % 10;

        for (int i = 0; i < thousands; i++) {
            System.out.print("M");
        }

        if (hundreds == 9) {
            System.out.print("CM");
        } else if (hundreds >= 5) {
            System.out.print("D");
            for (int i = 0; i < hundreds - 5; i++) {
                System.out.print("C");
            }
        } else if (hundreds == 4) {
            System.out.print("CD");
        } else {
            for (int i = 0; i < hundreds; i++) {
                System.out.print("C");
            }
        }

        if (tens == 9) {
            System.out.print("XC");
        } else if (tens >= 5) {
            System.out.print("L");
            for (int i = 0; i < tens - 5; i++) {
                System.out.print("X");
            }
        } else if (tens == 4) {
            System.out.print("XL");
        } else {
            for (int i = 0; i < tens; i++) {
                System.out.print("X");
            }
        }

        if (ones == 9) {
            System.out.print("IX");
        } else if (ones >= 5) {
            System.out.print("V");
            for (int i = 0; i < ones - 5; i++) {
                System.out.print("I");
            }
        } else if (ones == 4) {
            System.out.print("IV");
        } else {
            for (int i = 0; i < ones; i++) {
                System.out.print("I");
            }
        }
    }
}
package x20170906;

import java.util.Scanner;

public class SzemSzam {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        char[] digits = in.toCharArray();
        boolean valid = false;
        int val = Character.getNumericValue(digits[0]);
        for (int i = 1; i < digits.length - 1; i++) {
            val = val + (Character.getNumericValue(digits[i]) * (i + 1));
        }
        if (digits.length==11 && Character.getNumericValue(digits[digits.length - 1]) < 10 && val % 11 == Character.getNumericValue(digits[digits.length - 1])) {
            valid = true;
        }
        System.out.println(val);
    }
}

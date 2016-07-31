package algorithms.implementation;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by stathis on 31/7/2016.
 */
public class TimeInWords {


    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        String input;
        while (((input = sc.nextLine()) != null) && !input.equals("")) {
            int H = Integer.parseInt(input);
            int M = sc.nextInt();
            System.out.println(convertTimeToWords(H, M));
        }
    }

    private static String convertTimeToWords(int h, int m) {
        String hours = m <= 30 ? convertIntegerToWord(h) : convertIntegerToWord(h + 1);
        String minutes = m > 30 ? convertIntegerToWord(60 - m) : convertIntegerToWord(m);
        String MANY = "s";
        String PASSED = m > 30 ? "to" : "past";
        String MINUTE = (m == 30 || m == 15 || m == 45)? "" : " minute";

        if (m == 0) {
            return hours + " " + minutes;
        } else if (m == 1 || m == 30 || m == 15 || m == 45 ) {
            MANY = "";
        }
        return minutes + MINUTE + MANY + " " + PASSED + " " + hours;
    }

    private static String convertIntegerToWord(int i) {
        switch (i) {
            case 0:
                return "o' clock";
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            case 10:
                return "ten";
            case 11:
                return "eleven";
            case 12:
                return "twelve";
            case 13:
                return "thirteen";
            case 14:
                return "fourteen";
            case 15:
                return "quarter";
            case 45:
                return "quarter";
            case 16:
                return "sixteen";
            case 17:
                return "seventeen";
            case 18:
                return "eighteen";
            case 19:
                return "nineteen";
            case 20:
                return "twenty";
            case 30:
                return "half";
            case 40:
                return "forty";
            case 50:
                return "fifty";
            default:
                StringBuilder sb = new StringBuilder();
                sb.append((convertIntegerToWord(i / 10 * 10))).append(" ").append((convertIntegerToWord(i % 10)));
                return sb.toString();

        }
    }

}



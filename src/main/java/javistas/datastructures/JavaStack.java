package javistas.datastructures;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by stathis on 31/7/2016.
 */
public class JavaStack {

    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input = sc.next();
            while (input.length() != (input = input.replaceAll("\\(\\)|\\[\\]|\\{\\}", "")).length()) ;
            System.out.println(input.isEmpty());
        }

    }

}

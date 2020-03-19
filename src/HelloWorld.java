import java.util.Scanner;

import static java.lang.Integer.decode;
import static java.lang.Integer.getInteger;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.print("\n");

        int myFavoriteNumber = 7;
        System.out.println(myFavoriteNumber);
        String myString = "3.14159";
        System.out.println(myString);
        float myNumber = (float) 3.14;
        System.out.println(myNumber);

//        int x = 5;  //declare the int value
//        System.out.println(x++);  //post increment x, output from print will be 5 since the increment comes after the print
//        System.out.println(x);  // print x to console, x is now 6 from the post increment from the line above

//        int x = 5;
//        System.out.println(++x);  // pre increment x before printing results in an output of 6
//        System.out.println(x);   // prints the value of x, currently 6

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
//        int three = (int) "three";
//        System.out.println(three);
//        int x = 4;
//        x = x + 5;
//        System.out.println(x);

//        int x = 3;
//        int y = 4;
//        y = y * x;
//        System.out.println(y);

//        int x = 10;
//        int y = 2;
//        x = x / y;
//        y = y - x;
//        System.out.println(y);

        Scanner scanner = new Scanner(System.in);

//        System.out.print("Enter something: ");
//        String userInput = scanner.nextLine();
//
//        System.out.println("You entered: --> \"" + userInput + "\" <--");
//
//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %s", pi);

//        System.out.println("Enter an integer: ");
//        int userInt = scanner.nextInt();
//        System.out.println("You entered: --> \"" + userInt + "\" <--");

//        System.out.print("Enter three words: ");
//        String wordOne = scanner.next();
//        String wordTwo = scanner.next();
//        String wordThree = scanner.next();
//        System.out.println("You entered: --> \"" + wordOne +" "+ wordTwo+" " +wordThree + "\" <--");

//        System.out.print("Enter a sentence: ");
//        String sentence = scanner.nextLine();
////        String wordTwo = scanner.next();
////        String wordThree = scanner.next();
//        System.out.println("You entered: --> \"" +sentence + "\" <--");

        System.out.print("Enter length and width: ");

        String lengthAndWidth = scanner.nextLine();
        String[] numbers = lengthAndWidth.split(" ", 2);
//        int l = Integer.parseInt(numbers);
//        System.out.println(l);
        System.out.println(numbers);

    }
}
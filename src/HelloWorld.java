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
        int x = 4;
        x = x + 5;
        System.out.println(x);

    }
}
/*
 *Copyright Mark and Zackary Jordan 2011 - AND BEYOND -
 */
package getinput;

import java.util.*;

/**
 * A convenience class for getting input from stdin in Java.
 * Each method gets a value of the given type. If the input
 * is invalid, an error message is output and the user is
 * prompted again. Each method is also overloaded, with one
 * version using the standard error message and one using
 * a custom error message.
 */
public class GetInput {

    /**
     * Get an integer from stdin
     * @return an integer from stdin
     */
    public static int getInt() {

        Scanner myInp = new Scanner(System.in);
        int myInt = 0;

        try {

            myInt = myInp.nextInt();

        } catch (NoSuchElementException ex) {
            System.out.print("Error! Enter a valid integer: ");
            myInt = getInt();
        } catch (ClassCastException ex) {
            System.out.print("Error! Enter a valid integer: ");
            myInt = getInt();
        } catch (IllegalStateException ex) {
            System.out.print("Error! Enter a valid integer: ");
            myInt = getInt();
        }

        myInp.close();

        return myInt;

    }

    /**
     * Get an integer from stdin
     * @param errorText the custom error message
     * @return an integer from stdin
     */
    public static int getInt(String errorText) {

        Scanner myInp = new Scanner(System.in);
        int myInt = 0;

        try {

            myInt = myInp.nextInt();

        } catch (NoSuchElementException ex) {
            System.out.print(errorText);
            myInt = getInt(errorText);
        } catch (ClassCastException ex) {
            System.out.print(errorText);
            myInt = getInt(errorText);
        } catch (IllegalStateException ex) {
            System.out.print(errorText);
            myInt = getInt(errorText);
        }

        myInp.close();

        return myInt;

    }

    /**
     * Get a String from stdin
     * @return an String from stdin
     */
    public static String getString() {

        Scanner myInp = new Scanner(System.in);
        String myStr = "";

        try {

            myStr = myInp.nextLine();

        } catch (NoSuchElementException ex) {
            System.out.print("Error! Enter a valid string: ");
            myStr = getString();
        } catch (IllegalStateException ex) {
            System.out.print("Error! Enter a valid string: ");
            myStr = getString();
        }

        myInp.close();

        return myStr;

    }

    /**
     * Get a String from stdin
     * @param errorText the custom error message
     * @return an integer from stdin
     */
    public static String getString(String errorText) {

        Scanner myInp = new Scanner(System.in);
        String myStr = "";

        try {

            myStr = myInp.nextLine();

        } catch (NoSuchElementException ex) {
            System.out.print(errorText);
            myStr = getString(errorText);
        } catch (IllegalStateException ex) {
            System.out.print(errorText);
            myStr = getString(errorText);
        }

        myInp.close();

        return myStr;

    }

    /**
     * Get a double from stdin
     * @return a double from stdin
     */
    public static double getDouble() {

        Scanner myInp = new Scanner(System.in);
        double myDouble = 0.0;

        try {

            myDouble = myInp.nextDouble();

        } catch (NoSuchElementException ex) {
            System.out.print("Error! Enter a valid double: ");
            myDouble = getDouble();
        } catch (ClassCastException ex) {
            System.out.print("Error! Enter a valid double: ");
            myDouble = getDouble();
        } catch (IllegalStateException ex) {
            System.out.print("Error! Enter a valid double: ");
            myDouble = getDouble();
        }

        myInp.close();

        return myDouble;

    }

    /**
     * Get a double from stdin
     * @param errorText the custom error message
     * @return a double from stdin
     */
    public static double getDouble(String errorText) {

        Scanner myInp = new Scanner(System.in);
        double myDouble = 0.0;

        try {

            myDouble = myInp.nextDouble();

        } catch (NoSuchElementException ex) {
            System.out.print(errorText);
            myDouble = getDouble(errorText);
        } catch (ClassCastException ex) {
            System.out.print(errorText);
            myDouble = getDouble(errorText);
        } catch (IllegalStateException ex) {
            System.out.print(errorText);
            myDouble = getDouble(errorText);
        }

        myInp.close();

        return myDouble;

    }

    /**
     * Get a boolean value from stdin
     * @return a boolean from stdin
     */
    public static boolean getBool() {

        Scanner myInp = new Scanner(System.in);
        boolean myBool = false;

        try {

            myBool = myInp.nextBoolean();

        } catch (NoSuchElementException ex) {
            System.out.print("Error! Enter a valid boolean: ");
            myBool = getBool();
        } catch (ClassCastException ex) {
            System.out.print("Error! Enter a valid boolean: ");
            myBool = getBool();
        } catch (IllegalStateException ex) {
            System.out.print("Error! Enter a valid boolean: ");
            myBool = getBool();
        }

        myInp.close();

        return myBool;

    }

    /**
     * Get a boolean from stdin
     * @param errorText the custom error message
     * @return a bool from stdin
     */
    public static boolean getBool(String errorText) {

        Scanner myInp = new Scanner(System.in);
        boolean myBool = false;

        try {

            myBool = myInp.nextBoolean();

        } catch (NoSuchElementException ex) {
            System.out.print(errorText);
            myBool = getBool(errorText);
        } catch (ClassCastException ex) {
            System.out.print(errorText);
            myBool = getBool(errorText);
        } catch (IllegalStateException ex) {
            System.out.print(errorText);
            myBool = getBool(errorText);
        }

        myInp.close();

        return myBool;

    }
    
    /**
     * Get a character from stdin
     * @return a character from stdin
     */
    public static char getChar() {

        char myChar = 'a';
        String inp = getString("Error! Enter a valid character: ");

        if (inp.length() != 1) {

            System.out.print("Error! Enter a valid character: ");
            myChar = getChar();

        } else {
            myChar = inp.charAt(0);
        }

        return myChar;

    }

    /**
     * Get a character from stdin
     * @param errorText the custom error message 
     * @return a character from stdin
     */
    public static char getChar(String errorText) {

        char myChar = 'a';
        String inp = getString(errorText);

        if (inp.length() != 1) {

            System.out.print(errorText);
            myChar = getChar(errorText);

        } else {
            myChar = inp.charAt(0);
        }

        return myChar;

    }
}

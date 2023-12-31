package com.example.lib.basic;

public class DataTypes {
    public static void main(String[] args) {
        // Primitive data types:

        // byte (-128 <-> 127),
        byte x = 127;  // 8 bit

        // short (-32768 <-> 32767),
        short y = 7777;  // 16 bit

        // int (-2147483648 <-> 2147483647),
        int z = 88776655;  // 32 bit

        // long (-9223372036854775808 <-> 9223372036854775807),
        long w = 1122334455667788L;  // 64 bit

        // float (precision 6-7 digits),
        float a = 3.14f;  // 32 bit
        float b = 3.14F;  // 32 bit

        // double (precision 15-16 digits),
        double c = 3.14519;  // 64 bit

        // char (0 - 255) ASCII?,
        // use only single quotes or the IDE will want to convert it to a String
        char myChar = 'a';
        char myNumber = '7';
        char mySymbol = '$';
        char newLine = '\n';
        char tab = '\t';

        // boolean (true/false)
        boolean isReady = true;
        boolean isRaining = false;

        isRaining = true;
        isReady = false;

        // Non-primitive data types:

        // String
        // Array
        // Class

        System.out.println(DataTypes.additionFunction());
        System.out.println(DataTypes.playWithBooleans());

    }

    // We have the following code:
    // Create a new variable called y and assign the value "3" to it

    public static int additionFunction(){

        int x = 7;
        int y = 3;

        return x + y;
    }

    public static boolean playWithBooleans(){

        // Create your boolean variable "b1" here
        // assign true value to b1.

        boolean b1 = true;

        return b1;
    }

}


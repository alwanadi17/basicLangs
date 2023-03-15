package com.tutorial;

public class Main {
    public static void main(String[] args) {
        // java primitive data type
        //primitive data means it has fixed size
        //such as byte short int long float double char bool

        //int (bilangan bulat)
        int i = 10;
        System.out.println("===========INT===========");
        System.out.println("int i = " + i);
        System.out.println("int max : " + Integer.MAX_VALUE);
        System.out.println("int min : " + Integer.MIN_VALUE);
        System.out.println("int byte size : " + Integer.BYTES);
        System.out.println("int bit size : " + Integer.SIZE);

        //short (bilangan bulat)
        short s = 10;
        System.out.println("===========SHORT===========");
        System.out.println("short s = " + s);
        System.out.println("short max : " + Short.MAX_VALUE);
        System.out.println("short min : " + Short.MIN_VALUE);
        System.out.println("short byte size : " + Short.BYTES);
        System.out.println("short bit size : " + Short.SIZE);

        //long (bilangan bulat)
        long l = 10;
        System.out.println("===========LONG===========");
        System.out.println("long l = " + l);
        System.out.println("long max : " + Long.MAX_VALUE);
        System.out.println("long min : " + Long.MIN_VALUE);
        System.out.println("long byte size : " + Long.BYTES);
        System.out.println("long bit size : " + Long.SIZE);

        //byte (bilangan bulat)
        byte b = 10;
        System.out.println("===========BYTE===========");
        System.out.println("byte b = " + b);
        System.out.println("byte max : " + Byte.MAX_VALUE);
        System.out.println("byte min : " + Byte.MIN_VALUE);
        System.out.println("byte byte size : " + Byte.BYTES);
        System.out.println("byte bit size : " + Byte.SIZE);

        //float (bilangan desimal)
        float f = 10.5f;
        System.out.println("===========FLOAT===========");
        System.out.println("float f = " + f);
        System.out.println("float max : " + Float.MAX_VALUE);
        System.out.println("float min : " + Float.MIN_VALUE);
        System.out.println("float byte size : " + Float.BYTES);
        System.out.println("float bit size : " + Float.SIZE);

        //double (bilangan desimal)
        double d = 10.5d;
        System.out.println("===========DOUBLE===========");
        System.out.println("double d = " + d);
        System.out.println("double max : " + Double.MAX_VALUE);
        System.out.println("double min : " + Double.MIN_VALUE);
        System.out.println("double byte size : " + Double.BYTES);
        System.out.println("double bit size : " + Double.SIZE);

        //char (karakter based on ASCII)
        char c = 65;
        System.out.println("===========CHAR===========");
        System.out.println("char c = " + c);
        System.out.println("char max : " + Character.MAX_VALUE);
        System.out.println("char min : " + Character.MIN_VALUE);
        System.out.println("char byte size : " + Character.BYTES);
        System.out.println("char bit size : " + Character.SIZE);

        //bool (boolean true or false)
        boolean bol = true;
        System.out.println("===========INT===========");
        System.out.println("bool bol = " + bol);
        System.out.printf("bool false : %B\n", null);
        System.out.printf("bool true : %B\n", true);

    }
}

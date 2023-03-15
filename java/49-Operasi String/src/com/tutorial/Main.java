package com.tutorial;

public class Main {
    public static void main(String[] args) {
        String str = "hello world";

        System.out.println("String operation");
        System.out.println("str = " + str);

        //charAt
        System.out.println();
        System.out.println("charAt();");
        System.out.println("str.charAt(0) = " + str.charAt(0));
        System.out.println("str.charAt(1) = " + str.charAt(1));

        //substring
        System.out.println();
        System.out.println("substring();");
        System.out.println("str.substring(0,5) = " + str.substring(0,5));
        
        //concat
        System.out.println();
        System.out.println("str + \", have a great day\" = " + str + ", have a great day");
        System.out.println("str = " + str);
        //need new variable to store
        
        //concat with non-string
        int n = 100;
        String str1 = "There is " + n + " sheep";
        System.out.println("str1 = " + str1);
        
        //lowercase and uppercase
        System.out.println();
        System.out.println("lowercase");
        System.out.println("str1.toLowerCase() = " + str1.toLowerCase());
        System.out.println();
        System.out.println("uppercase");
        System.out.println("str1.toUpperCase() = " + str1.toUpperCase());
        System.out.println("str1 = " + str1);


        //replace
        System.out.println();
        System.out.println("replace");
        System.out.println("str1.replace(\"sheep\", \"flowers\") = " + str1.replace("sheep", "flowers"));
        System.out.println("str1 = " + str1);
        //need to assign to replace

        //equality
        System.out.println();
        System.out.println("equals");
        str = "hello";
        System.out.println("str = " + str);
        String tmp = new String("hello");
        System.out.println("tmp = " + tmp);

        if (str == tmp) {
            System.out.println("sama");
        } else {
            System.out.println("tidak sama, it has different address. Use equal");
        }

        System.out.println();

        if (str.equals(tmp))
            System.out.println("sama");
        else
            System.out.println("tidak sama");

    }
}

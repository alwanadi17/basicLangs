package com.tutorial;

import java.util.Formatter;

public class Main {
    public static void main(String[] args) {
        //string formatter = [argument_index$][flags][width][.precision]conversion

        //[argument_index$]
        String name = "Alwan";
        System.out.println("argument index");
        System.out.printf("%1$s lahir di mana?\n%1$s: Saya lahir di Bekasi\n",name);

        //[flags]
        System.out.println();
        System.out.println("flags");
        int pos = 3;
        int neg = -3;
        System.out.printf("%d - %d = %+d\n", pos,neg,pos-neg);
        System.out.printf("%d - %d = %+d\n", neg,pos,neg-pos);

        //width
        System.out.println();
        System.out.println("width");
        int n = 1000000;
        System.out.println("INTEGER");
        System.out.printf("%d\n",n);
        System.out.printf("%10d\n",n); //rata kanan dengan batas n
        System.out.printf("%-10d\n",n); //rata kiri dengan batas dari kiri
        System.out.printf("%+10d\n",n); //with flag
        System.out.printf("%-+10d\n",n);//menggabungkan flag
        System.out.printf("%+-10d\n",n);//have the same results
        System.out.println();
        System.out.println("leading");
        System.out.printf("%010d\n",n);//Leading. compiler confused with leading other than 0
        System.out.printf("%+010d\n",n);//with flag
        System.out.println();
        System.out.println("comma");
        System.out.printf("%,15d\n",n);//',' (comma), sebagai delimiter per seribu
        System.out.printf("%0,15d\n",n);//jajal with leading
        System.out.printf("%+0,15d\n",n);//with flag

        //.precision
        System.out.println();
        System.out.println(".precision");
        System.out.println("FLOATING POINT");
        float f = (float)Math.PI;
        double d = 3213321.321323123d;
        System.out.printf("%f\n",f);
        System.out.printf("%.2f\n",f); //with .precision
        System.out.printf("%8.2f\n",f); //with width
        System.out.printf("%+08.2f\n",f);//with flag
        System.out.printf("%,.2f\n",d); //with delimiter
        System.out.println();

        //use case
        System.out.println("Use case");
        String nama = "Alwan";
        float ipk = 3.9879798797f;
        String str = "Dia bernama " + nama + ", IPK-nya " + ipk;
        System.out.println("str = " + str);
        str = String.format("Namanya %s, %1$s ber-IPK %.2f",nama,ipk);
        System.out.println("str = " + str);
        System.out.println();

        //StringBuilder
        StringBuilder strBuild = new StringBuilder();
        Formatter form = new Formatter(strBuild);

        System.out.println("StringBuilder");
        form.format("Namanya %s, %1$s ber-IPK %.2f",nama,ipk);
        System.out.println("strBuild = " + strBuild);
        System.out.println("form = " + form);

        
    }
}

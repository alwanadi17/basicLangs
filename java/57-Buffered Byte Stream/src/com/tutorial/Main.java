package com.tutorial;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        //open file
        FileInputStream inputByte = new FileInputStream("input.txt");
        System.out.println("inputByte.available() = " + inputByte.available());

        //count time of byte stream
        long start, finish;
        start = System.nanoTime();
        System.out.println(inputByte.readAllBytes());
        finish = System.nanoTime();
        System.out.println("time = " + (finish-start));

        inputByte.close();

        //count time of buffered byte stream
        inputByte = new FileInputStream("input.txt");
        BufferedInputStream bufferedInput = new BufferedInputStream(inputByte);

        bufferedInput.mark(bufferedInput.available());
        start = System.nanoTime();
        System.out.println(bufferedInput.readAllBytes());
        finish = System.nanoTime();
        System.out.println("time = " + (finish-start));

        //store buffer to variable
        bufferedInput.reset();
        byte[] data = bufferedInput.readAllBytes();
        String strIn = new String(data);
        System.out.println("strIn = " + strIn);

        //write to file
        FileOutputStream outputByte = new FileOutputStream("output.txt");
        BufferedOutputStream bufferedOutput = new BufferedOutputStream(outputByte);

        bufferedOutput.write(data,0,data.length);
        bufferedOutput.flush();

        inputByte.close();
        outputByte.close();
        bufferedInput.close();
        bufferedOutput.close();
    }
}

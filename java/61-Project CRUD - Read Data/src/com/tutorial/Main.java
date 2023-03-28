package com.tutorial;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner menuInput = new Scanner(System.in);
        String userInput;
        boolean isContinue = true;

        while (isContinue) {
            System.out.println("Database Perpustakaan\n");
            System.out.println("1.\tList data buku");
            System.out.println("2.\tCari data buku");
            System.out.println("3.\tTambah data buku");
            System.out.println("4.\tUbah data buku");
            System.out.println("5.\tHapus data buku");
            System.out.println("0.\tKeluar Program");

            System.out.print("\nPilihan anda: ");
            userInput = menuInput.next();

            switch (userInput) {
                case "1" -> {
                    System.out.println("\n=================");
                    System.out.println("LIST SELURUH BUKU");
                    System.out.println("=================");
                    //tampilkan data
                    try {
                        printBooks();
                    } catch (IOException e) {
                        System.err.println("\nDatabase tidak ditemukan");
                        System.err.println(e);
                    }
                }
                case "2" -> {
                    System.out.println("\n=========");
                    System.out.println("CARI BUKU");
                    System.out.println("=========");
                }
                //cari data
                case "3" -> {
                    System.out.println("\n================");
                    System.out.println("TAMBAH DATA BUKU");
                    System.out.println("================");
                    //tambah data
                    addBook();
                }
                case "4" -> {
                    System.out.println("\n==============");
                    System.out.println("UBAH DATA BUKU");
                    System.out.println("==============");
                }
                //ubah data
                case "5" -> {
                    System.out.println("\n===============");
                    System.out.println("HAPUS DATA BUKU");
                    System.out.println("===============");
                }
                //hapus data
                case "0" -> {
                    System.out.println("Keluar program");
                    return;
                }
                default -> {
                    System.err.println("\nInput tidak ditemukan" +
                            "\nSilahkan pilih [1-5]");
                    continue;
                }
            }

            isContinue = getYesNo("Apakah anda ingin melanjutkan");
        }
    }

    private static void printBooks() throws IOException {
        FileReader dataIn;
        BufferedReader reader;

        dataIn = new FileReader("database.txt");
        reader = new BufferedReader(dataIn);

        System.out.printf("\n| %2s |\t%-7s |\t%-20s |\t%-20s |\tJudul Buku\n", "No", "Tahun", "Penulis", "Publisher");
        System.out.println("----------------------------------------------------------------------------------------");

        String line = reader.readLine();
        StringTokenizer strLine;
        int index = 0;
        while (line != null) {
            strLine = new StringTokenizer(line, ",");
            strLine.nextToken();
            System.out.printf("| %02d ", ++index); //no
            System.out.printf("|\t%-7s ", strLine.nextToken()); //tahun
            System.out.printf("|\t%-20s ", strLine.nextToken()); //penulis
            System.out.printf("|\t%-20s ", strLine.nextToken()); //publisher
            System.out.printf("|\t%s\n", strLine.nextToken()); //judul

            line = reader.readLine();
        }

        System.out.println("----------------------------------------------------------------------------------------");


        dataIn.close();
        reader.close();
    }

    private static void addBook() {
        boolean isContinue = true;

        while(isContinue) {
            System.out.println("we can add a book here");

            isContinue = getYesNo("Apakah anda ingin menambah buku");
        }
    }

    private static boolean getYesNo(String message) {
        Scanner menuInput = new Scanner(System.in);
        String userInput;

        System.out.print("\n"+ message + " (y/n)?");
        userInput = menuInput.next();

        while (!(userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("n"))) {
            System.err.println("Input anda bukan y atau n");
            System.out.print("\n"+ message + " (y/n)?");
            userInput = menuInput.next();
        }

        return userInput.equalsIgnoreCase("y");

    }
}

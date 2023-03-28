package com.tutorial;

import java.io.IOException;
import java.util.Scanner;

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

            System.out.print("\nPilihan anda: ");
            userInput = menuInput.next();

            switch (userInput) {
                case "1":
                    System.out.println("\n=================");
                    System.out.println("LIST SELURUH BUKU");
                    System.out.println("=================");
                    //tampilkan data
                    printBooks();
                    break;
                case "2":
                    System.out.println("\n=========");
                    System.out.println("CARI BUKU");
                    System.out.println("=========");
                    //cari data
                    break;
                case "3":
                    System.out.println("\n================");
                    System.out.println("TAMBAH DATA BUKU");
                    System.out.println("================");
                    //tambah data
                    addBook();
                    break;
                case "4":
                    System.out.println("\n==============");
                    System.out.println("UBAH DATA BUKU");
                    System.out.println("==============");
                    //ubah data
                    break;
                case "5":
                    System.out.println("\n===============");
                    System.out.println("HAPUS DATA BUKU");
                    System.out.println("===============");
                    //hapus data
                    break;
                default:
                    System.err.println("\nInput tidak ditemukan" +
                            "\nSilahkan pilih [1-5]");
                    continue;
            }

            isContinue = getYesNo("Apakah anda ingin melanjutkan");
        }
    }

    private static void printBooks() {
        System.out.println("we will do something cool here");

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

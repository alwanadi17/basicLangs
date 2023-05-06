package com.tutorial;

//java library
import java.io.*;
import java.util.Scanner;

//local library
import CRUD.Operation;
import CRUD.Utility;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner terminalInput = new Scanner(System.in);
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
            userInput = terminalInput.next();

            switch (userInput) {
                case "1" -> {
                    System.out.println("\n=================");
                    System.out.println("LIST SELURUH BUKU");
                    System.out.println("=================");
                    Operation.printBooks();
                }
                case "2" -> {
                    System.out.println("\n=========");
                    System.out.println("CARI BUKU");
                    System.out.println("=========");
                    Operation.searchData();
                }
                case "3" -> {
                    System.out.println("\n================");
                    System.out.println("TAMBAH DATA BUKU");
                    System.out.println("================");
                    Operation.addBook();
                }
                case "4" -> {
                    System.out.println("\n==============");
                    System.out.println("UBAH DATA BUKU");
                    System.out.println("==============");
                    Operation.updateData();
                }
                case "5" -> {
                    System.out.println("\n===============");
                    System.out.println("HAPUS DATA BUKU");
                    System.out.println("===============");
                    Operation.deleteData();
                }
                case "0" -> {
                    System.out.println("Keluar program");
                    return;
                }
                default -> {
                    System.err.println("\nInput tidak ditemukan\nSilahkan pilih [1-5]");
                    continue;
                }
            }

            isContinue = Utility.getYesNo("Apakah anda ingin melanjutkan");
        }
    }
}
package com.tutorial;

import java.io.*;
import java.time.Year;
import java.util.Scanner;
import java.util.StringTokenizer;

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
                    printBooks();
                }
                case "2" -> {
                    System.out.println("\n=========");
                    System.out.println("CARI BUKU");
                    System.out.println("=========");
                    searchData();
                }
                case "3" -> {
                    System.out.println("\n================");
                    System.out.println("TAMBAH DATA BUKU");
                    System.out.println("================");
                    addBook();
                }
                case "4" -> {
                    System.out.println("\n==============");
                    System.out.println("UBAH DATA BUKU");
                    System.out.println("==============");
                    //ubah data
                }
                case "5" -> {
                    System.out.println("\n===============");
                    System.out.println("HAPUS DATA BUKU");
                    System.out.println("===============");
                    deleteData();
                }
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

        try {
            dataIn = new FileReader("database.txt");
            reader = new BufferedReader(dataIn);
        } catch (Exception e) {
            System.err.println("Database tidak ditemukan");
            System.err.println(e);
            System.err.println("Silahkan tambahkan data terlebih dahulu");
            addBook();
            return;
        }

        printBatasAtas();

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
        printBatasBawah();

        dataIn.close();
        reader.close();
    }

    private static void searchData() throws IOException {

        //check database
        try {
            File database = new File("database.txt");
        } catch (Exception e) {
            System.err.println("Database tidak ditemukan");
            System.err.println(e);
            System.err.println("Silahkan tambahkan data terlebih dahulu");
            addBook();
            return;
        }

        //ambil dan split user input
        Scanner userInput = new Scanner(System.in);

        System.out.print("Masukkan kata kunci untuk mecari buku: ");
        String input = userInput.nextLine();
        String[] splitInput = input.split("\\s+");

        //cek keywords in database then display it
        keysInDatabase(splitInput, true);
    }

    private static boolean keysInDatabase (String[] keywords, boolean isDisplay) throws IOException {
        FileReader database = new FileReader("database.txt");
        BufferedReader buffer = new BufferedReader(database);

        String line = buffer.readLine();

        if (isDisplay) printBatasAtas();

        boolean isExist = true;
        int index = 0;
        while (line != null) {
            isExist = true;
            for (String keyword : keywords) {
                isExist = isExist && line.toLowerCase().contains(keyword.toLowerCase());
            }

            if (isExist) {
                if (isDisplay) {
                    StringTokenizer strLine = new StringTokenizer(line, ",");
                    strLine.nextToken();
                    System.out.printf("| %02d ", ++index); //no
                    System.out.printf("|\t%-7s ", strLine.nextToken()); //tahun
                    System.out.printf("|\t%-20s ", strLine.nextToken()); //penulis
                    System.out.printf("|\t%-20s ", strLine.nextToken()); //publisher
                    System.out.printf("|\t%s\n", strLine.nextToken()); //judul
                } else {
                    break;
                }
            }

            line = buffer.readLine();
        }
        if (isDisplay) printBatasBawah();

        return isExist;
    }

    private static void addBook() throws IOException{
        FileWriter fileWriter = new FileWriter("database.txt", true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        //user input
        Scanner terminalInput = new Scanner(System.in);
        String penulis, judul, tahun, penerbit;
        System.out.println("Silahkan input data: ");
        System.out.print("Penulis             : ");
        penulis = terminalInput.nextLine();
        System.out.print("Judul               : ");
        judul = terminalInput.nextLine();
        System.out.print("Tahun, format(YYYY) : ");
        tahun = ambilTahun();
        System.out.print("Penerbit            : ");
        penerbit = terminalInput.nextLine();

        //database check
        String[] keywords = {tahun + "," + penulis + "," + penerbit + "," + judul};

        boolean isExist = keysInDatabase(keywords, false);

        if (!isExist) {
            String primaryKey = getPrimaryKey(penulis, tahun);

            System.out.println("\nData yang ingin anda masukkan adalah:");
            System.out.println("Primary key    : " + primaryKey);
            System.out.println("Tahun terbit   : " + tahun);
            System.out.println("Penulis        : " + penulis);
            System.out.println("Judul          : " + judul);
            System.out.println("Penerbit       : " + penerbit);

            boolean isAdd = getYesNo("Apakah anda ingin menambahkan data buku?");

            if (isAdd) {
                String writeBuffer = primaryKey + "," + keywords[0];
                bufferedWriter.write(writeBuffer);
                bufferedWriter.newLine();
                bufferedWriter.flush();
                System.out.println("Buku berhasil ditambahkan!");
                printBooks();
            }
        } else {
            System.out.println("Data buku sudah ada dengan data: ");
            keysInDatabase(keywords, true);
        }

        fileWriter.close();
        bufferedWriter.close();
    }

    private static String getPrimaryKey(String penulis, String tahun) throws IOException {
        String primaryKey;

        String nameNoSpace = penulis.replaceAll("\\s", "");
        long entry = getNoEntry(nameNoSpace, tahun) + 1;
        primaryKey = nameNoSpace + "_" + tahun + "_" + entry;

        return primaryKey;
    }

    private static long getNoEntry(String penulis, String tahun) throws IOException {
        FileReader fileReader = new FileReader("database.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        long entry = 0;

        String line = bufferedReader.readLine();
        Scanner dataScanner;
        String primaryKey;

        while (line != null) {
            dataScanner = new Scanner(line);
            dataScanner.useDelimiter(",");
            primaryKey = dataScanner.next(); //take the primary key
            dataScanner = new Scanner(primaryKey);
            dataScanner.useDelimiter("_");

            //first next() takes the name, second next() takes the year, last next() takes the entry
            if (penulis.equalsIgnoreCase(dataScanner.next()) && tahun.equalsIgnoreCase(dataScanner.next())) {
                entry = Long.parseLong(dataScanner.next());
            }
            line = bufferedReader.readLine();
        }

        return entry;
    }

    private static String ambilTahun() {
        boolean tahunValid = false;

        Scanner terminalInput = new Scanner(System.in);
        String tahun = terminalInput.nextLine();

        while(!tahunValid) {
            try {
                Year.parse(tahun);
                tahunValid = true;
            } catch (Exception E) {
                System.err.println("Format tahun yang dimasukkan salah");
                System.out.print("Silahkan masukkan tahun terbit lagi, format (YYYY): ");
                tahun = terminalInput.nextLine();
            }
        }

        return tahun;
    }

    private static void deleteData() throws IOException {
        File db = new File("database.txt");
        FileReader dbRead = new FileReader(db);
        BufferedReader dbBuffer = new BufferedReader(dbRead);

        File temp = new File("temp.txt");
        FileWriter tempWrite = new FileWriter(temp);
        BufferedWriter tempBuffer = new BufferedWriter(tempWrite);

        //print isi database
        printBooks();

        //user input entry
        Scanner terminalInput = new Scanner(System.in);
        int deleteEntry;

        System.out.print("Silahkan masukkan nomor buku yang ingin dihapus: ");
        deleteEntry = terminalInput.nextInt();

        //loop and write every line till the EOF to tmp and skip the deleted part
        String line = dbBuffer.readLine();
        int entryCount = 0;

        while (line != null) {
            boolean isDelete = false;
            entryCount++;

            if (entryCount == deleteEntry) {
                StringTokenizer str = new StringTokenizer(line,",");

                System.out.println("Data buku yang akan dihapus:");
                System.out.println("Referensi       : " + str.nextToken());
                System.out.println("Tahun           : " + str.nextToken());
                System.out.println("Penulis         : " + str.nextToken());
                System.out.println("Penerbit        : " + str.nextToken());
                System.out.println("Judul           : " + str.nextToken());

                isDelete = getYesNo("Apakah anda yakin ingin menghapus data tersebut?");
            }
            if (isDelete) {
                System.out.println("Data berhasil dihapus!");
            } else {
                tempBuffer.write(line);
                tempBuffer.newLine();
            }

            line = dbBuffer.readLine();
        }
        tempBuffer.flush();

        //close the stream first before modifying the file
        dbRead.close();
        dbBuffer.close();
        tempWrite.close();
        tempBuffer.close();

        boolean delete = db.delete();
        boolean rename = temp.renameTo(db);

        printBooks();

    }
    private static boolean getYesNo(String message) {
        Scanner terminalInput = new Scanner(System.in);
        String userInput;

        System.out.print("\n"+ message + " (y/n)?");
        userInput = terminalInput.next();

        while (!(userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("n"))) {
            System.err.println("Input anda bukan y atau n");
            System.out.print("\n"+ message + " (y/n)?");
            userInput = terminalInput.next();
        }

        return userInput.equalsIgnoreCase("y");

    }

    private static void printBatasAtas() {
        System.out.printf("\n| %2s |\t%-7s |\t%-20s |\t%-20s |\tJudul Buku\n", "No", "Tahun", "Penulis", "Publisher");
        System.out.println("----------------------------------------------------------------------------------------");
    }

    private static void printBatasBawah() {
        System.out.println("----------------------------------------------------------------------------------------");
    }

}
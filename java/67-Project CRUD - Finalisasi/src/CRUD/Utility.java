package CRUD;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Year;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Utility {
    static boolean keysInDatabase (String[] keywords, boolean isDisplay) throws IOException {
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

        database.close();
        buffer.close();

        return isExist;
    }

    static String getPrimaryKey(String penulis, String tahun) throws IOException {
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

        fileReader.close();
        bufferedReader.close();

        return entry;
    }

    static String ambilTahun() {
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

    static boolean isChangeData (String data) {
        return getYesNo("Apakah anda ingin mengganti data " + data);
    }

    public static boolean getYesNo(String message) {
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

    static void printBatasAtas() {
        System.out.printf("\n| %2s |\t%-7s |\t%-20s |\t%-20s |\tJudul Buku\n", "No", "Tahun", "Penulis", "Publisher");
        System.out.println("----------------------------------------------------------------------------------------");
    }

    static void printBatasBawah() {
        System.out.println("----------------------------------------------------------------------------------------");
    }
}

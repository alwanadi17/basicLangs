package CRUD;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Operation {
    public static void printBooks() throws IOException {
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

        Utility.printBatasAtas();

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
        Utility.printBatasBawah();

        dataIn.close();
        reader.close();
    }

    public static void searchData() throws IOException {

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
        Utility.keysInDatabase(splitInput, true);
    }

    public static void addBook() throws IOException{
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
        tahun = Utility.ambilTahun();
        System.out.print("Penerbit            : ");
        penerbit = terminalInput.nextLine();

        //database check
        String[] keywords = {tahun + "," + penulis + "," + penerbit + "," + judul};

        boolean isExist = Utility.keysInDatabase(keywords, false);

        if (!isExist) {
            String primaryKey = Utility.getPrimaryKey(penulis, tahun);

            System.out.println("\nData yang ingin anda masukkan adalah:");
            System.out.println("Primary key    : " + primaryKey);
            System.out.println("Tahun terbit   : " + tahun);
            System.out.println("Penulis        : " + penulis);
            System.out.println("Judul          : " + judul);
            System.out.println("Penerbit       : " + penerbit);

            boolean isAdd = Utility.getYesNo("Apakah anda ingin menambahkan data buku?");

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
            Utility.keysInDatabase(keywords, true);
        }

        fileWriter.close();
        bufferedWriter.close();
    }

    public static void updateData() throws IOException {
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
        int updateEntry;

        System.out.print("Silahkan masukkan nomor buku yang ingin diupdate: ");
        updateEntry = terminalInput.nextInt();

        //update data, need to check if it exists or not before writing it
        String line = dbBuffer.readLine();
        int entryCount = 0;

        String penulis, judul, tahun, penerbit, editedLine = "";
        boolean updateLastEntry = false;
        while (line != null) {
            boolean isUpdate = false;
            String tmpLine = line;
            entryCount++;

            if (entryCount == updateEntry) {
                StringTokenizer str = new StringTokenizer(line,",");

                System.out.println("Data buku yang akan diupdate:");
                System.out.println("Referensi       : " + str.nextToken());
                tahun = str.nextToken();
                System.out.println("Tahun           : " + tahun);
                penulis = str.nextToken();
                System.out.println("Penulis         : " + penulis);
                penerbit = str.nextToken();
                System.out.println("Penerbit        : " + penerbit);
                judul = str.nextToken();
                System.out.println("Judul           : " + judul);

                if (Utility.isChangeData("Tahun")) {
                    System.out.print("Tahun               : ");
                    tahun = Utility.ambilTahun();
                }
                if (Utility.isChangeData("Penulis")) {
                    System.out.print("Penulis             : ");
                    penulis = terminalInput.next();
                    penulis = penulis + terminalInput.nextLine();
                }
                if (Utility.isChangeData("Penerbit")) {
                    System.out.print("Penerbit            : ");
                    penerbit = terminalInput.nextLine();
                    penerbit = penerbit + terminalInput.nextLine();
                }
                if (Utility.isChangeData("Judul")) {
                    System.out.print("Judul               : ");
                    judul = terminalInput.next();
                    judul = judul + terminalInput.nextLine();
                }

                //check data di database
                String[] keywords = {tahun + "," + penulis + "," + penerbit + "," + judul};
                boolean isExist = Utility.keysInDatabase(keywords, false);
                if (isExist) {
                    System.out.println("Data buku sudah ada dengan data: ");
                    Utility.keysInDatabase(keywords, true);
                } else {
                    //get primary key of the new data
                    String primaryKey = Utility.getPrimaryKey(penulis, tahun);

                    System.out.println("Data buku yang akan diupdate:");
                    System.out.println("Referensi       : " + primaryKey); //confused of primary key
                    System.out.println("Tahun           : " + tahun);
                    System.out.println("Penulis         : " + penulis);
                    System.out.println("Penerbit        : " + penerbit);
                    System.out.println("Judul           : " + judul);
                    editedLine = primaryKey + "," + keywords[0];
                    updateLastEntry = true;
                }
                if (!isExist) {
                    isUpdate = Utility.getYesNo("Apakah anda ingin menyimpan perubahan");
                }
            }
            if (isUpdate) {
                System.out.println("Data berhasil diubah!");
            } else {
                tempBuffer.write(line);
                tempBuffer.newLine();
            }

            line = dbBuffer.readLine();
        }

        //put edited data to the last entry
        if (updateLastEntry) {
            tempBuffer.write(editedLine);
            tempBuffer.newLine();
        }

        tempBuffer.flush();

        //close the stream first before modifying the file
        dbBuffer.close();
        dbRead.close();
        tempBuffer.close();
        tempWrite.close();

        boolean delete = db.delete();
        boolean rename = temp.renameTo(db);

        printBooks();
    }

    public static void deleteData() throws IOException {
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

                isDelete = Utility.getYesNo("Apakah anda yakin ingin menghapus data tersebut?");
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
}

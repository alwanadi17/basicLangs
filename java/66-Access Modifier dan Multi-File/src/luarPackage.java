import com.tutorial.bukanMain;

public class luarPackage {
    public static void main(String[] args) {
        //file di luar package hanya bisa mengakses public
        System.out.println("Luar package: ");
        bukanMain.publicbukanMain();
    }
}

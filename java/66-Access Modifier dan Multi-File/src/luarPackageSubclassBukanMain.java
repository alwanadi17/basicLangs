import com.tutorial.bukanMain;
public class luarPackageSubclassBukanMain extends bukanMain{
    public static void main(String[] args) {
        System.out.println("Subclass luar package");
        publicbukanMain();
        //dapat mengakses protected karena termasuk subclassnya
        protectedbukanMain();
    }
}

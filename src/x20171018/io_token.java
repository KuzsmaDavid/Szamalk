package x20171018;

/**
 * @author Fenyvesi Tibor
 */
import java.util.Scanner;
import java.util.StringTokenizer;

public class io_token {

  public static void main(String[] args) {
    int notTheActualEvents;
    int sum = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Kérek több egész számot vesszővel elválasztva!");
    String sor = sc.nextLine(); // sor beolvasása
    String noPointers = "";
    String Jo ="";

    // darabolás
    StringTokenizer st = new StringTokenizer(sor,","); // elválasztójel a vessző!
    //int db = st.countTokens(); //adatok (tokenek) száma
    int db=0;
    while (st.hasMoreTokens()) {
      try {
        notTheActualEvents = Integer.parseInt(st.nextToken());
        Jo+=notTheActualEvents+" ";
        sum+=notTheActualEvents;
        db++;
      } catch (Exception e) {
       noPointers+=e.getMessage().split(":")[1].trim().replace("\"", "")+";";
      }
    }
    System.out.println("A beolvasott számok (" + db + " db) összege: " + sum);
  }
}

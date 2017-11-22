package x20171108;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author PureD
 */
class Diak implements Serializable {

  String nev;
  Integer kor;

  @Override
  public String toString() {
    return nev+" "+kor;
  }
  
}

public class Sorositas {

  //make()-sorosít
  private static void make() throws FileNotFoundException, IOException {
    Diak Sanyi = new Diak();
    Sanyi.nev = "NagySzandor";
    Sanyi.kor = 32;
    Diak Eszmeralda = new Diak();
    Eszmeralda.nev = "Pityinger Eszmeralda";
    Eszmeralda.kor = 42;
    FileOutputStream fos = new FileOutputStream("data.txt");
    ObjectOutputStream oos = new ObjectOutputStream(fos);
    oos.writeObject(Sanyi);
    oos.writeObject(Eszmeralda);
    oos.close();
    fos.close();
  }
  //load()-desorosít

  private static void load() throws FileNotFoundException, IOException, ClassNotFoundException {
    Diak egy = new Diak();
    Diak ketto = new Diak();
    FileInputStream fis = new FileInputStream("data.txt");
    ObjectInputStream ois = new ObjectInputStream(fis);
    egy = (Diak) ois.readObject();
    ketto = (Diak) ois.readObject();
    ois.close();
    fis.close();
    System.out.println(egy.nev + " " + egy.kor);
    System.out.println(ketto.nev + " " + ketto.kor);
  }

  private static void load2() throws FileNotFoundException, IOException, ClassNotFoundException {
    FileInputStream fis = new FileInputStream("data.txt");
    ObjectInputStream ois = new ObjectInputStream(fis);
    try {
     while(true){
       Diak d = (Diak)ois.readObject();
       System.out.println(d.nev);
       System.out.println(d.kor);
     }
    }catch(IOException | ClassNotFoundException e){}
    ois.close();
    fis.close();
  }
  private static void load3() throws FileNotFoundException, IOException, ClassNotFoundException {
    FileInputStream fis = new FileInputStream("data.txt");
    ObjectInputStream ois = new ObjectInputStream(fis);
    try {
     while (ois.read()==-1) {
      Diak d = (Diak)ois.readObject();
      System.out.println(d.toString());
    } 
    } catch (Exception e) {
    }
    ois.close();
    fis.close();
  }
  

  public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
    make();
    load3();
  }
}

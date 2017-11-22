package x20170920;
import java.util.Random;

/**
 *
 * @author PureD
 */
public class SzemSzamGen {
    
    static Random rnd = new Random();
    public static String szemszamgen() {
        int[] szemszam = new int[11];
        szemszam[0] = rnd.nextInt(8) + 1;
        szemszam[1] = rnd.nextInt(10);
        szemszam[2] = rnd.nextInt(10);
        szemszam[3] = rnd.nextInt(2);
        if (szemszam[3] == 1) {
            szemszam[4] = rnd.nextInt(3);
        } else {
            szemszam[4] = rnd.nextInt(9) + 1;
        }
        if (szemszam[3] == 0 && szemszam[4] == 2) {
            szemszam[5] = rnd.nextInt(3);
            if (szemszam[5] == 2){
                if(szokoev(szemszam))
                szemszam[6] = rnd.nextInt(8);
                else szemszam[6] = rnd.nextInt(8);
                
            } else {
                szemszam[6] = rnd.nextInt(10);
            }
        }else if(paroshonap(szemszam)){
            if (szemszam[5] == 3) {
                szemszam[6] = rnd.nextInt(2);
            } else {
                szemszam[6] = rnd.nextInt(10);
            }
        }else{
            if (szemszam[5] == 3) {
                szemszam[6] = 0;
            } else {
                szemszam[6] = rnd.nextInt(10);
            }
        }
        szemszam[7] = rnd.nextInt(10);
        szemszam[8] = rnd.nextInt(10);
        szemszam[9] = rnd.nextInt(10);
        szemszam[10]=lastInt(szemszam);
       String kesz="";
        for (int i = 0; i < szemszam.length; i++) {
            kesz=kesz+szemszam[i];
        }
        return kesz;
    }
    private static boolean paroshonap(int[] honap) {
       boolean paros = false;
       if(honap[4]%2==0) paros=true;
       return paros;
    }

    private static boolean szokoev(int[] szemszam) {
    boolean szokoev = false;
       String egyben = "honap[1]honap[2]";
       int szam = Integer.valueOf(egyben);
       if(szam%4==0) szokoev=true;
       return szokoev;
    }
    public static int lastInt(int[] digits) {
        int val =(digits[0]);
        int sol;
            if (digits[0] ==3 || digits[0] == 4 || digits[0] == 7 || digits[0] == 8) {
            for (int i = 1; i < digits.length - 1; i++) {
                val = val + (digits[i] * (i));
            }
        } else {
                int cnt=1;
            val = digits[digits.length - 1];
            for (int i = digits.length - 2; i >= 0; i--) {
                val = val + digits[i] * (cnt);
            }
        }
            sol = val%11;
            if (sol==10)sol=1;
        return sol;
    }
}

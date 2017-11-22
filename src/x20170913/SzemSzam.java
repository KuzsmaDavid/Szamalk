package x20170913;

public class SzemSzam {
    private static String id;
    private static char[] digits;
    private static boolean valid;

        public static void setID(String id){
        SzemSzam.id=id;
    }
    private static void ValidCheck() {
        digits = id.toCharArray();
        valid = false;
        int val = Character.getNumericValue(digits[0]);
        int first=Character.getNumericValue(digits[0]);
        if (first == 1 || first == 2 || first == 5 || first == 6) {
            for (int i = 1; i < digits.length - 1; i++) {
                val = val + (Character.getNumericValue(digits[i]) * (i + 1));
            }
        } else {
            int cnt=10;
            for (int i =1; i < digits.length - 1; i++) {
                val = val + (Character.getNumericValue(digits[i]) * (cnt--));
            }
        }
        if (val % 11 == 10 && Character.getNumericValue(digits[digits.length - 1])==1 ||  val % 11 == Character.getNumericValue(digits[digits.length - 1])) {
            valid = true;
        }
    }
    public static String checkValNnG(){
      ValidCheck();
      String  str="Te aztán egy ";
      if(valid){
          str+="valód ";
      }else{
          str+="hamis ";
      }
      if(Character.getNumericValue(digits[0])<=4){
      str+="magyar ";
      }else{
      str+="külsős ";
      }
      if(Character.getNumericValue(digits[0])%2==0){
          str+="nőlény ";
      }else{
      str+="férfi úr ";
      }
      str+="vagy!";
      return str;
    }
}

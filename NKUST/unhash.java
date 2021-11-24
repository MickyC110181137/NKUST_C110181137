import java.util.ArrayList;

public class unhash {
    public static void main (String[] args) {
        System.out.println(revHash(6933552791181934L));
        System.out.println(hash("justdoit")); //574318821802
    }

    public static String letters = "cdefghijlmnoqstuvxz";

    public static ArrayList<java.lang.Character> revHash(long hash) {
        ArrayList<Character> word = new ArrayList<Character>();
        ArrayList<Character> word2 = new ArrayList<Character>();
        int  k = 0;
        double b;
        long a = 6933552791181934L;
        for (int j = 0; j <= 18; j++) {
            b = (a - j) % 23;
            if (b == 0) {
                a = (a - j) / 23;
               /*System.out.println(j);
               System.out.println(a);
               System.out.println(letters.charAt(j));*/
                word.add(letters.charAt(j));
                j = 0;
                k++;
            }
            b = (a - j) % 23;
            if (b == 0) {
                a = (a - j) / 23;
               /*System.out.println(j);
               System.out.println(a);
               System.out.println(letters.charAt(j));*/
                word.add(letters.charAt(j));
                j = 0;
                k++;
            }
            if(a <= 7){
                break;
            }
        }
        //System.out.println(word);
        for(int z = k - 1; z >= 0; z--){
            word2.add(word.get(z));
        }
        //System.out.println(word2);
        return word2;
    }

    public static long hash(String s){
        long h = 7;
        for (int i = 0; i < s.length(); i++){
            h = h * 23 + letters.indexOf(s.charAt(i));
        }
        return h;
    }
}

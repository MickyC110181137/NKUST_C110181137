class Hello_World1 {

    public static void main (String[] args) {

        System.out.println(hash("devgilno")); //574318821802
    }

    public static String letters = "cdefghijlmnoqstuvxz";



    public static long hash(String s){
        long h = 1;
        for (int i = 0; i < s.length(); i++){
            h = h * 23 + letters.indexOf(s.charAt(i));
        }
        return h;
    }
}
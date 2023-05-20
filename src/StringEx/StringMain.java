package StringEx;

public class StringMain {
    public static void main(String[] args) {
        String x = "ABC";
        //System.out.println(x.toLowerCase());
        String y = x.toLowerCase();
        //System.out.print(y);

        //Cele mai importante metode: concat, charAt, compareTo, startsWith, endsWith, indexOf(int), lastIndexOf. length, isBlank, isEmpty, replace, replaceAll, replaceFirst,split, substring, trim
        String a = "ARma are mereR";
        String b = "Ama are mere";
        String c = " R ";
        System.out.println(a.charAt(1));
        System.out.println(a.compareTo(b));
        System.out.println(a.charAt(1));
        System.out.println(a.endsWith(c));
        System.out.println(a.startsWith(c));
        System.out.println(a.indexOf(65, 10));
        System.out.println(a.indexOf("mere"));
        System.out.println("BBB".length());
        System.out.println("               ".isBlank());
        System.out.println("               ".isEmpty());
        System.out.println("               ".isBlank());
        System.out.println(a.replace('a','b'));
        System.out.println(a.replace("AR", "ar"));
        System.out.println(a.substring(3));
        System.out.println(c.trim());
        System.out.println(String.valueOf(true));
        System.out.println(getNrofOccurance('e', a));
        System.out.println(rev("abc"));

        StringBuilder u = new StringBuilder("");
        u.append("app");
        System.out.println(u.toString());


    }
    //metoda care numara de cate ori apare caracterul c in string-ul input
    public static int getNrofOccurance(char c, String input){
        int nr = 0;
        for (int i=0; i < input.length(); i++){
            if (input.charAt(i) == c){
                nr++;
            }
        }
        return nr;
    }

    // metoda care invereseaza sirul initial dat ca parametru
    public static String rev(String input){
        String result ="";
        for(int i = input.length() -1; i >=0; i--){
            result = result + input.charAt(i);


        }

    return result;

}





}
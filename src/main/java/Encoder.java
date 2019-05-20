import java.sql.Struct;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class Encoder {
    public static void main(String[] args) {
        System.out.println(encrypt(("HELLO WORLD")));
    }

    public static String encrypt(String plainText){
//        String offsetChar = "B";
        int offsetCharKey = ThreadLocalRandom.current().nextInt(0, 44);
        String offsetChar = shiftTable.get(offsetCharKey);
//        int offsetCharKey = getKey(shiftTable, offsetChar);
        StringBuilder plainTextShifted = new StringBuilder();
        for (int i = 0; i < plainText.length();i++ ){
            if(String.valueOf(plainText.charAt(i)).equals(" "))
                plainTextShifted.append(" ");
            else
                plainTextShifted.append(shiftTable.get((((getKey(shiftTable, String.valueOf(plainText.charAt(i)))-offsetCharKey)%44+44)%44)));}
        return offsetChar+plainTextShifted;
    }

    public static String decrypt(String encodedText){
        String offsetChar = String.valueOf(encodedText.charAt(0));
        int offsetCharKey = getKey(shiftTable, offsetChar);
        encodedText = encodedText.substring(1);
        StringBuilder encodedTextShifted = new StringBuilder();
        for (int i = 0; i < encodedText.length();i++ ){
            if(String.valueOf(encodedText.charAt(i)).equals(" "))
                encodedTextShifted.append(" ");
            else
                encodedTextShifted.append(shiftTable.get((((getKey(shiftTable, String.valueOf(encodedText.charAt(i)))+offsetCharKey)%44+44)%44)));}
        return String.valueOf(encodedTextShifted);
    }
    public static <K, V> K getKey(Map<K, V> map, V value) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (value.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }
    public static final Map<Integer, String > shiftTable = new HashMap<Integer, String>(){{
        put(0,"A");
        put(1,"B");
        put(2,"C");
        put(3,"D");
        put(4,"E");
        put(5,"F");
        put(6,"G");
        put(7,"H");
        put(8,"I");
        put(9,"J");
        put(10,"K");
        put(11,"L");
        put(12,"M");
        put(13,"N");
        put(14,"O");
        put(15,"P");
        put(16,"Q");
        put(17,"R");
        put(18,"S");
        put(19,"T");
        put(20,"U");
        put(21,"V");
        put(22,"W");
        put(23,"X");
        put(24,"Y");
        put(25,"Z");
        put(26,"0");
        put(27,"1");
        put(28,"2");
        put(29,"3");
        put(30,"4");
        put(31,"5");
        put(32,"6");
        put(33,"7");
        put(34,"8");
        put(35,"9");
        put(36,"(");
        put(37,")");
        put(38,"*");
        put(39,"+");
        put(40,",");
        put(41,"-");
        put(42,".");
        put(43,"/");
    }};
}

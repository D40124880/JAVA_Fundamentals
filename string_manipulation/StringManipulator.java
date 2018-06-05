import java.lang.*;

public class StringManipulator {
    public String trimAndConcat(String a, String b) {
        return ((a.trim()).concat(b.trim()));
    }

    public Integer getIndexOrNull(String a, char b) {
        if(a.indexOf(b) != -1){
            return a.indexOf(b);
        } else {
            return null;
        }
    }

    public Integer getIndexOrNull(String a, String b) {
        if(a.indexOf(b) != -1){
            return a.indexOf(b);
        }else{
            return null;
        }
    }

    public String concatSubstring(String a, int b, int c, String d){
        String word = a.substring(b, c);
        return word + d;
    }
}

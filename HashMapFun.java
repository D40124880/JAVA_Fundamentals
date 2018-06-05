import java.util.HashMap;
import java.util.Set;

public class HashMapFun{
    public static void main(String[] args){
        // we need put a key and a value to an array by inputting two strings or numbers or anything else--->shown on the next line
        HashMap<String, String> userMap = new HashMap<String, String>();
        userMap.put("nninja@codingdojo.com", "Nancy Ninja");
        userMap.put("ssamurai@codingdojo.com", "Sam Samurai");
        userMap.put("wwizard@codingdojo.com", "Walter Wizard");
    
        // the next line is to get the value of a certain key
        String name = userMap.get("nninja@codingdojo.com");

        // get the all the keys to print out by using the "keySet" method
        Set<String> keys = userMap.keySet();
        for(String key : keys) {
            System.out.println(key);
            System.out.println(userMap.get(key));    
        }
    }
}
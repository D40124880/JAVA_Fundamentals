import java.util.HashMap;
import java.util.Set;

public class Hashmatique{
    public static void main(String[] args){
        HashMap<String, String> tracking = new HashMap<String, String>();

        tracking.put("Suave", "My Meeeee!");
        tracking.put("Who am I?", "By Martin!");
        tracking.put("What can i say except your welcome!", "Jasmin!");
        tracking.put("Tequila Song", "Tan Tan!");

        System.out.println(tracking.get("Who am I?"));

        Set<String> keys = tracking.keySet();
        for(String key : keys) {
            System.out.println(key + ": " + tracking.get(key));
        }
    }
}

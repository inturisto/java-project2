import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Text {
    public static void main(String[] args) {
        String text = "Синоптики предупреждают о надвигающей грозе, возможных ливнх и граде";
        String[] words = text.split(" ");
        System.out.println(words.length);
        System.out.println(words[4]);

        for (int i = 0; i < words.length; i++) {
            System.out.println(i + " word= " + words[i]);
        }
        for (String word : words) {
            System.out.println(word);
        }

        List<String> names = new ArrayList<>();
        names.add("Valerij");
        names.add("Mihail");
        names.add("Veniamin");
        names.add("Aleksandr");

        System.out.println(names.get(1));

        for (String name : names) {
            System.out.println(name);
        }
        HashMap<String, Integer> bookUniqueWords = new HashMap<>();
        bookUniqueWords.put("the", 1);
        bookUniqueWords.put("student", 1);
        bookUniqueWords.put("is", 1);
        bookUniqueWords.put("the",2);
        for (Map.Entry<String,Integer> entry: bookUniqueWords.entrySet()
             ) {
            System.out.println(entry.getKey()+entry.getValue());
        }
    }

}


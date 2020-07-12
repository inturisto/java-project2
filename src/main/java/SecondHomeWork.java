import java.util.HashMap;
import java.util.Map;

public class SecondHomeWork {
    public static void main(String[] args) {
        SecondHomeWork homeWork = new SecondHomeWork();
        homeWork.wordCounterInArticle();
    }

    public void wordCounterInArticle() {
        String anyTextInputFromArticle = "Why isn’t anyone talking about this? Why are we not hearing a primal scream so deafening" +
                " that no plodding policy can be implemented without addressing the people buried by it? Why am I, a " +
                "food blogger best known for such hits as the All-Butter Really Flaky Pie Dough and The ‘I Want " +
                "Chocolate Cake’ Cake, sounding the alarm on this? I think it’s because when you’re home schooling all" +
                " day, and not performing the work you were hired to do until the wee hours of the morning, and do it " +
                "on repeat for 106 days (not that anyone is counting), you might be a bit too fried to funnel your rage" +
                " effectively.";

        String[] separatedWordsArray = anyTextInputFromArticle.toLowerCase().replaceAll("[^\\w\\s]", "").
                replaceAll("  *", " ").split(" ");
        System.out.println("Total word count in text = " + separatedWordsArray.length);
        System.out.println();

        HashMap<String, Integer> uniqueWordCounter = new HashMap<>();
        for (String wordEntry : separatedWordsArray) {
            uniqueWordCounter.put(wordEntry,
                    (uniqueWordCounter.get(wordEntry) == null ? 1 : (uniqueWordCounter.get(wordEntry) + 1)));
        }

        for (Map.Entry<String, Integer> mapOutput : uniqueWordCounter.entrySet()) {
            System.out.println(mapOutput.getKey() + " : " + mapOutput.getValue() + " times");
        }

        System.out.println();
        System.out.println("Unique word count in text = " + uniqueWordCounter.size());
    }
}
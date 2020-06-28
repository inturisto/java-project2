import java.math.BigDecimal;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

public class FirstHomeWorkJava {
    public static void main(String[] args) {
        FirstHomeWorkJava currencyConverter = new FirstHomeWorkJava();
        currencyConverter.convertMoney(BigDecimal.valueOf(1.1235758), BigDecimal.valueOf(1000));
        FirstHomeWorkJava eventOutput = new FirstHomeWorkJava();
        eventOutput.plannedEventOutput();
        FirstHomeWorkJava shoppingData = new FirstHomeWorkJava();
        shoppingData.shoppingListOutput();
    }

    public void convertMoney(BigDecimal euroRateToDollar, BigDecimal euroAmountToConvert) {
        BigDecimal dollarConvertedAmount = euroRateToDollar.multiply(euroAmountToConvert);
        System.out.println("Final USD converted amount: " + dollarConvertedAmount);
    }

    public void plannedEventOutput() {
        String event = "Java 1.5 course by Dmitri";
        GregorianCalendar calendar = new GregorianCalendar(2020, Calendar.JUNE, 28, 19, 0, 0);
        System.out.println(calendar.getTime() + " you have planned to attend " + event + ".");
    }

    public void shoppingListOutput() {
        HashMap<String, Integer> shoppingList = new HashMap<>();
        shoppingList.put("Apple", 10);
        shoppingList.put("Avocado", 2);
        shoppingList.put("Watermelon", 5);
        shoppingList.put("Pineapple", 7);
        shoppingList.put("Grapes", 1);
        System.out.println("Today's shopping list is:");
        for (Map.Entry<String, Integer> list : shoppingList.entrySet()) {
            System.out.println(list.getKey() + " : " + list.getValue() + " KG");
        }
    }
}





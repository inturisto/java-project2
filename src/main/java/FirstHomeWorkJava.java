import java.math.BigDecimal;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class FirstHomeWorkJava {
    public static void main(String[] args) {
        FirstHomeWorkJava currencyConverter = new FirstHomeWorkJava();
        currencyConverter.convertMoney(BigDecimal.valueOf(1.1235758), BigDecimal.valueOf(1000));
        FirstHomeWorkJava eventOutput = new FirstHomeWorkJava();
        eventOutput.plannedEventOutput();
        FirstHomeWorkJava shoppingData = new FirstHomeWorkJava();
        shoppingData.shoppingList();
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

    public void shoppingList() {
        String[][] shoppingList = new String[4][4];
        shoppingList[0][0] = "Avocado";
        shoppingList[0][1] = Integer.toString(4);
        shoppingList[1][0] = "Apple";
        shoppingList[1][1] = Integer.toString(3);
        shoppingList[2][0] = "Lemon";
        shoppingList[2][1] = Integer.toString(10);
        shoppingList[3][0] = "Grapefruit";
        shoppingList[3][1] = Integer.toString(5);

        for (String[] strings : shoppingList) {
            for (String string : strings) {
                System.out.print(string + "\t");
            }

        }

    }
}


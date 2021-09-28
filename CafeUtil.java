import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class CafeUtil {

    public String getStreakGoal(int num){
        int sum = 0;
        for(int i = 0; i <= num; i++){
            sum += i;
        }

        return String.format("Purhcases needed by week %s: %s \n", num, sum);

        // System.out.println("----- Streak Goal Test -----");
        // System.out.printf("Purchases needed by week 10: %i \n", sum);

    }

    public void printPriceChart(String productName, double price, int maxNumber){
        System.out.println(productName);
        for(int i = 0; i <= maxNumber; i++){
            double total = i * price;
            System.out.printf("%d - $%.2f %n", i, total);
        }
    }

    public double getOrderTotal(double[] lineItems){
        double sum = 0;
        for(int i = 0; i < lineItems.length; i++){
            sum += lineItems[i];
        }

        return sum;
    }

    public void displayMenu(ArrayList<String> menuList, ArrayList<Double> priceList){
        for(int i = 0; i < menuList.size(); i++){
            System.out.printf("%d - " + menuList.get(i) + " -- $%.2f %n", i, priceList.get(i));
        }
    }

    public void addCustomer(ArrayList<String> customers){
        for(int i = 0; i < 4; i++){
            System.out.print("What is your name? ");
            String userName = System.console().readLine();
            int users = customers.size();
            System.out.printf("----- Hello, %s -----%n", userName);
            System.out.printf("----- There are %d people ahead of you -----%n", users);
            customers.add(userName);
            System.out.println(customers);
        }
    }
}
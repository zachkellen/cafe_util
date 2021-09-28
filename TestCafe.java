import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class TestCafe {
    
	public static void main(String[] args) {
	    // TO-DO:
	    // Create an instance of the CafeUtil class        
	    // in order to use the CafeUtil class' methods.
    
	    // Hint: it will need to correspond with the variable name
	    // used in your test code.
    
	    // Given Test Cases Here
        // New instance of Cafe Methods here:
        CafeUtil cafeMethods = new CafeUtil();

        // All tests below here:
        String testStreak = cafeMethods.getStreakGoal(10);
        double[] lineItems = {3.5, 1.5, 4.0, 4.5};
        double orderTotal = cafeMethods.getOrderTotal(lineItems);
    
        // Console logging tests:
        System.out.println("----- Streak Goal Test -----");
        System.out.println(testStreak);

        System.out.println("----- Price Chart Test-----");
        cafeMethods.printPriceChart("Chai Latte Mix", 4.5, 3);
        cafeMethods.printPriceChart("Specialty Coaster", 2.0, 5);

        System.out.println("----- Order Total Test-----");
        System.out.printf("Order total: $%.2f \n", orderTotal);

        System.out.println("----- Display Menu Test-----");
        List<String> loadMenu = Arrays.asList( "drip coffee", "cappucino", "latte", "mocha" );
        List<Double> loadPrices = Arrays.asList(1.5, 3.5, 4.5, 3.5);
        ArrayList<String> menu = new ArrayList<String>();
        ArrayList<Double> prices = new ArrayList<Double>();

        // Note: Below is a way to add multiple elements to a list in fewer lines.
        // It does require an extra import at the top of the file.
        menu.addAll(loadMenu);
        prices.addAll(loadPrices);
        cafeMethods.displayMenu(menu, prices);

        System.out.println("----- Add Customer Test -----");
        ArrayList<String> customers = new ArrayList<String>();
        cafeMethods.addCustomer(customers);
	}
}

package Builder2;

import static Builder2.FourCheese.Size.MEDIUM;
import static Builder2.NyPizza.Size.SMALL;
import static Builder2.Pizza.Topping.*;

// Using the hierarchical builder (Page 16)
public class PizzaTest {
    public static void main(String[] args) {
        NyPizza pizza = new NyPizza.Builder(SMALL)
                .addTopping(SAUSAGE).addTopping(ONION).build();
        Calzone calzone = new Calzone.Builder()
                .addTopping(HAM).sauceInside().build();
        FourCheese fourCheese = new FourCheese.Builder(MEDIUM).
                addTopping(SAUSAGE).addTopping(ONION).build();

        System.out.println(fourCheese);
        
        System.out.println(pizza);
        System.out.println(calzone);
    }
}

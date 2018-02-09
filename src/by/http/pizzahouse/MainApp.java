package by.http.pizzahouse;

public class MainApp {

	public static void main(String[] args) {

    pizza p = new pizza();
    
    //Заказать пиццу
    p.order_pizza();
        
    //Приготовить пиццу
    p.make_pizza();
          
    //Доставить пиццу
    p.deliver_pizza();
    
	}

}

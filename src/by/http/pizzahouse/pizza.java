package by.http.pizzahouse;

public class pizza {

	String pizza_name;
	int pizza_size;
	String pizza_address;
	boolean pizza_ready;
	
	//заказать пиццу
	public void order_pizza() {

		pizza_scanner scan = new pizza_scanner();
		
		System.out.println("Введите адрес доставки");
		pizza_address = scan.enterString();

		System.out.println("Введите название пиццы");
		pizza_name = scan.enterString();
		
		System.out.println("Введите размер пиццы в см");
		pizza_size = scan.enterInt();
		
      //System.out.println("Введите адрес доставки");
	  //pizza_address = scan.enterString();
		
	}
	
	//приготовить пиццу
	public void make_pizza(){
		if(pizza_size >= 12 && pizza_size <=48){
			System.out.println("Пицца приготовлена");
		    pizza_ready = true;	
		}			
		else {
			System.out.println("Мы не готовим пиццы размером " + pizza_size + " см");
			pizza_ready = false;
		}
	}
	
	//доставить пиццу
	public void deliver_pizza(){
		if(pizza_ready){
			System.out.println("Пицца " + pizza_name + " размером " + pizza_size + " см доставлена по адресу " + pizza_address);
		}
		else System.out.println("Заказ отменен");
	}

}

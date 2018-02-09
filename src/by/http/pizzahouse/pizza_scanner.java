package by.http.pizzahouse;

import java.util.Scanner;

public class pizza_scanner {
	
	Scanner scan = new Scanner(System.in);
	
	public String enterString() {
		// Ввести строку с клавиатуры
		String s = scan.nextLine();
		//System.out.println("Вы ввели: " + s);
		return s;
	}
	
	public int enterInt(){
		//Ввести число с клавиатуры
		int i = scan.nextInt();
		//System.out.println("Вы ввели: " + i);
		return i;
	}

}

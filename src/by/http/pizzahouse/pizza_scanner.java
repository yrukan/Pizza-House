package by.http.pizzahouse;

import java.util.Scanner;

public class pizza_scanner {
	
	Scanner scan = new Scanner(System.in);
	
	public String enterString() {
		// ������ ������ � ����������
		String s = scan.nextLine();
		//System.out.println("�� �����: " + s);
		return s;
	}
	
	public int enterInt(){
		//������ ����� � ����������
		int i = scan.nextInt();
		//System.out.println("�� �����: " + i);
		return i;
	}

}

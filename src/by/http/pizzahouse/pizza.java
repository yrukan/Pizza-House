package by.http.pizzahouse;

public class pizza {

	String pizza_name;
	int pizza_size;
	String pizza_address;
	boolean pizza_ready;
	
	//�������� �����
	public void order_pizza() {

		pizza_scanner scan = new pizza_scanner();
		
		System.out.println("������� ����� ��������");
		pizza_address = scan.enterString();

		System.out.println("������� �������� �����");
		pizza_name = scan.enterString();
		
		System.out.println("������� ������ ����� � ��");
		pizza_size = scan.enterInt();
		
      //System.out.println("������� ����� ��������");
	  //pizza_address = scan.enterString();
		
	}
	
	//����������� �����
	public void make_pizza(){
		if(pizza_size >= 12 && pizza_size <=48){
			System.out.println("����� ������������");
		    pizza_ready = true;	
		}			
		else {
			System.out.println("�� �� ������� ����� �������� " + pizza_size + " ��");
			pizza_ready = false;
		}
	}
	
	//��������� �����
	public void deliver_pizza(){
		if(pizza_ready){
			System.out.println("����� " + pizza_name + " �������� " + pizza_size + " �� ���������� �� ������ " + pizza_address);
		}
		else System.out.println("����� �������");
	}

}

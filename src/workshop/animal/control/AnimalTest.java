package workshop.animal.control;

import workshop.animal.entity.Animal;
import workshop.animal.entity.Cat;
import workshop.animal.entity.Pet;

public class AnimalTest {

	public static void main(String[] args) {
		//Cat ��ü�� �����ϴ� ���
		Cat cat1 = new Cat();//5�� 
		Pet cat2 = new Cat();//3��
		Animal cat3 = new Cat();//2��
		
		//Pet���κ��� ��ӹ��� �޼���
		cat1.setName("Tom");
		System.out.println(cat1.getName());
		cat1.play();
		
		//Animal�κ��� ��ӹ��� �޼���
		cat1.eat();
		cat1.walk();
		
		//Pet���κ��� ��ӹ��� �޼��� 
		cat2.setName("jerry");
		System.out.println(cat2.getName());
		cat2.play();
		
		//Animal�κ��� ��ӹ��� �޼��� 
		cat3.eat();
		cat3.walk();

	}

}

package workshop.animal.entity;

public class Fish extends Animal implements Pet {
	private String name;
	public Fish(int legs) {
		super(0);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;

	}

	@Override
	public void play() {
		System.out.println("������ ���׿��� ��ƿ�!");

	}

	@Override
	public void eat() {
		System.out.println("������ �ö�ũ���� �Ծ��!");

	}

}

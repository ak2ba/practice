class Parent{
	void pocketMoney() {
		System.out.println("PocketMoney is 1000rs");
	}
}

class Child extends Parent{
	@Override
	void poketMony() {
		System.out.println("PocketMOney is 5000rs");
	}
}

public class ParentChild {

	public static void main(String[] args) {
		Child c = new Child();
		c.pocketMoney();
	}
}

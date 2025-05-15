interface Test{
	void disp1(); //public abstract
	//default
	default void disp2() {
		System.out.println("This is disp2()");
	}
	//static 
	static void disp3() {
		System.out.println("This is disp3()");
	}
}

class TestImpl implements Test{

	@Override
	public void disp1() {
		// TODO Auto-generated method stub
		
	}
	
}

public class Demo {
	public static void main(String[] args) {
		Test.disp3();
		TestImpl ti = new TestImpl();
		ti.disp2();
		ti.disp1();
	}
}

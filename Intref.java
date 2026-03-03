interface Intref{
	public void  m1();
}

class Test{
	int x = 10;

	public void m2(){
		int y = 20;
		Intref i = () -> {
			System.out.println(x); //10
			System.out.println(y); //10
		};

		i.m1();
	}

	public static void main(String[] args) {
		Test t = new Test();
		t.m2();
	}
}
package JavaProject4;

interface A{
	void meth1();
	void meth2();
}
interface B extends A{
	void meth3();
}
  class Interface1 implements A{

	public static void main(String[] args) {
		Interface1 i=new Interface1();
		i.meth1();
		i.meth2();
		i.meth3();
	}

	public void meth1() {
		System.out.println("Method 1");
	}

	public void meth2() {
		System.out.println("Method 2");
	}
	
	public void meth3() {
		System.out.println("Method 3");
	}

}

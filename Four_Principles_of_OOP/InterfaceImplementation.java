package Four_Principles_of_OOP;

public class InterfaceImplementation implements ISubtract, ISum {

	public static void main(String[] args) {
		InterfaceImplementation obj = new InterfaceImplementation();
		System.out.println(obj.add(1, 2));
		System.out.println(obj.add((float)3.0,(float) 4.0));
		System.out.println(obj.subtract((float)3.0,(float) 4.0));
		System.out.println(obj.subtract(3,4));
	}

	@Override
	public int subtract(int a, int b) {
		return a-b;
	}

	@Override
	public float subtract(float a, float b) {
		return a-b;
	}

	@Override
	public int add(int a, int b) {
		return a+b;
	}

	@Override
	public float add(float a, float b) {
		return a+b;
	}

}
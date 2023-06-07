package exceptionalHandling;

public class sample {

	public static void main(String[] args) {
		sample ji=new sample();
		ji.m1();
	}

	private void m1() {
		// TODO Auto-generated method stub
		this.m2();
	}

	private void m2() {
		// TODO Auto-generated method stub
		this.m1();
	}

}

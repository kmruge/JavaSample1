package consumerSupplierPredicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class ConsumerFunction {

	public static void main(String[] args) {
		Consumer<Integer> ji=(n)->System.out.println("comsumer "+n);
		ji.accept(10);
		ArrayList<Integer> ki=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		ki.forEach(ji);
		//using lambda function
		ki.forEach(b->System.out.println("Consumer "+b));
	}
}

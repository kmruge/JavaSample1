package consumerSupplierPredicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class PredicateFunctional {

	public static void main(String[] args) {
		Predicate<Integer> ki=k-> k%2 ==0;
		System.out.println(ki.test(10));
		ArrayList<Integer> ko=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		ko.stream().filter(ki).forEach(m->System.out.println("Even "+m));
		//Using API Stream lambda Function
		ko.stream().filter(b->b%2==0).forEach(c->System.out.println("Even "+c));
		
	}

}

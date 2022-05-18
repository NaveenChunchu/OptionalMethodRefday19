package ai.jobiak.java8;

import java.util.Arrays;
import java.util.List;

import ai.jobiak.java8.Utility.TestRefs;

class Utility{
	
	Utility(){
		System.out.println("from default constructor of utility()");
	}
	void method() {
		System.out.println("from instance method()");
	}
	static void method2() {
		System.out.println("from static method2()");
	}
	
	interface TestRefs{
		void substitute();
	
	}
	
}
public class TestMethodReferences {

	public static void main(String[] args) {
	
		Utility util=new Utility(); //the instance method reference
		TestRefs ref=util::method;
		ref.substitute();
		
		TestRefs ref2=Utility::method2; //static method reference
		ref2.substitute();

		TestRefs ref3=Utility::new; //constructore reference 
		ref3.substitute();
		
		List<Integer>list=Arrays.asList(1,2,3,4,5,6,7,8);
		list.stream().forEach(System.out::println);
	}

}

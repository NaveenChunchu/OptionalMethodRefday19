package ai.jobiak.java8;

import java.util.function.BiFunction;
import ai.jobiak.java8.Arthemetic.Sayabale;
//import ai.jobiak.java8.Arthemetic.sayabale;

class Arthemetic{
	Arthemetic(){
		System.out.println("performing operations");
	}
	 static int add(int a,int b) {
		return a+b;
	}
	
	interface Sayabale{
		void say();
	}
}
public class MethodRef {
	
	public static void main(String[] args) {
		
		BiFunction<Integer, Integer, Integer>p=Arthemetic::add; //BiFunction is used to perform arthemetic operations 
		int x=p.apply(10, 20);
		System.out.println(x);
		
		Sayabale s1=Arthemetic::new;
		s1.say(); //calls the constructor reference 
	}
}

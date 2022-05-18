package ai.jobiak.java8;

import java.awt.SystemColor;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.function.Supplier;
public class OptionalDemo {

	public static void main(String[] args) throws Throwable {
	
		
		String str="Welcome to Jobiak";
		String str1=null;
		
		Optional optional=Optional.of(str);
		System.out.println(optional.get());
		Optional optional2=Optional.ofNullable(str);
		System.out.println(optional2);
		
		if(optional.isPresent()) {
			System.out.println(optional.get());
			
		}
		Optional<String> gender = Optional.of("MALE");
		System.out.println(gender.filter(g->g.equals("male")));
		
		Predicate<String>p=s->s.contains("to");
		System.out.println(optional.filter(p).get());
		
		Optional<String>optional1=Optional.ofNullable(new String());
		optional1.orElseGet(()->new String());
		
		Optional<String>optional3=Optional.ofNullable(new String());
		optional3.orElseThrow(()->new NoSuchElementException());
	
		
	}

}

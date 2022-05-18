package ai.jobiak.java8;

import java.util.Optional;

public class TestOptional {

	static void method(String input) {
		if(input!=null)
			System.out.println(input);
	}
	public static void main(String[] args) {
		
		String str=null;
		//System.out.println(str);
		String str2=new String("Hello");
		//System.out.println(str2.length());
		//method(str);
		//Optional optional=Optional.of(str); //throws NullPointerExceptional
		Optional optional=Optional.of(str2);
		System.out.println(optional.get());
		
		//Optional optional1=Optional.ofNullable(str);
		//System.out.println(optional1.get()); //NoSuchElementException
		
		//Optional optional1=Optional.ofNullable(str);
			//if(optional1.isPresent())
				//System.out.println(optional1.get()); //this exception is not thrown NoSuchElementException
		
		Optional optional1=Optional.ofNullable(str);
		System.out.println(optional1.orElse("Alternate string"));
		
		Optional optional2=Optional.ofNullable(str2);
		System.out.println(optional2.orElse("Alternate string"));
	}

}

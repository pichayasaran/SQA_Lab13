package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.FizzBuzzApplication;

class Input6ShouldBe3 {

	@Test
	public void Input3ShouldBeFizz() {
	   String expected = "Fizz";
	   int number = 6 ;

	   FizzBuzzApplication fizzBuzz = new FizzBuzzApplication();
	   String actual = fizzBuzz.convert(number);

	   assertEquals(expected,actual);
	}
}

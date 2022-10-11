package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.FizzBuzzApplication;

class Input15ShouldBeFizzBuzz {

	@Test
	public void Input15ShouldBeFizzBuzz() {
	   String expected = "FizzBuzz";
	   int number = 15;

	   FizzBuzzApplication fizzBuzz = new FizzBuzzApplication();
	   String actual = fizzBuzz.convert(number);

	   assertEquals(expected,actual);
	}
}
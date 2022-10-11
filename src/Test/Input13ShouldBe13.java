package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.FizzBuzzApplication;

class Input13ShouldBe13 {

	@Test
	public void Input13ShouldBe13() {
	   String expected = "13";
	   int number = 13;

	   FizzBuzzApplication fizzBuzz = new FizzBuzzApplication();
	   String actual = fizzBuzz.convert(number);

	   assertEquals(expected,actual);
	}
}

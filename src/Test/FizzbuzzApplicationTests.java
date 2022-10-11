package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.FizzBuzzApplication;

class FizzbuzzApplicationTests {

	@Test
	   public void Input1ShouldBe1() {

	      String expected = "1";
	      int number = 1;

	      FizzBuzzApplication fizzBuzz = new FizzBuzzApplication();
	      String actual = fizzBuzz.convert(number);

	      assertEquals(expected,actual);
	   }
	}

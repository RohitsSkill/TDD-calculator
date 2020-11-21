import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

@Test
public class test {
	calculator calculator = new calculator();

	public void checkEmpty() {
		assertEquals(calculator.add(""),0);
	}
	public void checksingle() {
		assertEquals(calculator.add("1"),1);
	}
	public void checksum() {
		assertEquals(calculator.add("1,3"),4);
	}
	public void checkMultiple() {
		assertEquals(calculator.add("1,3,2"),6);
	}
	public void checkMultiple() {
		assertEquals(calculator.add("1\n3,2"),6);
	}
}

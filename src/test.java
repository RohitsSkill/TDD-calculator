import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

@Test
public class test {
	public void checkEmpty() {
		calculator calculator = new calculator();
		assertEquals(calculator.add(""),0);
	}
}
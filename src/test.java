import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

@Test
public class test {
	calculator calculator = new calculator();

	public void checkEmpty() throws Exception {
		assertEquals(calculator.add(""),0);
	}
	public void checksingle() throws Exception {
		assertEquals(calculator.add("1"),1);
	}
	public void checksum() throws Exception {
		assertEquals(calculator.add("1,3"),4);
	}
	public void checkMultiple() throws Exception  {
		assertEquals(calculator.add("1,3,2"),6);
	}
	public void checkWithNewLine() throws Exception  {
		assertEquals(calculator.add("1\n3,2"),6);
	}
	@Test(expectedExceptions=Exception.class)
	public void checkNegative() throws Exception  {
		calculator.add("-3");
	}
}

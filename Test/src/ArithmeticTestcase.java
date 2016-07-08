import static org.junit.Assert.*;

import org.junit.Test;

public class ArithmeticTestcase {
	

	@Test
	public void iseventest() {
		Arithmetic a=new Arithmetic();
		assertEquals("",true, a.iseven(90));
		}

}

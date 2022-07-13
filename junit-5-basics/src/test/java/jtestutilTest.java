import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
public class jtestutilTest {
	@BeforeAll
	public static void init(){
		System.out.println("BeforeAll init() method called");
	}

	@Test
	public void test() {
		assertEquals(0,jtestutil.ret(4));
	}
	@Test
	public void test2() {
		jtestutil p=new jtestutil();
		assertThrows(ArithmeticException.class, () -> { p.div(1);});
	}

	}

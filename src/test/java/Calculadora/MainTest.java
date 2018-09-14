package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTest {
	Main main = new Main();

	@Test
	void testMain() {
		Main.main(null);
	}

	@Test
	void testSoma() {
		int res=main.soma(1, 2);
		assertEquals(3, res);
	}

	@Test
	void testSub() {
		int res=main.sub(2, 2);
		assertEquals(0, res);
	}

	@Test
	void testMulti() {
		int res=main.multi(1, 2);
		assertEquals(2, res);
	}

	@Test
	void testDiv() {
		int res=main.div(4, 2);
		assertEquals(2, res);
	}

}

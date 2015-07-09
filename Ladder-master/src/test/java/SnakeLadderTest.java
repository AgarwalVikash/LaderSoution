import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class SnakeLadderTest {
	private SnakeLadder snk;
	private Player pp1;
	private Player pp2;

	@Before
	public void setup() {
		pp1 = new Player("vikash", 1);
		pp2 = new Player("prateek", 1);
		snk = new SnakeLadder(pp1, pp2);
	}

	@Test
	public void test() {

	}

	@Test
	public void TestRolldice() {
		assertTrue("Value is always less then or equal to 6", snk.rollDice() <= 6);
	}

	@Test
	public void TestnextPostion() {
		snk.nextPosition(5, pp1);
		assertEquals(pp1.getCurrentPosition(), 6);
		snk.nextPosition(2, pp1);
		assertEquals(pp1.getCurrentPosition(), 14);
	}

}

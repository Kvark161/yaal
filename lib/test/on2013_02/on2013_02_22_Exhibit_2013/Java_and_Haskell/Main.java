package on2013_02.on2013_02_22_Exhibit_2013.Java_and_Haskell;

import net.egork.chelper.tester.NewTester;

import org.junit.Assert;
import org.junit.Test;

public class Main {
	@Test
	public void test() throws Exception {
		if (!NewTester.test("lib/test/on2013_02/on2013_02_22_Exhibit_2013/Java_and_Haskell/Java and Haskell.task"))
			Assert.fail();
	}
}

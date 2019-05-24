package ex_06;

import junit.framework.TestCase;

/*
 * - JUnit 버전
 *   책: JUnit 3
 *   테스트: JUnit 5
 */
public class UsePrinterTest extends TestCase {
	public void testdoSomething() {
		FakePrinter fakePrinter = new FakePrinter();
		UsePrinter usePrinter = new UsePrinter();
		usePrinter.doSomething(fakePrinter);
		assertEquals("this is a test", fakePrinter.get());
	}
}

package ex_06.test_01;

import junit.framework.TestCase;

/*
 * - JUnit 버전
 *   교재: JUnit 3
 *   아래 코드: JUnit 5
 *   
 * - 테스트 케이스 2가지 고려(책 이외 추가)
 *   - 프린터로 올바른 값이 전달되었는지 확인
 *   - 전달된 문자열을 str 변수에 저장하고 나중에 테스트 케이스에서 get 메서드를 사용해 확인하게 함
 */
public class UsePrinterTest extends TestCase {
	public void testdoSomething() {
		FakePrinter fakePrinter = new FakePrinter();
		UsePrinter usePrinter = new UsePrinter();
		usePrinter.doSomething(fakePrinter);
		// 테스트 케이스
		// assertEquals("this is a test", fakePrinter.get());
		assertEquals("ABC", fakePrinter.get());
	}
}

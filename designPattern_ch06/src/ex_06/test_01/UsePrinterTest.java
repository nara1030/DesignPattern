package ex_06.test_01;

import junit.framework.TestCase;

/*
 * - JUnit ����
 *   ����: JUnit 3
 *   �Ʒ� �ڵ�: JUnit 5
 *   
 * - �׽�Ʈ ���̽� 2���� ���(å �̿� �߰�)
 *   - �����ͷ� �ùٸ� ���� ���޵Ǿ����� Ȯ��
 *   - ���޵� ���ڿ��� str ������ �����ϰ� ���߿� �׽�Ʈ ���̽����� get �޼��带 ����� Ȯ���ϰ� ��
 */
public class UsePrinterTest extends TestCase {
	public void testdoSomething() {
		FakePrinter fakePrinter = new FakePrinter();
		UsePrinter usePrinter = new UsePrinter();
		usePrinter.doSomething(fakePrinter);
		// �׽�Ʈ ���̽�
		// assertEquals("this is a test", fakePrinter.get());
		assertEquals("ABC", fakePrinter.get());
	}
}

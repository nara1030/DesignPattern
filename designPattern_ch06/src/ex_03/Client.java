package ex_03;

/*
 * - 문제점
 *   다중 스레드에서 Printer 클래스를 이용할 때 인스턴스가 1개 이상 생성되는 경우 발생 가능
 * 
 * - 시나리오: 경합조건(race condition) 발생
 *   1. Printer 인스턴스가 아직 생성되지 않았을 때 스레드 1이 getPrinter 메서드의
 *      if문을 실행해 이미 인스턴스가 생성되었는지를 확인한다. 현재 printer 변수는 null인 상태다.
 *   2. 만약 스레드 1이 생성자를 호출해 인스턴스를 만들기 전 스레드 2가 if문을 실행해
 *      printer 변수가 null인지 확인할 수 있다. 현재 null이므로 인스턴스를 생성하는 코드,
 *      즉 생성자를 호출하는 코드를 실행하게 된다.
 *   3. 스레드 1도 스레드 2와 마찬가지로 인스턴스를 생성하는 코드를 실행하게 되면 결과적으로 Printer
 *      클래스의 인스턴스가 2개 생성된다.
 * 
 * - 경합조건
 *   메모리와 같은 동일한 자원을 2개 이상의 스레드가 이용하려고 경합하는 현상
 *   
 * - 실제로는 스레드 스케줄링을 고의로 변경하는 데 Thread.sleep을 굳이 이용하지 않아도 된다.
 * 
 */
public class Client {
	private static final int THREAD_NUM = 5;

	public static void main(String[] args) {
		UserThread[] users = new UserThread[THREAD_NUM];
		for (int i = 0; i < THREAD_NUM; i++) {
			users[i] = new UserThread((i + 1) + "-thread");
			users[i].start();
		}
	}
}

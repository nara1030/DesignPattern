package ex_03;

/*
 * - 문제점
 *   다중 스레드에서 Printer 클래스를 이용할 때 인스턴스가 1개 이상 생성되는 경우 발생 가능
 *   (다중 스레드 애플리케이션이 아닌 경우엔 문제가 되지 않음)
 * 
 * - 문제상황
 *   Printer 클래스가 상태를 유지해야 하는 경우
 *   예를 들어 counter 변수와 같은 값을 인스턴스가 유지해야 할 경우 문제가 생김
 *   (이 경우 Printer 클래스의 인스턴스마다 counter 변수를 각각 만들어 유지하기 때문)
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

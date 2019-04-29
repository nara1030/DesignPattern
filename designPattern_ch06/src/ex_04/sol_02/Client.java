package ex_04.sol_02;

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

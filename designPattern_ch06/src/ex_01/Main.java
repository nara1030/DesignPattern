package ex_01;

public class Main {
	private static final int User_NUM = 5;

	public static void main(String[] args) {
		User[] users = new User[User_NUM];
		for (int i = 0; i < User_NUM; i++) {
			users[i] = new User((i + 1) + "-user");
			users[i].print();
		}
	}
}

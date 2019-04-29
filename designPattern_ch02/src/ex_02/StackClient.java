package ex_02;

public class StackClient {
	public static void main(String[] args) {
		ArrayListStack st = new ArrayListStack(10);
		st.push(20);
		System.out.println(st.peek());
	}
}

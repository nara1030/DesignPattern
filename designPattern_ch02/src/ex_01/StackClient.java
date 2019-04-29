package ex_01;

public class StackClient {
	public static void main(String[] args) {
		ArrayStack st = new ArrayStack(10);
		st.itemArray[++st.top] = 20;
		System.out.println(st.itemArray[st.top]);
		
		// Ãß°¡
		System.out.println("Empty? " + st.isEmpty());
		System.out.println("Full? " + st.isFull());
	}
}

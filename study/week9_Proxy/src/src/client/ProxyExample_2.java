package client;

import proxy_pattern_2.Data;
import proxy_pattern_2.ProxyLoader;

/*
 * https://ncanis.tistory.com/102
 */
public class ProxyExample_2 {
	public static void main(String[] args) {
		ProxyLoader proxyLoader = new ProxyLoader();
		System.out.println("�븮�ο��� �ε� ��û");
		Data data = proxyLoader.getData(); // Data Ŭ���� ���� �����ڿ� ���� ���
		System.out.println("���� �� ����");
		while (data.isLoaded() == false) {
			System.out.println("���");
		}
		System.out.println("�ε� �Ϸ�: " + data.msg);
	}
}

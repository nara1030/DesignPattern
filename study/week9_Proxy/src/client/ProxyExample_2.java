package client;

import proxy_pattern_2.Data;
import proxy_pattern_2.ProxyLoader;

/*
 * https://ncanis.tistory.com/102
 */
public class ProxyExample_2 {
	public static void main(String[] args) {
		ProxyLoader proxyLoader = new ProxyLoader();
		System.out.println("대리인에게 로딩 요청");
		Data data = proxyLoader.getData(); // Data 클래스 접근 제한자에 대해 고민
		System.out.println("작은 일 수행");
		while (data.isLoaded() == false) {
			System.out.println("대기");
		}
		System.out.println("로딩 완료: " + data.msg);
	}
}

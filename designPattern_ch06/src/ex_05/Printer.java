package ex_05;

/*
 * - 싱글턴 패턴 대안
 * 굳이 싱글턴 패턴을 사용하지 않아도 정적 클래스를 사용함으로써
 * 동일한 효과를 얻을 수 있다.
 * 
 * - 정적 클래스(static class)
 * 정적 메서드로만 이루어진 클래스
 * 
 * - 이점
 *   정적 클래스를 이용하는 방법이 싱글턴 패턴을 이용하는 방법과
 *   가장 차이가 나는 점은 객체를 전혀 생성하지 않고 메서드를
 *   사용한다는 점이다.
 *   더욱이 정적 메서드를 사용함으로 일반적으로 실행할 때
 *   바인딩되는(컴파일 타임에 바인딩되는) 인스턴스 메서드를
 *   사용하는 것보다 성능 면에서 우수하다고 할 수 있다.
 */
public class Printer {
	private static int counter = 0;

	public synchronized static void print(String str) {
		counter++;
		System.out.println(str + counter);
	}
}

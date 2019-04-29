package ex_04;

/*
 * 1. 생성자 ≠ set 메서드
 *  - 객체 생성 없이 set 메서드 사용할 수 없다.
 *  - 즉, 생성자는 필수지만 set 메서드는 필수가 아니다.
 *  - 만약 생성자만 호출해준 경우라면 '상담'이라는 행위는 아직 표현 안 됨
 *  - set 메서드를 통해 Advisor로 지정 필요
 * 2. 연관관계(클래스 A, B 가정)
 *  - 두 가지 생각해주어야 한다.
 *  - 생각1. 양방향 인식 or 단방향 인식
 *    - 해당 클래스 내 멤버변수로 설정 여부
 *  - 생각2. 다중성
 *    - 多라면 컬렉션 사용
 * 3. 객체 참조명 ≠ name(멤버 변수)
 *  - 아래 예에서 hongGilDong, manSup 같은 것은 비교할 수 없음
 */

public class Main {
	public static void main(String[] args) {
		Professor hongGilDong = new Professor();
		Student manSup = new Student();
		hongGilDong.setStudent(manSup);
		hongGilDong.advise();

		// 추가
		// 교수로 담당 학생을 지정했는데, 담당 학생을 통해 교수가 제대로 지정되었는지 확인
		// 교수가 담당 학생 지정하게 되어 있는 것은 1대多 고려한 듯(이 예는 1대1이지만)
		System.out.println(hongGilDong.toString());
		System.out.println(manSup.getAdvisor().toString());
	}
}

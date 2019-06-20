토의
===========
Null Object 주제 관련 기타 토의 내용
- - - - - -

### 토의 관련 상세 정리
1. Optional: 자바(jdk 1.8 이후)가 Null을 대하는 방법
	* [1부-자바8 이전의 Null 처리](http://www.daleseo.com/java8-optional-before/)
		* 문제
			1. 런타임에 NPE(NullPointerException)라는 예외 발생 위험
			2. NPE 방어 위한 체크 로직 때문에 코드 가독성 및 유지 보수성 떨어짐
		* 해결
			1. Null 처리(방어) 이전에 요구사항 파악 및 클래스 설계가 중요한 이유
				* [위 예제 리팩토링 생각]()
			2. 자바8 이후 기술적 처리
	* [2부-자바8 이후의 Null 처리](http://www.daleseo.com/java8-optional-after/)
		* java.util.Optional<T> 도입
			* 스칼라와 히스켈 등 함수형 언어에서 영감을 받아 "존재할지 안할 지 모르는 값"을 표현할 수 있는 별개의 타입 도입
			* 존재할 수도 있지만 안 할 수도 있는, 즉 Null이 될 수도 있는 객체를 감싸고 있는 일종의 래퍼 클래스
				* [래퍼 클래스 생각]()
			* Null 처리를 Optional 클래스에 위임하기 위함이므로 직접 Null 처리할 필요 없음
		* 사용법
			* 선언
			* 생성: 3가지 정적 팩토리 메소드
			* 접근: 다양한 인스턴스 메소드
		* 설계자 의도에 맞는 사용법
			* 기존에 조건문으로 Null을 대하던 생각을 함수형 사고로 완전히 바꿔야 함
	* [3부-효과적인 Null 처리](http://www.daleseo.com/java8-optional-effective/)
2. 분기문에 대해 질문
	*
3. 
4.
5. 기타
	* 까보는 습관
	* 현업에서 자바11을 사용
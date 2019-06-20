토의
===========
Null Object 주제 관련 기타 토의 내용
- - - - - -

### 토의 관련 상세 정리
1. Optional: 자바(jdk 1.8 이후)가 Null을 대하는 방법
	* [1부 - 자바8 이전의 Null 처리](http://www.daleseo.com/java8-optional-before/)
		* 문제
			1. 런타임에 NPE(NullPointerException)라는 예외 발생 위험
			2. NPE 방어 위한 체크 로직 때문에 코드 가독성 및 유지 보수성 떨어짐
		* 해결
			1. Null 처리(방어) 이전에 요구사항 파악 및 [클래스 설계가 중요한 이유]()
			2. 자바8 이후 기술적 처리
	* [2부 - 자바8 이후의 Null 처리](http://www.daleseo.com/java8-optional-after/)
		* java.util.Optional<T> 도입
			* 스칼라와 히스켈 등 함수형 언어에서 영감을 받아 "존재할지 안할 지 모르는 값"을 표현할 수 있는 별개의 타입 도입
			* 존재할 수도 있지만 안 할 수도 있는, 즉 Null이 될 수도 있는 객체를 감싸고 있는 [일종의 래퍼 클래스]()
		* 사용법
			* 선언
			* 생성: 3가지 정적 팩토리 메소드
			* 접근: 다양한 인스턴스 메소드
		* 설계자 의도에 맞는 사용법
			* Null 처리를 Optional 클래스에 위임하기 위함이므로 직접 Null 처리할 필요 없음
			* 기존에 조건문으로 Null을 대하던 생각을 함수형 사고로 완전히 바꿔야 함
	* [3부 - 효과적인 Null 처리](http://www.daleseo.com/java8-optional-effective/)
2. 분기문 고찰
	* 분기문을 타야 하는 로직
		1. 단순 값 할당 혹은 자료형 파싱 → 분기문 O
		2. 객체의 메소드 호출 → 분기문 X
			* 분기문이 존재하는 클래스에 의존성이 생겨버림
			* 따라서 인터페이스를 고려하거나 [프로퍼티 파일을 통해 bean에 태우는 방식]() 고려
	* 단순 값 할당 시 추가 고려사항
		1. 경우의 수가 많아질 경우
			* 프로퍼티 파일: 컴파일 없이 수정 가능하다는 장점
			* Enum
		2. 비교값으로 문자열 지양
3. Collections.EMPTY_LIST
	* 코드  
	  ```java
	  public static final List EMPTY_LIST = new EmptyList<>();
	  
	  public static final <T> List<T> emptyList() {
		return (List<T>) EMPTY_LIST;
	  }
	  ```
		* 출처
			* [Java - Collections.EMPTY_LIST](https://dololak.tistory.com/48)
			* 자바독  
			  ![javadoc](./img/Collections_EMPTY_LIST.png)
	* 개념
		* EmptyList 클래스
			* Collections 클래스의 내부 클래스
			* private 접근 제한자로 정의되어 있는 클래스이므로 직접 접근 불가
				* EMPTY_LIST 또는 emptyList()를 통해 접근 가능
		* 상수 EMPTY_LIST
			* 상수 → 싱글톤 객체를 참조
			* public이므로 외부에서 EmptyList 클래스 접근 가능
	* 필요성
		* 비어 있는 List를 리턴해야 하는 경우
			* 예1. DB에서 User 객체가 담긴 리스트를 조회해주는 메서드
4. Spring JPA
	* ORM
	* Hibernate
	* JdbcTemplate
	* MyBatis
	* findById
5. 기타
	* 까보는 습관
	* 현업에서 자바11을 사용
	* Restful
	* Micro Service
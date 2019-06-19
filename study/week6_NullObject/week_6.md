Null Object 패턴
===========
6주차
- - - - - -
* 일시: 2019.06.19(수)
* 장소: 
* 참여인원: 
* 내용: 아래 참고
</br>

* 개요
	1. 개념
		* 동작 패턴 중 하나(one of the behavioral patterns)
		* 값이 없거나 0인 오브젝트를 정의해 Null의 행위를 정의
	2. 목적(동기)
		* 메소드 내부에서 참조 점검 불필요
			* 객체 지향 언어(Java 또는 C#)에서 참조가 Null일 수 있음
			* 따라서 메소드 구현 전 Null 여부 점검 필요
		* 코드 간편화
			* 수신된 객체는 모두 동일한 방식으로 사용되므로 클라이언트에게 중요치 않음
				* 수신된 객체가 Null 객체든 실제 객체든 상관없음
			* 클라이언트는 추상 클래스의 구현을 수신하여 이를 사용
				* 수신된 객체란 추상 클래스의 구현
	3. 예
		* 폴더에 있는 파일 목록 검색 후 각 파일에 대해 작업 수행
			* 비어있는 폴더의 경우 → Null 반환
		* 데이터베이스와 같은 특정 기능의 가용성을 테스트
			*
	4. 구조
		* 목적 中 코드 간편화를 설명  
		  ![structure](../img/NullObject.png)

* 레퍼런스
	1. [Java의 Null Object Pattern](https://www.dineshonjava.com/null-object-pattern/)
	2. [Null Object 패턴](https://dsmoon.tistory.com/entry/NULL-OBJECT-%ED%8C%A8%ED%84%B4)
	3.
</br>
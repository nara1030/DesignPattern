- 참고
  - 코드
  	- https://plposer.tistory.com/62
  - 이론
  	- https://johngrib.github.io/wiki/builder-pattern/
  - 추가
    - https://okky.kr/article/396206
    - https://hamait.tistory.com/847

- 스터디 과정에서 나온 내용 및 이슈 정리: 추후 찾아보고 공부
	- 점층적 생성자 패턴이 빌더 패턴을 대체해야 하는 상황
		- 필수 멤버 필드가 유동적인 경우(예를 들어 필수 멤버 필드의 일부만 갖고 작업을 해야 하는 경우)라면,
		  빌더 클래스(?)를 하나 더 만들어주어야 하는 상황이 생기고 빌더 패턴이 의미가 없어지지 않나
		- User라는 빌더 클래스가 있다면 이 클래스는 건들지 않고,
		  UserInfo라는 클래스에서 User 객체를 통째로 가져와서 필요한 필드를 조작하는 식으로 사용하는 경우도 있다고 함
	- Lombok
		- Setter 및 Getter, 그리고 빌더 패턴까지(?) 적용해주는 어노테이션이라고 함
		- 라이브러리와 플러그인의 차이
	- [내부 클래스 사용할 필요 없음](https://ko.wikipedia.org/wiki/%EB%B9%8C%EB%8D%94_%ED%8C%A8%ED%84%B4)
	- Log4j에서 왜 빌드 패턴을 사용하지 않았나
		- 메소드에 static final 필드가 들어가 있음
Decorator 패턴
===========
10주차
- - - - - -
* 일시: 2019.07.17(수)
* 장소: 건대 엔젤리너스
* 참여인원: 
* 내용: 아래 참고
</br>

### 목차
1. [개념](#개념)
2. [적용](#적용)

### 개념
* [주어진 상황 및 용도에 따라 어떤 객체에 책임을 덧붙이는 패턴](https://ko.wikipedia.org/wiki/%EB%8D%B0%EC%BB%A4%EB%A0%88%EC%9D%B4%ED%84%B0_%ED%8C%A8%ED%84%B4)
	* 장점
		* [기능 확장이 필요할 때 서브클래싱 대신 쓸 수 있는 유연한 대안](https://gdtbgl93.tistory.com/9)
	* 단점
		* 일반적인 상속관계보다 유연한 기능 확장이 가능하지만 겹겹이 애워싼 구조때문에 디버깅 어려움
* 패턴 비교: [Proxy vs Decorator](https://hamait.tistory.com/868)
	* 두 패턴 모두 기존에 존재하는 객체의 동일한 인터페이스(구체적으로 메소드)를 이용해서 다양한 행위를 추가하기 위한 의도
	* 단 프록시 패턴은 흐름 제어만 할 뿐 반환값을 수정하지는 않지만, 데코레이터 패턴은 반환값을 조작 후 반환
	* UML  
	  ![img](./img/proxy_vs_decorator.png)
	* 적용
		* A 객체의 doAction() 메소드의 기능은 "hello" 출력
		* Decorator pattern
			* B 객체의 doAction() 메소드 호출 시 A 객체의 doAction() 호출 및 부가 기능 추가 의도
			* 로깅, 트랜잭션 등
		* Proxy pattern
			* 부가 기능을 추가 구현해주는 것이 아니라 주요 기능을 다양한 방식으로 컨트롤해주는 역할
			* Remote 컴퓨터에서 출력, Lazy initialization, 캐시된 것 사용 등
	* 참고 
		* [집합관계: 합성 vs 집약](https://defacto-standard.tistory.com/104)
* 결론
	* 데코레이터 패턴의 핵심 출발점은 가장 기본적인 기능과 그것을 꾸며주는 기능을 완전히 분리하는 것이다.
		* 데코레이터 패턴에서는 객체의 추가적인 요건을 동적으로 추가한다.
		* 데코레이터는 서브 클래스를 만드는 것을 통해서 기능을 유연하게 확장할 수 있는 방법을 제공하기 때문이다.
	* 또한 이것은 "변화하는 것과 변화하지 않는 것을 분리하는 것이 패턴의 시작이다"라는 것과 일맥상통한다.
		* 가장 기본적인 기능 = 변화하지 않는 것
		* 꾸며주는 기능 = 변화하는 것
	* 참고
		* [구루비 - 데코레이터 패턴](http://wiki.gurubee.net/pages/viewpage.action?pageId=1507398)

### 적용
1. 카페 커피 주문 예시
	* 소스 참고
	* 설명  
	<img src="./img/head_first.png" width="480" height="300"></br>
		* 호출과 리턴이 역순으로 일어남을 확인 가능
2. 자바 API
	* Stream  
	<img src="./img/stream.png" width="480" height="300"> </br>
		* 확실히 이해가 안 가서 좀 더 생각 필요..!
3. 스프링 Dynamic Proxy
	* [Dynamic Proxy는 Proxy 패턴인가 Decorator 패턴인가](http://toby.epril.com/?p=841)
	* [하둡 RPC](https://hamait.tistory.com/175)
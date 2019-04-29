package ex_03;

/*
 * - 객체지향에서 다형성(Polymorphism)
 *   서로 다른 클래스의 객체가 같은 메시지를 받았을 때 각자의 방식으로 동작하는 능력
 *   즉, 일반화 관계와 함께 자식 클래스를 개별적으로 다룰 필요 없이 한 번에 처리할 수 있게 하는 수단 제공
 *   
 * - talk 메서드와 eat 메서드 비교
 *   다형성 사용시 코드의 단순화
 * 
 * - Pet p = new Parrot();
 *   p에 바인딩된 객체에 talk 메서드의 메시지를 전달하면(p.talk())
 *   현재 p가 실제 참조하는 객체에 따라 실행되는 talk 메서드의 동작이 달라짐 
 */
abstract class Pet {
	public abstract void talk();
}

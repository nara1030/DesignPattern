package week6_NullObject;

/*
 * - ����
 *   - NullAnimal�� Animal�� ��� �޼ҵ尡 �ƹ� �ϵ� ���� �ʵ��� ����
 *   - �ƹ� ���̶�� ���� �޼ҵ�, �Ʒ� ������ doNilSound()�� �޷� �ִ�.
 */
public class NullPatternDemo {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Animal dog = AnimalFactory.getAnimal("Tommy");
		Animal cat = AnimalFactory.getAnimal("NULL");

		System.out.println("Animal's Sound");
		dog.makeSound();
		cat.makeSound();

		System.out.println("===========");

		if (dog.doNilSound() == false) {
			dog.makeSound();
		}

		if (cat.doNilSound() == false) {
			cat.makeSound();
		}
	}
}

package ex_02;

// 문제점: 집 전화와 사무실 전화를 배열의 인덱스를 통해 구분해야 하므로 불편
// 해결책: 전화기의 역할 구분해서 사용하면 해결 가능
public class Person {
	private Phone[] phones;

	public Person() {
		phones = new Phone[2];
	}

	public Phone getPhone(int i) {
		if (i == 0 || i == 1) {
			return phones[i]; // i = 0이면 집 전화, i = 1이면 사무실 전화
		}
		return null;
	}
}

package ex_03;

// 집 전화와 사무실 전화 각각에 참조가 이루어지므로 setter와 getter 메서드로 상황에 맞게 원하는 전화기 사용 가능
public class Person {
	private Phone homePhones;
	private Phone officePhone;

	/*
	 * public Person02() { homePhones = new Phone02(); officePhone = new Phone02();
	 * }
	 */

	public void setHomePhones(Phone phone) {
		this.homePhones = phone;
	}

	public void setOfficePhone(Phone phone) {
		this.officePhone = phone;
	}

	public Phone getHomePhones() {
		return homePhones;
	}

	public Phone getOfficePhone() {
		return officePhone;
	}
}

package ex_03;

// �� ��ȭ�� �繫�� ��ȭ ������ ������ �̷�����Ƿ� setter�� getter �޼���� ��Ȳ�� �°� ���ϴ� ��ȭ�� ��� ����
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

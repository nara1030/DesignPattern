package ex_06;

public class Main {
	public static void main(String[] args) {
		Student eomHongJun = new Student("eomHongJun");
		Course math = new Course("math");
		eomHongJun.registerCourse(math);
		for (int i = 0; i < math.getStudent().size(); i++) {
			System.out.println(math.getStudent().get(i).getName());
		}
		System.out.println("==============");
		Student junMiRa = new Student("junMiRa");
		junMiRa.registerCourse(math);
		for (int i = 0; i < math.getStudent().size(); i++) {
			System.out.println(math.getStudent().get(i).getName());
		}
		System.out.println("==============");
		eomHongJun.dropCourse(math);
		for (int i = 0; i < math.getStudent().size(); i++) {
			System.out.println(math.getStudent().get(i).getName());
		}
	}
}

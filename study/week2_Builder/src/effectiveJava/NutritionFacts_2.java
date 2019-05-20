package effectiveJava;

/*
 * - 자바빈 패턴(JavaBean Pattern)
 *   1. 방법
 *     - 인자 없는 생성자 호출하여 기본 객체 생성
 *     - 세터 이용 필드값 채워나가는 패턴
 *   2. 장점
 *     - 점층적 생성자 패턴 문제 보완
 *       - 초기화 이루어진 상태이므로 설정 필요 없는 필드에 인자 전달 필요 없음
 *       - 필드 값 설정 시 세터 이용하므로 인자 헷갈릴 일 없음
 *   3. 단점
 *     - 1회 함수 호출로 객체 생성을 끝낼 수 없으므로, 객체 일관성이 깨질 수 있음
 *     - 즉, 변경 불가능(immutable) 클래스 생성 불가
 */
public class NutritionFacts_2 {
	private int servingSize = -1; // 필수(기본값 없음)
	private int servings = -1; // 필수(기본값 없음)
	private int calories = 0;
	private int fat = 0;
	private int sodium = 0;
	private int carbohydrate = 0;

	public NutritionFacts_2() {
	}

	public void setServingSize(int servingSize) {
		this.servingSize = servingSize;
	}

	public void setServings(int servings) {
		this.servings = servings;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public void setFat(int fat) {
		this.fat = fat;
	}

	public void setSodium(int sodium) {
		this.sodium = sodium;
	}

	public void setCarbohydrate(int carbohydrate) {
		this.carbohydrate = carbohydrate;
	}
}

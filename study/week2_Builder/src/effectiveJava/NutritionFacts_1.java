package effectiveJava;

/* 
 * - 마트에서 포장 판매되는 음식을 살 때, 음식에 붙어있는 영양 성분표를 예로 듦
 *   - 클래스의 인스턴스 생성 시, 전달되는 인자 수가 많은 상황
 * 
 * - 점층적 생성자 패턴(Telescoping Constructor Pattern)
 *   1. 방법
 *     - 필수 생성자 생성
 *     - 1개의 선택적 인자 받는 생성자 추가
 *     - 2개의 선택적 인자 받는 생성자 추가
 *     - ... 반복
 *     - 모든 선택적 인자 받는 생성자 추가
 *   2. 장점
 *     - 생성자 선택 가능
 *   3. 단점
 *     - 객체 수 증가 시 문제(변경 불가?)
 *     - 인자 추가 발생 시, 코드 수정 힘듦
 *     - 인자(필드) 수 많을 시, 코드 가독성 낮아짐
 */
public class NutritionFacts_1 {
	private final int servingSize; // 필수
	private final int servings; // 필수
	private final int calories; // 선택
	private final int fat; // 선택
	private final int sodium; // 선택
	private final int carbohydrate; // 선택

	public NutritionFacts_1(int servingSize, int servings) {
		this(servingSize, servings, 0);
	}

	public NutritionFacts_1(int servingSize, int servings, int calories) {
		this(servingSize, servings, calories, 0);
	}

	public NutritionFacts_1(int servingSize, int servings, int calories, int fat) {
		this(servingSize, servings, calories, fat, 0);
	}

	public NutritionFacts_1(int servingSize, int servings, int calories, int fat, int sodium) {
		this(servingSize, servings, calories, fat, sodium, 0);
	}

	public NutritionFacts_1(int servingSize, int servings, int calories, int fat, int sodium, int carbohydrate) {
		this.servingSize = servingSize;
		this.servings = servings;
		this.calories = calories;
		this.fat = fat;
		this.sodium = sodium;
		this.carbohydrate = carbohydrate;
	}
}

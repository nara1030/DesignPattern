package effectiveJava;

/*
 * - 빌더 패턴(Builder Pattern)
 *   - 점층적 생성자 패턴의 안정성에 자바빈 패턴의 가독성 결합한 대안
 *   1. 방법
 *     - 클래스의 속성들은 불변으로 선언(final)
 *     - 빌더라는 정적 내부 클래스 정의하여 객체 생성 위임
 *   2. 장점
 *     - 빌더 패턴은 생성자의 들어갈 매개 변수가 많든 적든 차례차례 받아들이고,
 *       모든 매개변수를 받은 뒤에 이 변수들을 통합해서 한번에 사용
 *       - 즉, setter 메소드가 없으므로 변경 불가능 객체를 만들 수 있음
 *     - 객체 생성에 있어 필수적 인자와 선택적 인자 구분 가능
 *     - 선택적 인자의 경우, 보다 가독성 좋은 코드 작성 가능
 */
public class NutritionFacts_3 {
	private final int servingSize;
	private final int servings;
	private final int calories;
	private final int fat;
	private final int sodium;
	private final int carbohydrate;

	public NutritionFacts_3(Builder builder) {
		this.servingSize = builder.servingSize;
		this.servings = builder.servings;
		this.calories = builder.calories;
		this.fat = builder.fat;
		this.sodium = builder.sodium;
		this.carbohydrate = builder.carbohydrate;
	}

	public static class Builder {
		// 필수 인자
		private final int servingSize;
		private final int servings;

		// 선택적 인자, 기본값으로 초기화
		private int calories = 0;
		private int fat = 0;
		private int sodium = 0;
		private int carbohydrate = 0;

		public Builder(int servingSize, int servings) {
			this.servingSize = servingSize;
			this.servings = servings;
		}

		public Builder calories(int val) {
			this.calories = val;
			return this; // 이렇게 하면 . 으로 체인을 이어갈 수 있음
		}

		public Builder fat(int val) {
			this.fat = val;
			return this;
		}

		public Builder carbohydrate(int val) {
			this.carbohydrate = val;
			return this;
		}

		public Builder sodium(int val) {
			this.sodium = val;
			return this;
		}

		public NutritionFacts_3 build() {
			return new NutritionFacts_3(this);
		}
	}
}

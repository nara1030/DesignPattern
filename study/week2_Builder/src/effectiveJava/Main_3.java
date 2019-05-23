package effectiveJava;

/*
 * - 방법 1
 *   NutritionFacts.Builder builder = new NutritionFacts.Builder(240, 8);
 *   builder.calories(100);
 *   builder.sodium(35);
 *   builder.carbohydrate(27);
 *   NutritionFacts cocaCola = builder.build();
 * - 방법 2
 *   - 각 줄마다 builder를 타이핑하지 않아도 되어 편리
 */
public class Main_3 {
	public static void main(String[] args) {
		NutritionFacts_3 cocaCola = new NutritionFacts_3.Builder(240, 8).calories(100).sodium(35).carbohydrate(27)
				.build(); // build()가 객체를 생성해 돌려준다.
	}
}

package effectiveJava;

/*
 * - ��� 1
 *   NutritionFacts.Builder builder = new NutritionFacts.Builder(240, 8);
 *   builder.calories(100);
 *   builder.sodium(35);
 *   builder.carbohydrate(27);
 *   NutritionFacts cocaCola = builder.build();
 * - ��� 2
 *   - �� �ٸ��� builder�� Ÿ�������� �ʾƵ� �Ǿ� ��
 */
public class Main_3 {
	public static void main(String[] args) {
		NutritionFacts_3 cocaCola = new NutritionFacts_3.Builder(240, 8).calories(100).sodium(35).carbohydrate(27)
				.build(); // build()�� ��ü�� ������ �����ش�.
	}
}

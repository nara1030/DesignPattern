package effectiveJava;

/*
 * - �ڹٺ� ����(JavaBean Pattern)
 *   1. ���
 *     - ���� ���� ������ ȣ���Ͽ� �⺻ ��ü ����
 *     - ���� �̿� �ʵ尪 ä�������� ����
 *   2. ����
 *     - ������ ������ ���� ���� ����
 *       - �ʱ�ȭ �̷���� �����̹Ƿ� ���� �ʿ� ���� �ʵ忡 ���� ���� �ʿ� ����
 *       - �ʵ� �� ���� �� ���� �̿��ϹǷ� ���� �򰥸� �� ����
 *   3. ����
 *     - 1ȸ �Լ� ȣ��� ��ü ������ ���� �� �����Ƿ�, ��ü �ϰ����� ���� �� ����
 *     - ��, ���� �Ұ���(immutable) Ŭ���� ���� �Ұ�
 */
public class NutritionFacts_2 {
	private int servingSize = -1; // �ʼ�(�⺻�� ����)
	private int servings = -1; // �ʼ�(�⺻�� ����)
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

package effectiveJava;

/* 
 * - ��Ʈ���� ���� �ǸŵǴ� ������ �� ��, ���Ŀ� �پ��ִ� ���� ����ǥ�� ���� ��
 *   - Ŭ������ �ν��Ͻ� ���� ��, ���޵Ǵ� ���� ���� ���� ��Ȳ
 * 
 * - ������ ������ ����(Telescoping Constructor Pattern)
 *   1. ���
 *     - �ʼ� ������ ����
 *     - 1���� ������ ���� �޴� ������ �߰�
 *     - 2���� ������ ���� �޴� ������ �߰�
 *     - ... �ݺ�
 *     - ��� ������ ���� �޴� ������ �߰�
 *   2. ����
 *     - ������ ���� ����
 *   3. ����
 *     - ��ü �� ���� �� ����(���� �Ұ�?)
 *     - ���� �߰� �߻� ��, �ڵ� ���� ����
 *     - ����(�ʵ�) �� ���� ��, �ڵ� ������ ������
 */
public class NutritionFacts_1 {
	private final int servingSize; // �ʼ�
	private final int servings; // �ʼ�
	private final int calories; // ����
	private final int fat; // ����
	private final int sodium; // ����
	private final int carbohydrate; // ����

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

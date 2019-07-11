package proxy_pattern_2;

/*
 * ������ �δ��� ����� ���� ������
 */
public class ProxyLoader implements Loader {
	DataLoader dataLoader;

	@Override
	public Data getData() {
		if (dataLoader == null) {
			dataLoader = new DataLoader();
		}
		return dataLoader.getData(); // ������ ����(Double dispatch)
	}
}

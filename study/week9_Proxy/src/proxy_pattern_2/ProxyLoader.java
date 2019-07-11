package proxy_pattern_2;

/*
 * 데이터 로더를 대신해 일을 수행함
 */
public class ProxyLoader implements Loader {
	DataLoader dataLoader;

	@Override
	public Data getData() {
		if (dataLoader == null) {
			dataLoader = new DataLoader();
		}
		return dataLoader.getData(); // 참조의 참조(Double dispatch)
	}
}

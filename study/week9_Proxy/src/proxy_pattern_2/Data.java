package proxy_pattern_2;

/*
 * 결과 데이터
 */
public class Data {
	public String msg;

	public boolean isLoaded() {
		return msg == null ? false : true;
	}
}

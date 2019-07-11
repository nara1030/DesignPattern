package proxy_pattern_2;

/*
 * 큰 데이터를 스레드로 로딩하고 로딩이 완료되면 결과를 기다림
 */
class DataLoader implements Loader {

	private Data data = new Data();

	@Override
	public Data getData() {
		new Thread() {
			public void run() {
				// 데이터를 로딩하는데 5초가 걸린다고 가정
				for (int i = 0; i < 5; i++) {
					try {
						Thread.sleep(1000L);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				data.msg = "로딩된 데이터";
			}

		}.start();
		return data;
	}
}

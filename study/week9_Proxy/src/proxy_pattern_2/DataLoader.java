package proxy_pattern_2;

/*
 * ū �����͸� ������� �ε��ϰ� �ε��� �Ϸ�Ǹ� ����� ��ٸ�
 */
class DataLoader implements Loader {

	private Data data = new Data();

	@Override
	public Data getData() {
		new Thread() {
			public void run() {
				// �����͸� �ε��ϴµ� 5�ʰ� �ɸ��ٰ� ����
				for (int i = 0; i < 5; i++) {
					try {
						Thread.sleep(1000L);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				data.msg = "�ε��� ������";
			}

		}.start();
		return data;
	}
}

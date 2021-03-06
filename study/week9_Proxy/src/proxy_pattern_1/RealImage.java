package proxy_pattern_1;

class RealImage implements Image {
	private String filename;

	RealImage(String filename) {
		this.filename = filename;
		loadImageFromDisk();
	}

	private void loadImageFromDisk() {
		System.out.println("Loading " + filename);
	}

	@Override
	public void displayImage() {
		System.out.println("Displaying " + filename);
	}
}

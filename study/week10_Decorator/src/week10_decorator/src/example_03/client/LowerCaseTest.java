package example_03.client;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import example_03.server.LowerCaseInputStream;
import util.Printer;

class LowerCaseTest {
	public static void main(String[] args) {
		int c;
		try {
			InputStream in = new LowerCaseInputStream(
					new BufferedInputStream(new FileInputStream("C:\\Users\\nara1\\temp.txt")));

			while ((c = in.read()) >= 0) {
				Printer.printb((char) c);
			}

			in.close();

		} catch (FileNotFoundException f) {
			f.printStackTrace();
		} catch (IOException i) {
			i.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

package composite_pattern;

import java.util.ArrayList;
import java.util.List;

public class CompositeGraphic implements Graphic {

	private List<Graphic> mChildGraphics = new ArrayList<Graphic>();

	@Override
	public void print() {
		for (Graphic graphic : mChildGraphics) {
			graphic.print();
		}
	}

	public void add(Graphic graphic) {
		mChildGraphics.add(graphic);
	}

	public void remove(Graphic graphic) {
		mChildGraphics.remove(graphic);
	}
}

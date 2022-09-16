package day11;

public abstract class Ac {
	abstract public void maxTemp(int max);
	public String compressor(String brand ) {
		if (brand.equals("voltas")) {
			return "Good Compresssor";
		}
		else {
			return "average compressor";
		}
	}

}

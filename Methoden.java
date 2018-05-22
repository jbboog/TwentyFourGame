public abstract class Methoden {
	abstract int methode(int x, int y);
	// Dummy class om arraylist mee te kunnen maken.
}

class Optellen extends Methoden {
	public int methode(int x, int y) {
		int res = x + y;
		return res;
	}
}

class Aftrekken extends Methoden {
	public int methode(int x, int y) {
		int res;
		if(x > y) 					// negatieve getallen mogen niet
			{res = x - y;}
		else 
			{res = y - x;}
		
		return res;
	}
}

class Vermenigvuldigen extends Methoden {
	public int methode(int x, int y) {
		int res = x * y;
		return res;
	}
}

class Delen extends Methoden {
	public int methode(int x, int y) {
		int res = -1;
		if(x > y) {					// alleen hele getallen mogen worden gebruikt
			if(x % y == 0) {res = x/y;}
		} else {
			if(y % x == 0) {res = y/x;}
		}
		return res;
	}
}




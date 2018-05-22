public class TweeNum {

	public int optellen(int x, int y) {
		int res = x + y;
		return res;
	}
	
	public int aftrekken(int x, int y) {
		int res;
		if(x > y) 					// negatieve getallen mogen niet
			{res = x - y;}
		else 
			{res = y - x;}
		
		return res;
	}
	
	public int vermenigvuldigen(int x, int y) {
		int res = x * y;
		return res;
	}
	
	public int delen(int x, int y) {
		int res = 0;
		if(x > y) {					// alleen hele getallen mogen worden gebruikt
			if(x % y == 0) {res = x/y;}
		} else {
			if(y % x == 0) {res = y/x;}
		}
		return res;
	}

}

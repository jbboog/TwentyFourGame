import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {
		Tester tester = new Tester();
		ArrayList<Methoden> methoden = methodenLijst();
		tester.tweeNum(1, 2, 3, 4, methoden);
		tester.drieNum(1, 2, 3, 4, methoden);
		// [0][1]	[2][3]
		// [0][2]	[1][3]
		// [0][3]	[1][2]
		// [0][1]	[2]	[3]
		// [0][1]	[3]	[2]
		// [0][2]	[1]	[3]
		// [0][2]	[3]	[1]
		// [0][3]	[1]	[2]
		// [0][3]	[2]	[1]

	}

	public static ArrayList<Methoden> methodenLijst() {
		ArrayList<Methoden> methoden = new ArrayList<Methoden>();
		methoden.add(new Optellen());
		methoden.add(new Aftrekken());
		methoden.add(new Vermenigvuldigen());
		methoden.add(new Delen());

		return methoden;
	}

	public void tweeNum(int a, int b, int c, int d, ArrayList<Methoden> AL) {
		// FASE 1
		for(int i=0; i<AL.size(); i++) {		// past methodes toe op a en b
			int base = AL.get(i).methode(a, b);
			// FASE 2
			if(base>0) {
			for(int j=0; j<AL.size(); j++) {	// past methodes toe op c en d
				int var = AL.get(j).methode(c, d);
				// FASE 3
				if(var>0) {
				for(int k=0; k<AL.size(); k++) {	// past methodes toe op (a,b) en (c,d)
					int result = AL.get(k).methode(base, var);
					if(result == 24) { maakArray(a, b, c, d, base, var, i, j, k, 100); }
				}
			}}
		}}
	}

	public void drieNum(int a, int b, int c, int d, ArrayList<Methoden> AL) {

		for(int i=0; i<AL.size(); i++) {		// past methodes toe op a en b
			int base = AL.get(i).methode(a, b);
			if(base>0) {
			for(int j=0; j<AL.size(); j++) {	// past methodes toe op (a,b) en c
				int drie = AL.get(j).methode(base, c);
				if(drie>0) {
				for(int k=0; k<AL.size(); k++) {
					int result = AL.get(k).methode(drie, d); // past methodes toe op ((a,b) c) en d
					if(result == 24) { maakArray(a, b, c, d, base, drie, i, j, k, 200); }
				}
			}}
		}}
	}

	public void maakArray(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j) {
		int[]resultaat = {a, b, c, d, e, f, g, h, i, j};
		printer(resultaat);
	}

	public void printer(int[] ar) {
		if(ar[9] == 100) {
			tweeNumSwitch(ar);
		}
		if(ar[9] == 200) {
			drieNumSwitch(ar);
		}
	}





	static void tweeNumSwitch(int[] ar) {
		switch(ar[6]) {		// base swtich
			case 0: System.out.println(ar[0] + " + " + ar[1] + " = " + ar[4]);
					break;
			case 1: System.out.println(ar[0] + " - " + ar[1] + " = " + ar[4]);
					break;
			case 2: System.out.println(ar[0] + " x " + ar[1] + " = " + ar[4]);
					break;
			case 3: System.out.println(ar[0] + " / " + ar[1] + " = " + ar[4]);
					break;
		}

		switch(ar[7]) {		// var swtich
			case 0: System.out.println(ar[2] + " + " + ar[3] + " = " + ar[5]);
					break;
			case 1: System.out.println(ar[2] + " - " + ar[3] + " = " + ar[5]);
					break;
			case 2: System.out.println(ar[2] + " x " + ar[3] + " = " + ar[5]);
					break;
			case 3: System.out.println(ar[2] + " / " + ar[3] + " = " + ar[5]);
					break;
		}

		switch(ar[8]) {		// result swtich
			case 0: System.out.println(ar[4] + " + " + ar[5] + " = 24");
					break;
			case 1: System.out.println(ar[4] + " - " + ar[5] + " = 24");
					break;
			case 2: System.out.println(ar[4] + " x " + ar[5] + " = 24");
					break;
			case 3: System.out.println(ar[4] + " / " + ar[5] + " = 24");
					break;
		}
		System.out.println("\n");
	}

	static void drieNumSwitch(int[] ar) {
		switch(ar[6]) {		// base swtich
			case 0: System.out.println(ar[0] + " + " + ar[1] + " = " + ar[4]);
					break;
			case 1: System.out.println(ar[0] + " - " + ar[1] + " = " + ar[4]);
					break;
			case 2: System.out.println(ar[0] + " x " + ar[1] + " = " + ar[4]);
					break;
			case 3: System.out.println(ar[0] + " / " + ar[1] + " = " + ar[4]);
					break;
		}

		switch(ar[7]) {		// drie swtich
			case 0: System.out.println(ar[4] + " + " + ar[2] + " = " + ar[5]);
					break;
			case 1: System.out.println(ar[4] + " - " + ar[2] + " = " + ar[5]);
					break;
			case 2: System.out.println(ar[4] + " x " + ar[2] + " = " + ar[5]);
					break;
			case 3: System.out.println(ar[4] + " / " + ar[2] + " = " + ar[5]);
					break;
		}

		switch(ar[8]) {		// result swtich
			case 0: System.out.println(ar[5] + " + " + ar[3] + " = 24");
					break;
			case 1: System.out.println(ar[5] + " - " + ar[3] + " = 24");
					break;
			case 2: System.out.println(ar[5] + " x " + ar[3] + " = 24");
					break;
			case 3: System.out.println(ar[5] + " / " + ar[3] + " = 24");
					break;
		}
		System.out.println("\n");
	}
}


//tweeNum
//[0] = a
//[1] = b
//[2] = c
//[3] = d
//[4] = base
//[5] = var
//[6] = i	// base methode (a+b)
//[7] = j	// var methode (c+d)
//[8] = k	// eindmethode (base+var)
//[9] = 100 // identifier
//
//
//drienum
//[0] = a
//[1] = b
//[2] = c
//[3] = d
//[4] = base
//[5] = drie
//[6] = i	// base methode (a+b)
//[7] = j	// derde getal methode (base + c)
//[8] = k	// eindmethode (drie + d)
//[9] = 200 // identifier

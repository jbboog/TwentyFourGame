import java.util.Random;

public class Input {

	public static void main(String[] args) {
		//Input input = new Input();
		//Input.numGenerator();
		int[] nummers = numArray();
		//System.out.println(nummers[0]);
		//System.out.println(nummers[1]);
		//System.out.println(nummers[2]);
		//System.out.println(nummers[3]);
	}

	public static int randomNumbers() {
		int i;
		Random rand = new Random();
		i = rand.nextInt(8) + 1;	
		
		return i;
	}
	
	
	public static int[] numArray() {
		int[] numArray = new int[4];		// Array van de 4 nummers

		for(int i=0; i<numArray.length; i++) {
			numArray[i] = Input.randomNumbers();
		}
		return numArray;
	}
}
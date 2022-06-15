/*
 * Baring any special disruption of the loop (breaks, altering counter, etc), the formula is as follows:

iterations = (|start-end|+|incr|)/|incr|, where relational operator is >= or <=

- if relational operator is < or >, then iterations = ((|start-end|+|incr|-1)/|incr|

 * @author rahul.arora
 */

import java.util.Random;

public class LoopIterationCalcTester {

	public static void main(String[] args) {
		
		String word = "arora";
		String new_word = "";
		for (int x = word.length()-1; x >= 0; x--) {
			new_word += word.charAt(x);
			
			
		}
		System.out.println(new_word);
	}

}

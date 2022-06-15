import java.util.Scanner;


public class Scramble {
	 static int factorial(int n){    
		  if (n == 0)    
		    return 1;    
		  else    
		    return(n * factorial(n-1));    
		 }   
	 
	public static String removeCharAt(String s, int pos) {
		
	      return s.substring(0, pos) + s.substring(pos + 1);
	   }
	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the word (max 8 characters): ");
		String x = scan.nextLine();
		char[] yx = x.toCharArray();
		int fact = factorial(yx.length); 
		System.out.print(fact);
		System.out.print(" Possible combinations are: ");
		if (yx.length == 3) {
		
			System.out.print(yx[0]);
			System.out.print(yx[1]);
			System.out.print(yx[2]);
			System.out.print(", ");
			System.out.print(yx[0]);
			System.out.print(yx[2]);
			System.out.print(yx[1]);
			System.out.print(", ");
			System.out.print(yx[1]);
			System.out.print(yx[0]);
			System.out.print(yx[2]);
			System.out.print(", ");
			System.out.print(yx[1]);
			System.out.print(yx[2]);
			System.out.print(yx[0]);
			System.out.print(", ");
			System.out.print(yx[2]);
			System.out.print(yx[1]);
			System.out.print(yx[0]);
			System.out.print(", and ");
			System.out.print(yx[2]);
			System.out.print(yx[0]);
			System.out.print(yx[1]);
			System.out.print(".");
			
			
		}
		if (yx.length == 2) {
		
			System.out.print(yx[0]);
			System.out.print(yx[1]);
			System.out.print(" and ");
			System.out.print(yx[1]);
			System.out.print(yx[0]);
			System.out.print(".");
		
			
			
		}
		if (yx.length == 1) {
			
			System.out.print(yx[0]);
		
			
			
		}
		

		for (int n = 0; n < yx.length; n++) {
			
			char[] y = yx;
			
			String word = "";
			word = word + y[n];
			
			
			
			String newword = new String(yx);
			String removedword = removeCharAt(newword, n);
			char[] newy = removedword.toCharArray();
			
		
			
			for (int o = 0; o < newy.length; o++) {
				
				
				char[] newery = newy;
				
				String word2 = word;
				word2 = word2 + newery[o];
				
				String newwordag = new String(newy);
				String removedwordag = removeCharAt(newwordag, o);
				char[] newesty = removedwordag.toCharArray();
				
				

				for (int p = 0; p < newesty.length; p++) {
					
					
					char[] newerery = newesty;
					
					String word3 = word2;
					word3 = word3 + newerery[p];
					
					String newwordagag = new String(newesty);
					String removedwordagag = removeCharAt(newwordagag, p);
					char[] newestyy = removedwordagag.toCharArray();
					
				
					
					
					
					for (int q = 0; q < newestyy.length; q++) {
						
						
						char[] newereryy = newestyy;
						
						String word4 = word3;
						word4 = word4 + newereryy[q];
						
						String newwordagagag = new String(newestyy);
						String removedwordagagag = removeCharAt(newwordagagag, q);
						char[] newestyyy = removedwordagagag.toCharArray();
						
						if (newestyy.length-1 == 0) {
						System.out.print(word4 + " ");
						} else {
							for (int r = 0; r < newestyyy.length; r++) {
								
								
								char[] newereryyy = newestyyy;
								
								String word5 = word4;
								word5 = word5 + newereryyy[r];
								
								String newwordagagagag = new String(newestyyy);
								String removedwordagagagag = removeCharAt(newwordagagagag, r);
								char[] newestyyyy = removedwordagagagag.toCharArray();
								
								if (newestyyy.length-1 == 0) {
								System.out.print(word5 + " ");
								} else {
									for (int s = 0; s < newestyyyy.length; s++) {
										
										
										char[] newereryyyy = newestyyyy;
										
										String word6 = word5;
										word6 = word6 + newereryyyy[s];
										
										String newwordagagagagag = new String(newestyyyy);
										String removedwordagagagagag = removeCharAt(newwordagagagagag, s);
										char[] newestyyyyy = removedwordagagagagag.toCharArray();
										
										if (newestyyyy.length-1 == 0) {
										System.out.print(word6 + " ");
										} else {
											for (int t = 0; t < newestyyyyy.length; t++) {
												
												
												char[] newereryyyyy = newestyyyyy;
												
												String word7 = word6;
												word7 = word7 + newereryyyyy[t];
												
												String newwordagagagagagag = new String(newestyyyyy);
												String removedwordagagagagagag = removeCharAt(newwordagagagagagag, t);
												char[] newestyyyyyy = removedwordagagagagagag.toCharArray();
												
												if (newestyyyyy.length-1 == 0) {
												System.out.print(word7 + " ");
												} else {
													for (int u = 0; u < newestyyyyyy.length; u++) {
														
														
														char[] newereryyyyyy = newestyyyyyy;
														
														String word8 = word7;
														word8 = word8 + newereryyyyyy[u];
														
														String newwordagagagagagagag = new String(newestyyyyy);
														String removedwordagagagagagagag = removeCharAt(newwordagagagagagagag, u);
														char[] newestyyyyyyy = removedwordagagagagagagag.toCharArray();
														
														if (newestyyyyyy.length-1 == 0) {
														System.out.print(word8 + " ");
														} else {
															
														}
														
														
														
														
														
													}
													
												}
												
												
												
												
												
											}
											
										}
										
										
										
										
										
									}
									
								}
								
								
								
								
								
							}
							
						}
						
						
						
						
						
					}
					
				}
				
				
				
				
				
			}
			
			
			
			
		}
		
	}

}


public class Month {
	String name;
	int days;
	int[] temp_log;
	
	public Month(String name, int days, char season) {
		this.name = name;
		this.days = days;
		this.temp_log = generateLog(season);
		
	}
	
	public int[] generateLog(char season) {
		/*
		 * SEASON KEY:
		 * 
		 * W = winter
		 * S = spring
		 * U = summer
		 * A = autumn
		 */
		
		int minTemp;
		int maxTemp;
		
		switch(season) {
			case 'W':
				minTemp = 27;
				maxTemp = 43;
				break;
			case 'S':
				minTemp = 36;
				maxTemp = 72;
				break;
			case 'U':
				minTemp = 64;
				maxTemp = 84;
				break;
			case 'A':
				minTemp = 41;
				maxTemp = 75;
				break;
			default:
				throw new ArithmeticException("ERROR: INVALID SEASON");
		}
		
		int[] temps = new int[days];
		for(int i = 0; i < days; i ++) {
			temps[i] = (int) (Math.random() * (maxTemp-minTemp+1)) + minTemp;
			
		}
		return temps;
		
	}

	
	public double getAverageTemp() {
		double sum = 0;
		for(int temp : temp_log) {
			sum+= temp;
		}
		return sum/days;
	}
	public int getLow() {
		int min = Integer.MAX_VALUE;
		for(int temp : temp_log) {
			if(temp<min) {
				min = temp;
			}
		}
		return min;
		
	}
	public int getHigh() {
		int max = Integer.MIN_VALUE;
		for(int temp : temp_log) {
			if(temp>max) {
				max = temp;
			}
		}
		return max;
	}
	
	public void displayCalendar() {
		System.out.println("\nFull Weather Log for " + name + " 2020:");
		int day = 1;
		for(int x : temp_log) {
			System.out.println(name + " " + day + ": " + x + "°F");
			day++;
		}
	}
	
	public String toString() {
		return String.format("\nWeather Summary for %s 2020: \nAverage: %.02f°F \nLow: %d°F \nHigh: %d°F", name, getAverageTemp(), getLow(), getHigh());
	}
	

}

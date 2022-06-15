
public class Year {
	Month [] year_log = new Month[12];
	int year ;
	
	public Year() {
		
		String[] monthN = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "Novomber", "December"};
		char[] seasons = {'W', 'W', 'S' ,'S', 'S', 'U', 'U', 'U', 'A', 'A', 'A', 'W'};
		int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		for(int x = 0; x< 12; x++) {
			year_log[x] = new Month(monthN[x], days[x], seasons[x]);
		}
		year = 2020;

	}
	
	public int getHigh() {
		int high = Integer.MIN_VALUE;
		for(Month m : year_log) {
			if(m.getHigh() > high) {
				high = m.getHigh();
			}
		}
		return high;
		
	}
	public int getLow() {
		int low = Integer.MAX_VALUE;
		for(Month m : year_log) {
			if(m.getLow() < low) {
				low = m.getLow();
			}
		}
		return low;
		
	}
	public double getAvg() {
		int sum = 0;
		for(Month m : year_log) {
			sum += m.getAverageTemp();
		}
		return sum / 12.0;
	
	}
	
	public void displayYear() {
		for(Month m : year_log) {
			m.displayCalendar();
		}
		
	}
	public String toString() {
		String to = "";
		for(Month m : year_log) {
			to += m.toString();
		}
		return to;
	}
	
	public void generalSummary() {
		System.out.println("\nWeather of 2020" + "\nAvg (Year Round): " + getAvg() + "\nLow: " + getLow() + "\nHigh: " + getHigh());
		
	}

}

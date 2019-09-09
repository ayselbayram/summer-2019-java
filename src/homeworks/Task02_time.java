package homeworks;

public class Task02_time {
	public static void main(String[] args) {
		int hour = 8, minute = 65, second =54; // hour = 14 means 2 pm
		String amorPm= "AM";
		
		if ( hour >=0 && hour <=11) {
			amorPm = "am";
			
		
			 if(minute<=59 && minute>=0) {
				minute=minute;
			 }
			 else {
				 System.out.println("cant calculate");
			 }
				 
				if (second<=59 && second>=0) {
					second=second;
				}
		}
		if (hour >=13 && hour<=23) {
		amorPm = "pm";
		}
		System.out.println("\t" + hour + ":" + minute + ":" + second + " " +amorPm);
		
	
	}
}

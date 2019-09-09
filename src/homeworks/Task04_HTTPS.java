package homeworks;

public class Task04_HTTPS {
	public static void main(String[] args) {
		int statusCode = 202;
		String finalResult= "invalid status code";// initialize it with default
		if (statusCode == 500) {
			finalResult ="ok";
		}
		else if (statusCode == 201 ) {
				finalResult = "Created";
				System.out.println("Statues code " + statusCode + " is : " + finalResult);
			}
		else if (statusCode == 202 ) {	
			finalResult= "accepted";
			System.out.println("Statues code " + statusCode + " is : " + finalResult);
		}
		else if (statusCode == 301) {
			finalResult="Move permanently ";
			System.out.println("Statues code " + statusCode + " is : " + finalResult);
		}
		else {
			System.out.println("invalid status code");
		}
					
				
					
					
		
			}
		
	}


		
	


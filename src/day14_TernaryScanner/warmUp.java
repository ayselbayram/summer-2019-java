package day14_TernaryScanner;

public class warmUp {
	public static void main(String[] args) {
		/*1. write a program that can display the days
		 * monday or tueasday====java class days
		 * thursday or friday====seleniumclass day
		 * wednesday or saturday====SQL class day
		 * otherwise ===day off
		 * 
		 * 
		 * 
		 
		 */
		String days="Saturday";
		switch (days) {
		case "Monday"://or logic
		case "Tuesday":
			System.out.println("Java class day");
			break;
		case "Thursday":
		case "Friday":
			System.out.println("Selenium class day");
			break;
		case "Wednesday":
		case "Saturday":
			System.out.println("SQL class day");
			break;
		default:
			System.out.println("day off");
			break;
		}
		
		System.out.println("===============");
		//assignment form HTTP task===canvas
		int statusCode= 500;
		switch (statusCode) {
		case 200:
			System.out.println("Ok");
			break;
		case 201:
			System.out.println("Created");
			break;
		case 202:
			System.out.println("Accepted");
			break;
		case 301:
			System.out.println("Moved Permanently");
			break;
		case 303:
			System.out.println("See other");
			break;
		case 304:
			System.out.println("Not modified");
			break;
		case 307:
			System.out.println("Temporary redirect");
			break;
		case 400:
			System.out.println("Bad request");
			break;
		case 401:
			System.out.println("Unauthorized");
			break;
		case 403:
			System.out.println("Forbidden");
			break;
		case 404:
			System.out.println("Not found");
			break;
		case 410:
			System.out.println("Gone");
			break;
		case 500:
			System.out.println("Internalserver error");
			break;
		case 503:
			System.out.println("service unavailable");
			break;
		default:
			System.out.println("not valid entry");
			break;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

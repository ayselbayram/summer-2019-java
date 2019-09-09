package homePractice.java;

public class operators {
public static void main(String[] args) {
	int appleCount =20;
	int orangeCount = 30;
	int pearCount = 30;
	boolean comp = appleCount < orangeCount || orangeCount >= pearCount;
	//                 20   <   30            || 30 >= 30
	//                    true              ||  true====>true
	
	System.out.println(comp);
	
	String OutsideWeather;
	int Degree;
	OutsideWeather = "Shinny";
	Degree = 70;
	boolean comp2 = (!(OutsideWeather =="rainny" || Degree == 70));
	//                 !(shinny        == rainny   || 70==70)
	//                !    (false   || true) ====> ! true===>false
	System.out.println(comp2);
	
	int b =2;
	boolean res = ++b == 2 || --b == 2 && --b ==2;
	//             3 == 2  || 2==2 &&  1==2
	//               false || true && false
	//               false || false===>false
	System.out.println(res);
	
	boolean x = true, z = true;
	int y = 20;
	x = (y != 10) || (z=false);
	//x = (20 != 10) || (true = false)	
	// x= true || false ===>true
	System.out.println(x);
}
}

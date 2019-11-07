package day18;

public class stringMethods {
	public static void main(String[] args) {
		
	
	/*
	 indexOf(str): returns the index number of the first occured character in the given String as an int value
	 helps us to find the index number
	 
	 lastindexOf()
	 returns the last occured characters index number as int value
	 
	
	 
	 
	 
	 */
	String A1="Batch12 us a great batch";

	
     int num=A1.indexOf("g");
     System.out.println(num);//13 first "g"
	
     //int num2=A1.indexOf("a");
     //System.out.println(num2);//1
     
     int num3=A1.indexOf("at ");//looking for index num of"a
     System.out.println(num3);//16
     
     //int num4=A1.indexOf("eat"+2);//eat2
     //returns negative numbe means STR is not exit in the string
     
    System.out.println("=============");
    String B="today is tuesday, today we have class in the afternoon";
    int num1=B.indexOf("te");
    System.out.println(num1);//4)  ask "t" from afternoon
    
    
    //exp
    
    String address="7925 Jones Branch Dr, Maclean, VA 22003";
    //find the city name from the adress and assigned it to cityname
    int begin=address.indexOf(",")+1+1;
    int end= address.indexOf(", V");
    System.out.println("begin"+begin);
    System.out.println("end"+end);
    
    
    String cityname=address.substring(begin,end);
    System.out.println(cityname);
    
    
    String email="Randomemails@gmail.com";
    int begin1=email.indexOf("@")+1;
    int end1=email.indexOf(".com");
    String type=email.substring(begin1,end1);
    System.out.println(type);
    
    
    //lastindexOf()
	 //returns the last occured characters index number as int value
    
    String str="ABCDABCD";
    int n2=str.lastIndexOf("B");//difference between indexOf("B")===1//takes the first B
    
    System.out.println(n2);
    System.out.println("==========");
    
    
    
    String myemail="Myemail.school@hotmail.com";
    int begex= myemail.indexOf("@")+1;
    int endex=myemail.lastIndexOf(".");
    String emailtype= myemail.substring(begex,endex);
    System.out.println(emailtype);
    
  
    
  
    
    
    
    
     
	
	
}
}
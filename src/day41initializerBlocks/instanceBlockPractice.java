package day41initializerBlocks;

public class instanceBlockPractice {
	public String name="Sirin";
    public instanceBlockPractice(){
    	this(8);//name=muhtar, 
    	name="Dinara";//last initialization
    }
    public instanceBlockPractice(int a){
    	name="Muhtar";
    }
	
	{
		name="Mihray";
	}
	{
		name="Hatice";
	}
	
	public static void main(String[] args) {
		instanceBlockPractice obj=new instanceBlockPractice();
		obj.name="Aijamal";
		System.out.println(obj.name);
		instanceBlockPractice obj2=new instanceBlockPractice();
		System.out.println(obj2.name);//hatice, if constructir there Dinara
	}

}

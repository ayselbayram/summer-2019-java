package day42OOPEncapsulation;

public class TestData1 {
	/*
	 Name
	 ID
	 
	 
	 getter(read only): an instance method, that returns the private data.
	 */
	
	private String Name="Bekir";//the data is not visible to any other classess
	private int ID=897;
	
	//getter:to read the value,data
	public String getName() {//read the private data only
		return Name;
	}
	
	public int getID() {
		return ID;
	}
	
	//setter: to change the value of the data,modify the data
	
	public void setName(String Name) {//if i dont give this keyword it is not going to modify correctly
		this.Name=Name;
		
	}
	
	public void setID(int ID) {
		this.ID=ID;
	}
	
	
	
	




}

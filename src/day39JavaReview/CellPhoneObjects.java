package day39JavaReview;

public class CellPhoneObjects {
	public static void main(String[] args) {
		CellPhones phone1=new CellPhones();
//		phone1.brand="IPhone";
//		phone1.model="XMAX";
//		phone1.color="White";
//		phone1.size=
		System.out.println(phone1.brand);
		System.out.println(phone1.color);
		System.out.println(phone1.model);
		System.out.println(phone1.price);
		System.out.println(phone1.size);
		System.out.println("-----------------------------------------------");
		phone1.getInfo();
		
		CellPhones phone2=new CellPhones("Samsung", 750, "red", 11.5, "Galaxy");
		phone2.getInfo();//instance method
		
		CellPhones phone3=new CellPhones("Nokia", 20, "black", 3.5, "brick");
		phone3.getInfo();
		
		CellPhones phone4=new CellPhones("Motorola", 200, "Gray", 6.3, "play");
		phone4.getInfo();
		
		System.out.println("--------------------------------");
		//create arrys of cellphones
		
		CellPhones [] phones = {phone1, phone2, phone3, phone4};
		
		//brand of phone3
		System.out.println(phones[2].brand);
		//get info of phone3
		
		phone3.getInfo();
		System.out.println("--------------------------------");
		for(CellPhones each:phones) {
			each.getInfo();
		}
		System.out.println("--------------------------------");
		for(int i=0;i<phones.length;i++) {
			phones[i].getInfo();
		}
		
		
	}

}

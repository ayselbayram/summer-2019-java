package day43JavaRecap;

public class EncapsulationShortCut {
	private int a=10;
	private int b=20;
	private int c=30;
	
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	/*
	 * 1. declare your private data
	 * 2. right click--> go to spurce, generate getter and setter
	 * 3. select the instance variables you want to generate getter and setter
	 * 4.click generate button
	 */
	
	/*
	 * create custom class for bank accounr
	 *   1-privatedata: accountholder, accountnumber, balance, pinNumber
	 *   2-generate getter and setter fro private datas
	 *   3-action; depositing, withdrawing, available balance
	 *        try to use getter and setter in those actions
	 */
	

}

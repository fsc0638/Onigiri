package Kinokuniya;
//僅有「區域變數」及「方法」的class
//無建立實作方法
//建立資做方法參照Adder_instanceMethod
public class Adder {
	private int number;				//設定區域變數
	public Adder(int number) {			//初始化
		this.number = number;
	}
	public void add() {				//add()方法，將number逐一增加
		number++;							
	}
	public int getNumber() {			//Get方法
		return number();
	}
	private int number() {
		return number;
	}
	public void setNumber(int number) {		//Set方法
		this.number = number;
	}

}

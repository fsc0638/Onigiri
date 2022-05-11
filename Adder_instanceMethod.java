package Kinokuniya;

public class Adder_instanceMethod {

	public static void main(String[] args) {
		Adder num = new Adder(10);
		//使用new，複製指定class中的區域變數、方法至記憶體中，生成實作方法
		//代入Adder的Object定義，並加入實作方法
		//與static member不同的是，instance member是在系統main方法中，利用new將static複製出來，並帶入引數
		//將變數num 代入 引數10
		num.add();											//add()方法，將number逐一增加
		num.add();											//add()方法，將number逐一增加
		System.out.println("number = " + num.getNumber());	//印出
															//number = 12
	}

}

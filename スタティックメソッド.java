package Kinokuniya;
//static靜態方法
//使用static，使程式可以**直接執行**
	//使用static，使程式隨時處於待命狀態
	//JVM會在執行開始前，將已標註static的區域變數field、方法method複製於記憶體中（即可直接執行）（只會存在一次）
public class スタティックメソッド {
	private static int number;							//區域變數
	public static void add() {							//add()方法
		number++;
	}
	public static void main(String[] args) {			//main方法
		number = 10;									//將變數number 代入 引數10
		add();
		add();
		System.out.println("number = " + number);		//印出
	}

}

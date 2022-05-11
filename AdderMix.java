package Kinokuniya;

public class AdderMix {
	private int number;
	public AdderMix(int number) {
		this.number = number;
	}
	public void add() {
		number++;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
//僅定義方法，沒有實作
//------------------（兩者上下調換位置不影響結果）------------------------
//編寫實作內容
	public static void main(String[] args) {
		AdderMix num = new AdderMix(10);
		num.add();
		num.add();
		System.out.println("number = " + num.getNumber());
		System.out.println("number = " + num.getClass());
	}
}
//根據JVM運作，會被複製到記憶體的僅有static member，會無視instance Method
//instance Method只有在運作中才會將變數、引數、值，配置到記憶體並運作，當程式結束時，自動清理記憶體
//故將instance Method（範例Adder class的定義）與static Method（main Method）結合使用不影響運作

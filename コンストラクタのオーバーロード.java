package Kinokuniya;

import java.util.Arrays;

public class コンストラクタのオーバーロード {
	//指定一個變數，型態為浮點數陣列
	private double[] x ;
	//overload的初始化建構式其二---
	//其一：指派陣列
	public コンストラクタのオーバーロード (double[] x) {
		this.x = x;
	}
	//其二：將為「引數」的陣列大小進行初始化
	public コンストラクタのオーバーロード (int size) {
		//將所有元素初始化為0
		x = new double[size];
	}
	//---
	public double sum() {
		return Arrays.stream(x).sum();
	}
	public double mean() {
		return sum()/x.length;
	}
	//取出（Get）陣列中第i項之值
	public double get(int i) {
		return x[i];
	}
	//取出陣列中第i項之值，並修改（Set）為a
	public void set (int i , double a) {
		x[i] = a ;
	}
	//-----
	//直接在「class中、建構初始化方法之下」設定實作方法（Main Method）
	public static void main(String[] args) {
		//將陣列初始化，傳入引數，賦予值
		double[] data = {2.8 , 1.5 , 5.4 , 8.2 , 3.5};
		コンストラクタのオーバーロード st1 = new コンストラクタのオーバーロード(data);
		System.out.println("st1合計 ＝ " + st1.sum());
		System.out.println("st1平均 ＝ " + st1.mean());
		System.out.println("----------");
		//將陣列個數引數化，並代入for迴圈執行迭代
		//再利用Set方法，變更陣列中的值，再執行加總
		コンストラクタのオーバーロード st2 = new コンストラクタのオーバーロード(data.length);
		for (int i = 0; i < data.length; i++) {
			//兩者代入引數相同，第[0]項更改為int 0;第[1]項更改為int 1...
			st2.set(i , i);
		}
		System.out.println("st2合計 ＝ "+st2.sum());
		System.out.println("st2平均 ＝ " + st2.mean());
		//st1合計 ＝ 21.4
		//st1平均 ＝ 4.279999999999999
		//-----
		//st2合計 ＝ 10.0
		//st2平均 ＝ 2.0
		
	}
	}



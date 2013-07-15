package step1;

import test_f.Class3Test;

public class Class3 {
	public static void main(int data1, int data2,int data3){
		
		//結果を格納する変数
		final String disp4;
		final String disp5;
		final String disp6;
		final String disp7;
		final String disp8;
		final String disp9;
		
		//入力データ
		int d1;					//入力値が変動値
		int d2;
		int d3;
		int a = 10;				//入力値が固定値
		int b = 20;
		int c = 30;
		
		//Class4をインスタンス
		Class4 class4 = new Class4();
		
		//処理１
		class4.M_1("test");		//渡した引数をコンソールに表示
		
		//処理２
		d1 = data1;				//入力値を設定
		d2 = data2;
		d3 = data3;
		class4.t_method1(d1,d2,d3);//1回目
		disp4 = class4.disp1;
		disp5 = class4.disp2;
		disp6 = class4.disp3;		
		
		class4.t_method1(a, b, c);//2回目
		disp7 = class4.disp1;
		disp8 = class4.disp2;
		disp9 = class4.disp3;		
		
		//結果を表示
		System.out.println(disp4);
		System.out.println(disp5);
		System.out.println(disp6);
		System.out.println(disp7);
		System.out.println(disp8);
		System.out.println(disp9);		
		
	}


}

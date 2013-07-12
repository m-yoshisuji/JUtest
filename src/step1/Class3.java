package step1;

public class Class3 {
	public static void main(String[] args){
		
		//結果を格納する変数
		String disp4;
		String disp5;
		String disp6;
		String disp7;
		String disp8;
		String disp9;
		
		//入力データ
		int a = 10;
		int b = 20;
		int c = 30;
		
		//Class4をインスタンス
		Class4 class4 = new Class4();
		
		//処理１
		class4.M_1("test");		//渡した引数をコンソールに表示
		
		//処理２
		class4.t_method1(123456789, 222222222, 999999999);//1回目
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

package step1;

public class Class3 {
	public static void main(String[] args){
		
		int a = 10;
		int b = 20;
		int c = 30;
		
		//Class4をインスタンス
		Class4 class4 = new Class4();
		
		//メイン処理（Class4のメソッドに引数を渡して使用）
		class4.M_1("test");		//渡した引数をコンソールに表示
		
		class4.t_method1(123456789, 222222222, 999999999);
		class4.t_method1(a, b, c);
		
		
	}
}

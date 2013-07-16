package step1;

public class Class3 {

	public static void main (String[] args){

		t1(101010101,333333333,555555555);
	}
		
		public static void t1(int data1, int data2,int data3){
		
		//結果を格納する変数
		final String disp4;
		final String disp5;
		final String disp6;
		final String disp7;
		final String disp8;
		final String disp9;
		
		//入力データ
		String d1;					//入力値（変動）を設定
		String d2;
		String d3;
		String a = String.valueOf(10);			//入力値（固定）を設定
		String b = String.valueOf(20);
		String c = String.valueOf(30);
	
		try{
		//Class4をインスタンス
		Class4 cls4 = new Class4();

			
		//処理１
		cls4.M_1("test");		//入力値(固定)を設定
		
		//処理２
		d1 = String.valueOf(data1);	//入力値を設定
		d2 = String.valueOf(data2);
		d3 = String.valueOf(data3);
		
		cls4.t_method1(d1,d2,d3);//1回目
		disp4 = cls4.disp1;
		disp5 = cls4.disp2;
		disp6 = cls4.disp3;

		
		cls4.t_method1(a, b, c);//2回目
		disp7 = cls4.disp1;
		disp8 = cls4.disp2;
		disp9 = cls4.disp3;		
		
		//結果を表示
		System.out.println(disp4);
		System.out.println(disp5);
		System.out.println(disp6);
		System.out.println(disp7);
		System.out.println(disp8);
		System.out.println(disp9);		
		}
		
		catch(Exception e){
			System.err.println("エラー" + e.getMessage());
		}

		
		}
		

}

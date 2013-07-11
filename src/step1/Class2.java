package step1;

public class Class2 {
	
	public int num1;
	public int num2;
	public int num3;	

/**
	 * 
	 * @param args
	 */
	public static void t_method1(String[] args){
	
	//配列
	int num1 = 123456789;
	int num2 = 222222222;
	int num3 = 999999999;
	int[] n = new int []{num1,num2,num3};
	String kihon = "No";

	System.out.println(kihon + n[0]);
	System.out.println(kihon + n[2]);
	System.out.println("配列の要素数は" + n.length + "個");

	//多次元配列
	String str1 = "牛";
	String str2 = "兎";
	String str3 = "うみうし";
	String[][] s = {{str1,"10"},{str2,"50"},{str3,"100"}};
	String tani1 = "頭";
	String tani2 = "匹";
	
	System.out.println(s[0][0] + "：" + s[0][1] + tani1);
	System.out.println(s[1][0] + "：" + s[1][1] + tani1);
	System.out.println(s[2][0] + "：" + s[2][1] + tani2);	

	//equals
	String tamai = "yellow";
	String shiori = "yellow";
	String kanako = "red";

	System.out.println(tamai.equals("yellow"));
	System.out.println(shiori.equals(shiori));
	System.out.println(tamai.equals(kanako));		

	//split
	String mt1 = "あいうえお";
	String mt2 = "かきくけこ";

	String[] splited1 = mt1.split("う");
	String[] splited2 = mt2.split("く");
	System.out.println(splited1[0] + "た" + splited2[1]);
	
	}
	
	/**
	 * 
	 * @param args
	 */
	public static void t_method2(String[] args){
		//if
		int num1 = 1;
		int num2 = 10;
		
		if(num1 > num2){
			System.out.println("num1 > num2");
		}
		else if(num1 == num2){
			System.out.println("num1 = num2");
		}
		else{
			System.out.println(num1 + "は" + num2 + "より大きくない。");
		}
		
		if(num1 != 10){
			System.out.println("10を入力して下さい。");
		}
	}
	
		/**
		 * 
		 * @param args
		 */
		//public static void t_method3(String[] args){
		public static void main(String[] args){
			//while
			int num3 = 3;
			int num4 = 4;
			
			while(num3 < 10){
				System.out.println("num3：" + num3);
				num3++;
			}
			
		}
}

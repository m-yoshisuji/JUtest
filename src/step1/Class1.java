package step1;

public class Class1 {
	
	public static void main(String[] args){
		
		//�z��
		int num1 = 123456789;
		int num2 = 222222222;
		int num3 = 999999999;
		int[] n = new int []{num1,num2,num3};
		String kihon = "No";

		System.out.println(kihon + n[0]);
		System.out.println(kihon + n[2]);
		System.out.println("�z��̗v�f����" + n.length + "��");

		//�������z��
		String str1 = "��";
		String str2 = "�e";
		String str3 = "���݂���";
		String[][] s = {{str1,"10"},{str2,"50"},{str3,"100"}};
		String tani1 = "��";
		String tani2 = "�C";
		
		System.out.println(s[0][0] + "�F" + s[0][1] + tani1);
		System.out.println(s[1][0] + "�F" + s[1][1] + tani1);
		System.out.println(s[2][0] + "�F" + s[2][1] + tani2);	

		//equals
		String tamai = "yellow";
		String shiori = "yellow";
		String kanako = "red";

		System.out.println(tamai.equals("yellow"));
		System.out.println(shiori.equals(shiori));
		System.out.println(tamai.equals(kanako));		

		//split
		String mt1 = "�������܂�";
		String mt2 = "����������";

		String[] splited1 = mt1.split("��");
		String[] splited2 = mt2.split("��");
		System.out.println(splited1[0] + "��" + splited2[1]);
	}

}
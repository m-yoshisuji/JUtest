package step1;

import test_f.Class3Test;

public class Class3 {
	public static void main(int data1, int data2,int data3){
		
		//���ʂ��i�[����ϐ�
		final String disp4;
		final String disp5;
		final String disp6;
		final String disp7;
		final String disp8;
		final String disp9;
		
		//���̓f�[�^
		int d1;					//���͒l���ϓ��l
		int d2;
		int d3;
		int a = 10;				//���͒l���Œ�l
		int b = 20;
		int c = 30;
		
		//Class4���C���X�^���X
		Class4 class4 = new Class4();
		
		//�����P
		class4.M_1("test");		//�n�����������R���\�[���ɕ\��
		
		//�����Q
		d1 = data1;				//���͒l��ݒ�
		d2 = data2;
		d3 = data3;
		class4.t_method1(d1,d2,d3);//1���
		disp4 = class4.disp1;
		disp5 = class4.disp2;
		disp6 = class4.disp3;		
		
		class4.t_method1(a, b, c);//2���
		disp7 = class4.disp1;
		disp8 = class4.disp2;
		disp9 = class4.disp3;		
		
		//���ʂ�\��
		System.out.println(disp4);
		System.out.println(disp5);
		System.out.println(disp6);
		System.out.println(disp7);
		System.out.println(disp8);
		System.out.println(disp9);		
		
	}


}

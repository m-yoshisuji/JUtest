package step1;

public class Class3 {
	public static void main(String[] args){
		
		//���ʂ��i�[����ϐ�
		String disp4;
		String disp5;
		String disp6;
		String disp7;
		String disp8;
		String disp9;
		
		//���̓f�[�^
		int a = 10;
		int b = 20;
		int c = 30;
		
		//Class4���C���X�^���X
		Class4 class4 = new Class4();
		
		//�����P
		class4.M_1("test");		//�n�����������R���\�[���ɕ\��
		
		//�����Q
		class4.t_method1(123456789, 222222222, 999999999);//1���
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

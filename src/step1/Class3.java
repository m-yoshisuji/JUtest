package step1;

public class Class3 {
	public static void main(String[] args){
		
		int a = 10;
		int b = 20;
		int c = 30;
		
		//Class4���C���X�^���X
		Class4 class4 = new Class4();
		
		//���C�������iClass4�̃��\�b�h�Ɉ�����n���Ďg�p�j
		class4.M_1("test");		//�n�����������R���\�[���ɕ\��
		
		class4.t_method1(123456789, 222222222, 999999999);
		class4.t_method1(a, b, c);
		
		
	}
}

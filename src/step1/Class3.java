package step1;

public class Class3 {

	public static void main (String[] args){

		t1(101010101,333333333,555555555);
	}
		
		public static void t1(int data1, int data2,int data3){
		
		//���ʂ��i�[����ϐ�
		final String disp4;
		final String disp5;
		final String disp6;
		final String disp7;
		final String disp8;
		final String disp9;
		
		//���̓f�[�^
		String d1;					//���͒l�i�ϓ��j��ݒ�
		String d2;
		String d3;
		String a = String.valueOf(10);			//���͒l�i�Œ�j��ݒ�
		String b = String.valueOf(20);
		String c = String.valueOf(30);
	
		try{
		//Class4���C���X�^���X
		Class4 cls4 = new Class4();

			
		//�����P
		cls4.M_1("test");		//���͒l(�Œ�)��ݒ�
		
		//�����Q
		d1 = String.valueOf(data1);	//���͒l��ݒ�
		d2 = String.valueOf(data2);
		d3 = String.valueOf(data3);
		
		cls4.t_method1(d1,d2,d3);//1���
		disp4 = cls4.disp1;
		disp5 = cls4.disp2;
		disp6 = cls4.disp3;

		
		cls4.t_method1(a, b, c);//2���
		disp7 = cls4.disp1;
		disp8 = cls4.disp2;
		disp9 = cls4.disp3;		
		
		//���ʂ�\��
		System.out.println(disp4);
		System.out.println(disp5);
		System.out.println(disp6);
		System.out.println(disp7);
		System.out.println(disp8);
		System.out.println(disp9);		
		}
		
		catch(Exception e){
			System.err.println("�G���[" + e.getMessage());
		}

		
		}
		

}

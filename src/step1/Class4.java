package step1;

public class Class4 {
	
	//�R���X�g���N�^
	public Class4(){
		this.a = "";
		this.disp1 = "";
		this.disp2 = "";
		this.disp3 = "";
	}
	
	public String a;		//M_1�����Ŏg�p
	public String disp1;	//t_method�����Ŏg�p
	public String disp2;
	public String disp3;
	
	/**
	 * 
	 * @param msg
	 */
	public void M_1(String msg){
		a = msg;
		System.out.println(msg);
	}
	
	
	/**
	 * 
	 * @param args
	 */
	public void t_method1(String num1,String num2,String num3){
	
	//�z��
	String[] n = new String []{num1,num2,num3};
	String kihon = "No";
	
	disp1 = kihon + n[0];
	disp2 = kihon + n[2];
	disp3 = "�z��̗v�f����" + n.length + "��";
	

	}
	
	
	

}

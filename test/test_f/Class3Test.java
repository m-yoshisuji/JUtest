package test_f;
import static org.hamcrest.CoreMatchers.*;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.both;
import static org.junit.matchers.JUnitMatchers.containsString;
import static org.junit.matchers.JUnitMatchers.either;
import static org.junit.matchers.JUnitMatchers.everyItem;
import static org.junit.matchers.JUnitMatchers.hasItem;
import static org.junit.matchers.JUnitMatchers.hasItems;

import java.util.ArrayList;
import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import step1.Class3;
import step1.Class4;


public class Class3Test {


    @BeforeClass
    public static void doBeforeClass() {
        //System.out.println("Now doBeforeClass..");
    }

    
    //�e�X�g�f�[�^
    @SuppressWarnings("serial")
    
	//�e�X�g�Ώۂ̃N���X���C���X�^���X
    Class4 class4 = new Class4();
    
	//���ʂ��i�[����ϐ�
	String d4;
	String d5;
	String d6;
	String d7;
	String d8;
	String d9;

    
    @Test
    public void test_1() {
		class4.t_method1("123456789","222222222","999999999");//1��ڂ̏����ɓ��͒l��ݒ�
		
		d4 = class4.disp1;
		d5 = class4.disp2;
		d6 = class4.disp3;
		
    	//�G���[����
    	System.err.println("test5");
    	
		//�e�X�g���ʂ̊m�F
    	assertThat(d4,is ("No123456789"));
    	assertThat(d5,is ("No999999999"));
    	assertThat(d6,is ("�z��̗v�f����3��")); 
    	/**
    	assertThat(d7,is ("No10"));
    	assertThat(d8,is ("No30"));
    	assertThat(d9,is ("�z��̗v�f����3��"));
		**/
    }
    
 
	/**
    @Test
	public void test1() {
    	System.err.println("test1");
    	
    	assertThat();
    	
    	//�p�ӂ��ꂽassert���\�b�h���g���Ď��������N���X�̃e�X�g�s���܂�
    	//��F�T�[�r�X�w�̃N���X���C���X�^���X������mainProcess���e�X�g����
    	//�e�X�g�p�Ɍ��J����Ă���RemoteData������Ēl��n��(�N���C�A���g����̃f�[�^���G�~�����[�g)
//    	RemoteData remData = new RemoteData();
    	//�e�X�g�f�[�^�̃Z�b�g(�����ł͏���ID�̂�)
//    	remData.setFromID("testUD");
    	
//    	ArrayList<String> arg = new ArrayList<String>();
//    	arg.add("test");
//    	remData.setFromData(arg);
    	//�e�X�g�������\�b�h�̌Ăяo�����N���X��DI���Ă����K�v������(������DI���Ă���ꍇ)
//    	sampleService.mainProcess(remData);
    	
    	//������ɑz�肳��錋�ʂ��`�F�b�N����
//    	assertEquals(remData.getToData().getToMessage(), "Hello!!test");
		
    	//fail("Not yet implemented");
	}



    @Test
    public void test2() {
    	System.err.println("test2");
        // ���X�g��a���܂܂�邩
        assertThat(sample, hasItem("a"));

        // ���X�g��a��b���܂܂�邩
        assertThat(sample, hasItems("a", "b"));

        // ���X�g�̑S�Ă̗v�f��e�łȂ���
        assertThat(sample, everyItem(is(not("e"))));
    }


    @Test
    public void test3() {
    	System.err.println("test3");
        // �������a���܂܂�邩
        assertThat(sample.toString(), containsString("a"));

        // �������b�܂���c���܂܂�邩
        assertThat(sample.toString(), either(containsString("b")).or(containsString("c")));

        // �������a��c�Ƃ��Ɋ܂܂�邩
        assertThat(sample.toString(), both(containsString("a")).and(containsString("c")));
    }
    

    
    @Test
    public void test5() {
    	System.err.println("test5");
    	
    	//������sample2=sample2�������琬��
    	assertEquals(sample2.toString(),sample2.toString());
    }
   
   **/
    
    
    //--------------------------------------------------------------------------
    
    /**
     * 
     * �e�X�g�N���X�̍Ō�ɌĂ΂�鏈��
     * 
     */
    @AfterClass
    public static void doAfterClass() {
        //System.out.println("Now doAfterClass..");
    }
}
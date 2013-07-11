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

/**
 * 
 * @author m.yoshisuji
 *�R�~�b�g�e�X�g�P
 */


public class Class1Test {


    /**
     * 
     * �e�X�g�N���X�̍ŏ��ɌĂ΂�鏈��
     * 
     */
    @BeforeClass
    public static void doBeforeClass() {
        //System.out.println("Now doBeforeClass..");
    }

    /**
     * 
     * ��Test���w�肵�����\�b�h��Assume.assumeThat�őO��������L�q���A
     * Assert.assertThat�ŏ������`�F�b�N���Ă���
     * �O������������L�q���Ȃ��ꍇ�Ɣ�r���āA
     * ���̂悤�Ƀ��j�b�g�e�X�g�R�[�h�Ƃ��ċL�q���Ă����΁A
     * ���s�����z�肵�Ă�����̂Ɠ������ǂ������e�X�g���Ƀ`�F�b�N�ł���
     * 
     * Assume�̓e�X�g�������ł̑O��������e�X�g���邽�߂̋@�\�ł�
     * �������A�O������������̂Ȃ�΁A��ɑ����e�X�g�͖��Ӗ��Ɣ��f��
     * �e�X�g�S�̂ɑ΂��ĉe����^���Ȃ��悤�Ƀe�X�g�����Ƃ��Ĉ����Ƃ����Ӗ��ɂȂ�܂�
     * 
     * 
     */
    @Test
	public void assertThatTest() {
    	System.err.println("assertThatTest");

	}

    //�e�X�g�f�[�^
    @SuppressWarnings("serial")
	final List<String> sample = new ArrayList<String>() {{add("a"); add("b"); add("c"); add("d");}};
	final List<String> sample2 = new ArrayList<String>() {/**
		 * 
		 */
		private static final long serialVersionUID = -6964514288375744264L;

	{add("e"); add("f"); add("g"); add("h");}};
    




	/**
     *
     */
    @Test
    public void test_x() {
    	System.err.println("test5");
        //������NotNull�������琬��
        assertNotNull(sample2.toString());
        
        //���Ғl�Ǝ��ђl�������Q�Ƃ����Ă��Ȃ��ꍇ�͐���I���B
        assertNotSame(sample2.toString(),sample.toString());
        
        //
        //assertThat(sample2.toString(),);
    }
    
    



	/**
     * 
     */
    @Test
	public void test1() {
    	System.err.println("test1");
    	
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



    /**
     * 
     */
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

    /**
     * 
     */
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
    

    
    /**
     * 
     */
    @Test
    public void test5() {
    	System.err.println("test5");
    	
    	//������sample2=sample2�������琬��
    	assertEquals(sample2.toString(),sample2.toString());
    }
   
    
    
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

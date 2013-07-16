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

    
    //テストデータ
    @SuppressWarnings("serial")
    
	//テスト対象のクラスをインスタンス
    Class4 class4 = new Class4();
    
	//結果を格納する変数
	String d4;
	String d5;
	String d6;
	String d7;
	String d8;
	String d9;

    
    @Test
    public void test_1() {
		class4.t_method1("123456789","222222222","999999999");//1回目の処理に入力値を設定
		
		d4 = class4.disp1;
		d5 = class4.disp2;
		d6 = class4.disp3;
		
    	//エラー処理
    	System.err.println("test5");
    	
		//テスト結果の確認
    	assertThat(d4,is ("No123456789"));
    	assertThat(d5,is ("No999999999"));
    	assertThat(d6,is ("配列の要素数は3個")); 
    	/**
    	assertThat(d7,is ("No10"));
    	assertThat(d8,is ("No30"));
    	assertThat(d9,is ("配列の要素数は3個"));
		**/
    }
    
 
	/**
    @Test
	public void test1() {
    	System.err.println("test1");
    	
    	assertThat();
    	
    	//用意されたassertメソッドを使って実装したクラスのテスト行います
    	//例：サービス層のクラスをインスタンス化してmainProcessをテストする
    	//テスト用に公開されているRemoteDataを作って値を渡す(クライアントからのデータをエミュレート)
//    	RemoteData remData = new RemoteData();
    	//テストデータのセット(ここでは処理IDのみ)
//    	remData.setFromID("testUD");
    	
//    	ArrayList<String> arg = new ArrayList<String>();
//    	arg.add("test");
//    	remData.setFromData(arg);
    	//テストしたメソッドの呼び出し→クラスはDIしておく必要がある(内部でDIしている場合)
//    	sampleService.mainProcess(remData);
    	
    	//処理後に想定される結果をチェックする
//    	assertEquals(remData.getToData().getToMessage(), "Hello!!test");
		
    	//fail("Not yet implemented");
	}



    @Test
    public void test2() {
    	System.err.println("test2");
        // リストにaが含まれるか
        assertThat(sample, hasItem("a"));

        // リストにaとbが含まれるか
        assertThat(sample, hasItems("a", "b"));

        // リストの全ての要素がeでないか
        assertThat(sample, everyItem(is(not("e"))));
    }


    @Test
    public void test3() {
    	System.err.println("test3");
        // 文字列にaが含まれるか
        assertThat(sample.toString(), containsString("a"));

        // 文字列にbまたはcが含まれるか
        assertThat(sample.toString(), either(containsString("b")).or(containsString("c")));

        // 文字列にaとcともに含まれるか
        assertThat(sample.toString(), both(containsString("a")).and(containsString("c")));
    }
    

    
    @Test
    public void test5() {
    	System.err.println("test5");
    	
    	//文字列がsample2=sample2だったら成功
    	assertEquals(sample2.toString(),sample2.toString());
    }
   
   **/
    
    
    //--------------------------------------------------------------------------
    
    /**
     * 
     * テストクラスの最後に呼ばれる処理
     * 
     */
    @AfterClass
    public static void doAfterClass() {
        //System.out.println("Now doAfterClass..");
    }
}
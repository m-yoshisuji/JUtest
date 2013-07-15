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

/**
 * 
 * @author m.yoshisuji
 *コミットテスト１
 */


public class Class3Test {


    /**
     * 
     * テストクラスの最初に呼ばれる処理
     * 
     */
    @BeforeClass
    public static void doBeforeClass() {
        //System.out.println("Now doBeforeClass..");
    }

    /**
     * 
     * ＠Testを指定したメソッドにAssume.assumeThatで前提条件を記述し、
     * Assert.assertThatで条件をチェックしている
     * 前提条件を何も記述しない場合と比較して、
     * このようにユニットテストコードとして記述しておけば、
     * 実行環境が想定しているものと同じかどうかをテスト時にチェックできる
     * 
     * Assumeはテストをする上での前提条件をテストするための機能です
     * もしも、前提条件が崩れるのならば、後に続くテストは無意味と判断し
     * テスト全体に対して影響を与えないようにテスト成功として扱うという意味になります
     * 
     * 
     */
    @Test
	public void assertThatTest() {
    	System.err.println("assertThatTest");

	}

    
    //テストデータ
    @SuppressWarnings("serial")
    
	//テスト対象のクラスをインスタンス
    Class3 class3 = new Class3();
    
	//結果を格納する変数
	String disp4;
	String disp5;
	String disp6;
	String disp7;
	String disp8;
	String disp9;
	
	
    //入力データ
	int a = 10;
	int b = 20;
	int c = 30;

    
    @Test
    public void test_x() {
        Class3 class3 = new Class3();
		class3.main(123456789, 222222222, 999999999);//1回目の処理に入力値を設定

    	//エラー処理
    	System.err.println("test5");
    	
		//テスト結果の確認
    	assertThat(disp4,is (""));
    	assertThat(disp5,is (""));
    	assertThat(disp6,is ("")); 
    	assertThat(disp7,is (""));
    	assertThat(disp8,is (""));
    	assertThat(disp9,is (""));
    	

        //文字列がNotNullだったら成功
        //assertNotNull();
        
        //期待値と実績値が同じ参照をしていない場合は正常終了。
        //assertNotSame(sample2.toString(),sample.toString());
        
        //
        //assertThat(sample2.toString(),);
    }
    
 
	/**
     * 
     */
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



    /**
     * 
     */
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

    /**
     * 
     */
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
    

    
    /**
     * 
     */
    @Test
    public void test5() {
    	System.err.println("test5");
    	
    	//文字列がsample2=sample2だったら成功
    	assertEquals(sample2.toString(),sample2.toString());
    }
   
    
    
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
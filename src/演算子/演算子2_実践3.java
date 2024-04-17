package 演算子;

/**
 * HelloWorld クラス
 */
 public class 演算子2_実践3 {
	 /**
	  * main メソッド
	  * @param args 実行引数
	  */
	 public static void main(String[]args) {
		 int x = 5;
		 int y = 3;
		 int temp = x;
		 x = y;
		 y = temp;
		 
		 System.out.println("X = " + x + "," + "Y = " + y);
	 }
 }
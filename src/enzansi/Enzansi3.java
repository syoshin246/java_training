package enzansi;

/**
 * 実力確認問題　2．演算子　3
 */
 public class Enzansi3 {
	 /**
	  * main メソッド
	  * int 型の変数 x、y に任意の数値を代入し、x の値を y に、y の値を x に入れ替えて x と y の値を表示。
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
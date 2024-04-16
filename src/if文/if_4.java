package if文;

/**
 * HelloWorld クラス
 */
 public class if_4 {
	 /**
	  * main メソッド
	  * @param args 実行引数
	  */
	 public static void main(String[]args) {
		 int x = 1;
		 int y = 1;
		 if(x > y){
			 System.out.println("x は y より大き い");
		 }else if(x < y){
			 System.out.println("x は y より小さい");
		 }else if(x == y) {
			 System.out.println("x と y は等 しい"); 
		 }
	 }
 }
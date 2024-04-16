package if文;

/**
 * HelloWorld クラス
 */
 public class if_6 {
	 /**
	  * main メソッド
	  * @param args 実行引数 
	  */
	 public static void main(String[]args) {
		 int x = 1;

		 if(x > 0 && 
		   (x % 2) == 0){
			 System.out.println("正の偶数");
		 }else if(x < 0 &&
				 (x % 2) == 1){
			 System.out.println("正の奇数");
		 }else if(x < 0 &&
				 (x % 2) == 0){
			 System.out.println("負の偶数");
		 }else if(x < 0 &&
				 (x % 2) == 1){
			 System.out.println("負の奇数");
		 }else if((x % 2) == 0){
			 System.out.println("正でも負でもない偶数");
		 }
	 }
 }
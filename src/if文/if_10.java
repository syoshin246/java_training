package if文;

/**
 * HelloWorld クラス
 */
 public class if_10 {
	 /**
	  * main メソッド
	  * @param args 実行引数 
	  */

	 public static void main(String[]args) {
		 int x = 80;
		 String y = "男性";

		 if(y == "男性") {
			 if(x == 80){
				 System.out.println(8000);
			 }else if(x == 50){
				 System.out.println(7000);
			 }else if(x == 30){
				 System.out.println(5000);
			 }
		 }else if(y == "女性") {
			 if(x == 80){
				 System.out.println(7000);
			 }else if(x == 50){
				 System.out.println(6000);
			 }else if(x == 30){
				 System.out.println(4500);	 
			 }
		 }
	 }
 }
 
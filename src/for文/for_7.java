package for文;

/**
 * HelloWorld クラス
 */
 public class for_7 {
	 /**
	  * main メソッド
	  * @param args 実行引数 
	  */

	 public static void main(String[]args) {
		 int[] s = {15, 16, 17, 18, 19}; 
		 int s2 = 0;
			 for(int i = 0; i < 5; i++) {
				 int s1 = s[i];
				 		System.out.println("年齢を入力してください。");
				 		if(s1 >= 20) {				 						 			
				 			System.out.println(s1);
				 			s2 =+ s1;
				 		}
				 
			 }if(s2 <= 0) {
					 System.out.println("20才以上は存在しません");
			 }
	 }
}
	 

 



 
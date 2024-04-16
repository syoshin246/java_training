package for文;
import java.util.Random;
/**
 * HelloWorld クラス
 */
 public class for_5 {
	 /**
	  * main メソッド
	  * @param args 実行引数 
	  */

	 public static void main(String[]args) {		 	
			 for(int i = 0; i < 100; ) {
				 int num = i;
				 		Random rand = new Random();
				 		num = rand.nextInt(10) +num;
				 		i = num;
				 		System.out.println(i);
				 
				 }
			 }
	 }
	 

 



 
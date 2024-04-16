package for文;
import java.util.Random;
/**
 * HelloWorld クラス
 */
 public class for_3 {
	 /**
	  * main メソッド
	  * @param args 実行引数 
	  */

	 public static void main(String[]args) {
		 int num1 = 0;
		 for(int i = 0; i < 10; i++) {
			 
			 Random rand = new Random();
			 int num = rand.nextInt(10) +100;
			 num1 = num +num1;
			 System.out.println(num1);
			 if(i == 9) {
			 	System.out.println(num1/10);
			 }
	 }

 

	 }
 }

 
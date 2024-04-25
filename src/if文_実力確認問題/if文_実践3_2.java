package if文_実力確認問題;
import java.io.*;
/**
 * HelloWorld クラス
 */
 public class if文_実践3_2 {
	 /**
	  * main メソッド
	  * @param args 実行引数
	  */
	 public static void main(String[]args)throws IOException
	 {
		 
		 BufferedReader br =
		  new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("xに入れる数字を入力してください"); 
		 String x1 = br.readLine();
		 System.out.println("ｙに入れる数字を入力してください");
		 String y1 = br.readLine();
		 int x = Integer.parseInt(x1);
		 int y = Integer.parseInt(y1);
		 if(x < y &&
			x % 2 == 0 &&
			y % 2 == 0) {
			 System.out.println("x は y より小さく、かつ、x と y は共に偶数である。");
		 }else if(x == y &&
				  x < 0 &&
				  y < 0) {
			 System.out.println("x と y は等しく、かつ、負の数である。");
		 }else if(x < y ||
				  x % 2 == 0) {
			 System.out.println("x は y より小さい、または、x は偶数である。");
		 }else {
		 }
			 
		 
	 }
 }
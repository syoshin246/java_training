package java_if;
import java.io.*;
/**
 * HelloWorld クラス
 */
 public class If_3_1_2 {
	 /**
	  * main メソッド
	  * @param args 実行引数
	  */
	 public static void main(String[]args)throws IOException
	 {
		 System.out.println("点数を入力してください。");
		 
		 BufferedReader br =
		  new BufferedReader(new InputStreamReader(System.in));
		 
		 String str = br.readLine();
		 int res = Integer.parseInt(str);
		 if(res >= 80) {
			 System.out.println("たいへんよくできました。");
		 }else if(res < 80 && res >= 60) {
			 System.out.println("よくできました。");
		 }else if(res < 60) {
			 System.out.println("ざんねんでした。");
		 }
			 
		 
	 }
 }
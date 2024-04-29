package java_if;
import java.io.*;
/**
 * 実力確認問題/03.if文 1 ケース2
 */
 public class If_3_1_2 {
	 /**
	  * 入力した値が80 点以上：「たいへんよくできました。」
　　　　　　*　　　　　　　　　60 点以上、80 点未満：「よくできました。」
	  *         60 点未満：「ざんねんでした。」を出力する。
	  * 
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
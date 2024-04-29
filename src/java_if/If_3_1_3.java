package java_if;
import java.io.*;
/**
 * 実力確認問題/03.if文 1 ケース3
 */
 public class If_3_1_3 {
	 /**
	  * 入力した値が80 点以上：「優」
　　　　　　*　　　　　　　　　70 点以上、80 点未満：「良」
	  * 　　　　　　　　60 点以上、70 点未満：「可」
	  * 　　　　　　　　60 点未満：「不可」を出力する
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
			 System.out.println("優");
		 }else if(res < 80 && res >= 70) {
			 System.out.println("良");
		 }else if(res < 70 && res >= 60) {
			 System.out.println("可");
		 }else if(res < 60) {
			 System.out.println("不可");
		 }
			 
		 
	 }
 }
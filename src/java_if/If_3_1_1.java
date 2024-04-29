package java_if;
import java.io.*;
/**
 * 実力確認問題/03.if文 1 ケース1
 */
 public class If_3_1_1 {
	 /**
	  * 入力した値が60 点以上：「合格」
　　　　　　*　　　　　　　　　60 点未満：「不合格」を出力する
	  * @param args 実行引数
	  */
	 public static void main(String[]args)throws IOException
	 {
		 System.out.println("点数を入力してください。");
		 
		 BufferedReader br =
		  new BufferedReader(new InputStreamReader(System.in));
		 
		 String str = br.readLine();
		 int res = Integer.parseInt(str);
		 if(res >= 60) {
			 System.out.println("合格");
		 }else if(res < 60) {
			 System.out.println("不合格");
		 }
			 
		 
	 }
 }
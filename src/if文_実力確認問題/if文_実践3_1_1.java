package if文_実力確認問題;
import java.io.*;
/**
 * HelloWorld クラス
 */
 public class if文_実践3_1_1 {
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
		 if(res >= 60) {
			 System.out.println("合格");
		 }else if(res < 60) {
			 System.out.println("不合格");
		 }
			 
		 
	 }
 }
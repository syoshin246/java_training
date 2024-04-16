package for文;
/**
 * HelloWorld クラス
 */
 public class for_9 {
	 /**
	  * main メソッド
	  * @param args 実行引数 
	  */
	 public static void main(String[]args) {
		 String[] s = {"2024/01/01", "2024/01/10", "2024/01/12"};
		 String[] s1 = {"マウス", "キーボード", "モニター"};
		 int[] s2 = {3000, 4000, 14000};
		 String[] s3 = {"2024/01/05", "", "2024/01/13"};
		 
		 for(int i = 0; i < 3; i++) {
			 if(s3[i] == "") {
				 s3[i] = "未納";				 
			 }
			 System.out.println(s[i] + ":" + s1[i] +  ":" + s2[i] +  ":" + s3[i]);	 
			  
		 }	 
	 }
}
	 

 



 
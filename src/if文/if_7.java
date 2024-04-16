package if文;

/**
 * HelloWorld クラス
 */
 public class if_7 {
	 /**
	  * main メソッド
	  * @param args 実行引数 
	  */
	 public static void main(String[]args) {
		 int x = 90;
		 int y = 20;

		 if(x >= 60 && y >= 60){
			 System.out.println("合格1");
		 }else if((x + y) >= 130){
			 System.out.println("合格2");
		 }else if((x + y) >= 100 && (x >= 90 || y >= 90)){
			 System.out.println("合格3");
		 }else {
			 System.out.println("不合格");
		 }
	 }
 }
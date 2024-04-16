package if文;

/**
 * HelloWorld クラス
 */
 public class if_8 {
	 /**
	  * main メソッド
	  * @param args 実行引数 
	  */

	 public static void main(String[]args) {
		 String x = "A";
		 String y = "sub";

		 if(y == "main") {
			 if(x == "A"){
				 System.out.println("A");
			 }else if(x == "A"){
				 System.out.println("B");
			 }else if(x == "B"){
				 System.out.println("O");
			 }else if(x == "AB"){
				 System.out.println("AB");
			 }
		 }else if(y == "sub") {
			 String x1 = "B";
			 switch(x1) {
			 case "Asub":
			 case "Bsub":
			 case "Osub":
			 case "AB":
				 break;
			 }
			 System.out.println(x1);
				 
		 } 
      
 

 
 }
 }
 
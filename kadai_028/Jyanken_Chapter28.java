package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {

	 private static final HashMap<String, String> handMap = new HashMap<String, String>();

	 static {
	        handMap.put("r", "グー");
	        handMap.put("s", "チョキ");
	        handMap.put("p", "パー");
	    }	
	
	public String getMyChoice(){
		
		Scanner scanner = new Scanner(System.in);
	
		while (true) {
			System.out.println("自分のじゃんけんの手を入力しましょう");
			System.out.println("グーはrockのrを入力しましょう");
			System.out.println("チョキはscissorsのsを入力しましょう");
			System.out.println("パーはpaperのpを入力しましょう");

			String input = scanner.next();

			if ((input.equals("r")) || (input.equals("s")) || (input.equals("p"))) {
				scanner.close();
				return input;

			} else {
				System.out.println("入力が正しくありません。再度入力してください");
				continue;
			}
		}
			

	}
	
	public String getRandom(){
		String[] challenger = { "r", "s", "p" };

		int c = (int) (Math.floor(Math.random() * 3));

		return challenger[c];

	}
	
	public void playGame(){
		
		String me = this.getMyChoice(); 
		String you = this.getRandom();
		
		 System.out.println("自分の手は" + handMap.get(me) + ",対戦相手は" + handMap.get(you));

		 //あいこPTN
		 if ( me.equals(you) ) {
		        System.out.println("あいこです");
		    }
		 //勝ちPTN
		 if ((me.equals("r") && you.equals("s")) || (me.equals("s") && you.equals("p"))
		            || (me.equals("p") && you.equals("r"))) {
		        System.out.println("自分の勝ちです");
		    }
		 //負けPTN　（それぞれのPTNを1つのif構文でまとめたい）
		 if ((me.equals("r") && you.equals("p")) || (me.equals("s") && you.equals("r"))
		            || (me.equals("p") && you.equals("s"))) {
		        System.out.println("自分の負けです");
		    }
	}

}

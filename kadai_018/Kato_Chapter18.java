package kadai_018;

public abstract class Kato_Chapter18 {
	//姓フィールド
	String familyName = "加藤";
	//名フィールド
	String givenName;
	//住所フィールド
	String address = "東京都中野区〇×";
	
	//出力メソッド
	public void commonIntroduce() {
		System.out.println("名前は"+familyName+givenName+"です");
		System.out.println("住所は"+address+"です");
	}
	public abstract void eachIntroduce();
	
	public abstract void setGivenName();
	
	
	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();
	}
}

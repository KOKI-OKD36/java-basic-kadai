package kadai_018;

public class KatoExec_Chapter18 {

	public static void main(String[] args) {
		
		//インスタンス
		KatoTaro_Chapter18 taro = new KatoTaro_Chapter18();
		KatoIchiro_Chapter18 ichiro = new KatoIchiro_Chapter18();
		KatoHanako_Chapter18 hanako = new KatoHanako_Chapter18();
		
		//名前
		taro.setGivenName();
		ichiro.setGivenName();
		hanako.setGivenName();
		
		//execintroduce
		taro.execIntroduce();
		ichiro.execIntroduce();
		hanako.execIntroduce();
		
	}

}

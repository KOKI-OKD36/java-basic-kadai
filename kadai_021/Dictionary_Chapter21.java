package kadai_021;
import java.util.HashMap;

public class Dictionary_Chapter21 {
    private HashMap<String, String> fruitMap; 

 
    public Dictionary_Chapter21() {
        fruitMap = new HashMap<String,String>();
        fruitMap.put("apple", "りんご");
        fruitMap.put("peach", "桃");
        fruitMap.put("banana", "バナナ");
        fruitMap.put("lemon", "レモン");
        fruitMap.put("pear", "梨");
        fruitMap.put("kiwi", "キウイ");
        fruitMap.put("strawberry", "いちご");
        fruitMap.put("grape", "ぶどう");
        fruitMap.put("muscat", "マスカット");
        fruitMap.put("cherry", "さくらんぼ");
    }

    // 検索メソッド
    public String searchWord(String word) {
        if (fruitMap.containsKey(word)) {
            return word + " の意味は " + fruitMap.get(word) + " です。";
        } else {
            return word + " は辞書に存在しません。";
        }
    }
}

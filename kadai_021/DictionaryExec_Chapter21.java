package kadai_021;

public class DictionaryExec_Chapter21 {
    public static void main(String[] args) {
    
        Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();

        // 調べる英単語
        String[] searchWords = {"apple", "banana", "grape", "orange"};

        // ループで検索
        for (String word : searchWords) {
            System.out.println(dictionary.searchWord(word));
        }
    }
}

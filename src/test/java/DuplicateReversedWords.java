import java.util.*;
public class DuplicateReversedWords {
    public static void main(String[] args) {
        String name = "Good Morning Good Evening";
        String[] words = name.split(" ");
        Map<String, Integer> mp =new HashMap<>();
        for(String word : words){
                mp.put(word, mp.getOrDefault(word,0)+1);
        }
        List<String> result = new ArrayList<>();
        for(String word : words){
            if(mp.get(word)==2){
                result.add(new StringBuilder(word).reverse().toString());
            }
            else
                result.add(word);
        }
        String finalResult = String.join(" ", result);
        System.out.println(finalResult);
    }


}

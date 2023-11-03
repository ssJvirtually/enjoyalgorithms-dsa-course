package exercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Anagrams {

    public static void main(String[] args) {

        String[] strs = {"ddddddddddg","dgggggggggg"};
        System.out.println(groupAnagrams(strs));
    }
    public static List<List<String>> groupAnagrams(String[] strs) {


        List<List<String>> resultList  = new ArrayList();


        Map<Character,Integer> map;

        for(int i=0;i<strs.length;i++){

            map = new HashMap();
            List<String> list = new ArrayList();

            //if it is already added to list in the earlier iteration and skip it
            if(strs[i] == null){
                continue;
            }

            //store frequency of chars in the map
            for(char ch : strs[i].toCharArray()){
                int freq = map.getOrDefault(ch,0);
                map.put(ch,freq+1);
            }
            //nested loop to compare all other strings in array
            for(int j=i+1;j<strs.length;j++){

                //if length does not match skip it
                if( strs[j] == null ||  strs[i].length() != strs[j].length()){
                    continue;
                }

                boolean anagram = true;
                Map<Character,Integer> tempMap = new HashMap<>(map);

                //if char not found break the loop and skip it
                for(char ch :strs[j].toCharArray() ){
                        if(tempMap.get(ch) != null && tempMap.get(ch) >0){
                            Integer tempFreq = tempMap.get(ch);
                            tempFreq = tempFreq- 1;
                            tempMap.put(ch,tempFreq);
                        }
                        else {
                            anagram = false;
                            break;
                        }

                }
                //if its anagram add to list and make the word null
                if(anagram){
                    list.add(strs[j]);
                    strs[j] = null;
                }
            }
            list.add(strs[i]);

            resultList.add(list);
        }
        return resultList;
    }
}

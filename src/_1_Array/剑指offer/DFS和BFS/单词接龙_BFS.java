package _1_Array.剑指offer.DFS和BFS;
import java.util.*;
public class 单词接龙_BFS {
    class Solution {
        public int ladderLength(String beginWord, String endWord, List<String> wordList) {
            Set<String> dict = new HashSet<>();
            for (String word : wordList) {    //将wordList中的单词加入dict
                dict.add(word);
            }


            Queue<String> queue = new LinkedList<>();
            Set<String> set = new HashSet<>();
            queue.add(beginWord);
            set.add(beginWord);
            int distance = 1;
            while (!queue.isEmpty()) {
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    String word = queue.poll();
                    for (String s : getNextWords(word, dict)) {
                        if(set.contains(s)){
                            continue;
                        }
                        if(s.equals(endWord)){
                            return distance + 1;
                        }
                        queue.add(s);
                        set.add(s);
                    }
                }
                distance++;
            }
            return 0;
        }

        private List<String> getNextWords(String word, Set<String> wordList) {
            char[] chars = word.toCharArray();
            char[] chars2 = word.toCharArray();
            List<String> list = new ArrayList<>();
            for (int i = 0; i < chars.length; i++) {
                for (char w = 'a'; w <= 'z'; w++) {
                    if (chars[i] == w) {
                        continue;
                    }
                    chars2[i] = w;
                    String nextWord = new String(chars2);
                    if(wordList.contains(nextWord)){
                        list.add(nextWord);
                    }
                    chars2[i] = chars[i];
                }
            }
            return list;
        }
    }
}

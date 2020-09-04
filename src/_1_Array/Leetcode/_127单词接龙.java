package _1_Array.Leetcode;

import java.util.*;

public class _127单词接龙 {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<String> queue=new LinkedList<>();

        queue.offer(beginWord);

        int count=0;
        boolean[] visted=new boolean[wordList.size()];

        while (!queue.isEmpty()){

            count++;
            int size=queue.size();
            for (int i=0;i<size;i++){
                String word1 = queue.poll();

                if (endWord.equals(word1)){
                    return count;
                }
                for (int j=0;j<wordList.size();j++){
                    if (visted[j]){
                        continue;
                    }
                    if (canConvert(word1,wordList.get(j))){
                        queue.offer(wordList.get(j));
                        visted[j]=true;
                    }


                }
            }
        }
        return 0;

    }
    public boolean canConvert(String word1,String word2){
        int length=word1.length();
        int count=0;
        for (int i=0;i<length;i++){
            if (word1.charAt(i)!=word2.charAt(i)){
                count++;
            }
            if (count>=2){
                return false;
            }
        }
        return count==1;

    }

    public static void main(String[] args) {
        String beginWord = "hit", endWord = "cog";
        List<String>wordList = new ArrayList<>();
        String[] st=new String[]{"hot","dot","dog","lot","log"};

        wordList.addAll(Arrays.asList(st));
//        new _127单词接龙.ladderLength(beginWord,endWord,wordList);

        System.out.println(new _127单词接龙().ladderLength(beginWord, endWord, wordList));

        System.out.println(wordList);
    }
}

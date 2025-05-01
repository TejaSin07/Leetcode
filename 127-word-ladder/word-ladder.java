class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> set = new HashSet<>(wordList);
        Queue<Pair<String,Integer>> que = new LinkedList<>();

        if(!set.contains(endWord))return 0;

        que.add(new Pair<>(beginWord,1));
        set.remove(beginWord);

        while(!que.isEmpty()){
            Pair<String,Integer> curr = que.poll();
            String word = curr.getKey();
            int steps = curr.getValue();
            if(word.equals(endWord))return steps;

            for(int i = 0;i< word.length();i++){
                char[] wordArr = word.toCharArray();
                  for(char ch = 'a' ; ch <= 'z' ; ch++){
                    wordArr[i] = ch;
                    String newWord = new String(wordArr);
                    if(set.contains(newWord)){
                        set.remove(newWord);
                        que.add(new Pair<>(newWord , steps+1));
                    }
                }
            }
        }
          return 0;
    }
}
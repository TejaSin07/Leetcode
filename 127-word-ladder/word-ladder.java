class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
       
        Set<String> set = new HashSet<>(wordList);
        Set<String> used = new HashSet<>();
        Queue<String> que = new LinkedList<>();

        if(!set.contains(endWord))return 0;
        que.add(beginWord);
        set.remove(beginWord);
        int level = 0;
        
        while(!que.isEmpty()){
            ++level;
            int size = que.size();
            for(int j = 0;j<size;j++){
                String curWord = que.poll();
                if(curWord.equals(endWord))return level;
                char charWord[] = curWord.toCharArray();
                for(int i = 0;i<curWord.length();i++){
                    char original = charWord[i];
                    for(char ch = 'a';ch<='z';ch++){
                        charWord[i] = ch;

                        String str = new String(charWord);
                        if(set.contains(str) ){
                            que.add(str);
                            set.remove(str);
                        }
                    }
                     charWord[i] = original;
                }

            }
        }
        return 0;
    }
}
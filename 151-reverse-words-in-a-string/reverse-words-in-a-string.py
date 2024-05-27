class Solution:
    def reverseWords(self, s: str) -> str:
        words = []
        slow,fast = 0,0
        mode = 'blank' if s[0] == ' ' else 'word'

        while fast < len(s):
            if mode == 'word' and s[fast] == ' ':
                words.append(s[slow:fast])
                slow = fast 
                mode = 'blank'

            elif mode == 'blank' and s[fast]  != ' ':
                slow = fast 
                mode = 'word'
            fast += 1
        if (lastWord := s[slow:fast]).strip():
            words.append(lastWord)
        
        return ' '.join(words[::-1])



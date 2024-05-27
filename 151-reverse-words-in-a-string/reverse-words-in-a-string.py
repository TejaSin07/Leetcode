class Solution:
    def reverseWords(self, s: str) -> str:
        words = []
        slow, fast = 0, 0
        
        # Use the first char to determine if we're starting on a " " or a word
        mode = 'blank' if s[0] == ' ' else 'word'
        
        while fast < len(s):
            # If we start on a word and our fast ptr lands on a white space
            # means that we have singled out a word
            if mode == 'word' and s[fast] == ' ':
                words.append(s[slow:fast])
                slow = fast # Make the slow ptr catch up
                mode = 'blank'
                
            # If we start on a white space and our fast ptr runs into a character
            # means we are at the start of a word   
            elif mode == 'blank' and s[fast] != ' ':
                slow = fast  # Make the slow ptr catch up
                mode = 'word'
        
            fast += 1  # Increment the fast pointer
        
        # Append the last word
        # Edge cases where the last chunk of string are white spaces
        if (lastWord := s[slow:fast]).strip():
            words.append(lastWord)
        
        return ' '.join(words[::-1])



# class Solution:
#     def reverseWords(self, s: str) -> str:
#         # Initialize an empty list to hold the words
#         res = []
#         # Temporary string to build each word
#         temp = ""
        
#         # Iterate through each character in the string
#         for c in s:
#             # If the character is not a space, add it to the current word
#             if c != " ":
#                 temp += c
#             # If the character is a space and temp is not empty, a word is complete
#             elif temp != "":
#                 # Add the completed word to the result list
#                 res.append(temp)
#                 # Reset temp for the next word
#                 temp = ""
        
#         # After the loop, if temp still has a word, add it to the result list
#         if temp != "":
#             res.append(temp)
        
#         # Reverse the list of words and join them with a space to form the final result
#         return " ".join(res[::-1])
class Solution:
    def reverseWords(self, s: str) -> str:
        fast, slow = 0,0
        words = []

        mode = 'blank' if s[0]==" " else 'word'

        while fast < len(s):
            for i in s:
                if mode =="word" and  s[fast]  == " ":
                    words.append(s[slow:fast])
                    slow =fast
                    mode = "blank"
                    
                elif mode =="blank" and s[fast] != " ":
                    slow = fast
                    mode = 'word'

                fast +=1
        if (lastWord := s[slow:fast]).isalnum():
            words.append(lastWord)
        
        return ' '.join(words[::-1])
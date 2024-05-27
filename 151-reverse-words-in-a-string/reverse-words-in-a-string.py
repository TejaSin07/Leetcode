class Solution:
    def reverseWords(self, s: str) -> str:
        # Initialize an empty list to hold the words
        res = []
        # Temporary string to build each word
        temp = ""
        
        # Iterate through each character in the string
        for c in s:
            # If the character is not a space, add it to the current word
            if c != " ":
                temp += c
            # If the character is a space and temp is not empty, a word is complete
            elif temp != "":
                # Add the completed word to the result list
                res.append(temp)
                # Reset temp for the next word
                temp = ""
        
        # After the loop, if temp still has a word, add it to the result list
        if temp != "":
            res.append(temp)
        
        # Reverse the list of words and join them with a space to form the final result
        return " ".join(res[::-1])

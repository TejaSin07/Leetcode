class Solution:

    def compress(self, chars: List[str]) -> int:
        res = []  # Initialize an empty list to store the compressed characters
        r = 0  # Initialize the index for iterating through the characters
        counter = 1  # Initialize a counter to count consecutive characters
        
        # Iterate through the characters starting from the second one
        for r in range(1, len(chars)):
            # If the current character is the same as the previous one
            if chars[r] == chars[r - 1]:
                counter += 1  # Increment the counter for consecutive characters
            else:
                res.append(chars[r - 1])  # Append the current character to the result list
                # If the count of consecutive characters is greater than 1
                if counter > 1:
                    # Convert the count to a string and add each digit separately to the result list
                    for digit in str(counter):
                        res.append(digit)
                counter = 1  # Reset the counter for the new character group
        
        # Append the last character to the result list
        res.append(chars[-1])
        # If the count of consecutive characters for the last group is greater than 1
        if counter > 1:
            # Convert the count to a string and add each digit separately to the result list
            for digit in str(counter):
                res.append(digit)
        
        # Update the original list with the compressed version
        chars[:len(res)] = res
        # Return the length of the compressed array
        return len(res)
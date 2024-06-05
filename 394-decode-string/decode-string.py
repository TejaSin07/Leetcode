class Solution:
    def decodeString(self, s: str) -> str:
        stack = []
        cur_num = 0
        cur_str = ''

        for c in s:
            if c == '[':
                stack.append(cur_num)
                stack.append(cur_str)
                #sequence
                cur_num = 0
                cur_str = ''
            elif c == ']':
                prev_str = stack.pop()
                num = stack.pop()
                cur_str = prev_str + cur_str*num
            elif c.isdigit():
                cur_num = cur_num*10 + int(c)
            else:
                cur_str += c
        return cur_str
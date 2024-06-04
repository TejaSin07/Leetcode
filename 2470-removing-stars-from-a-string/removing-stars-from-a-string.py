class Solution:
    def removeStars(self, s: str) -> str:
        s_list = list(s)
        ans = []
        for i in range(len(s_list)):
            if s_list[i]== "*":
                ans.pop()
            else:
                ans.append(s_list[i])
        return "".join(ans)
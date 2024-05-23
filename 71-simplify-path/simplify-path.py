class Solution:
    def simplifyPath(self, path: str) -> str:
        sol = []
        path = path.split("/")
        for i in path:
            if sol  and i == "..":
                sol.pop()
            elif i not in ["","..","."]:
                sol.append(i)

        return "/"+"/".join(sol)

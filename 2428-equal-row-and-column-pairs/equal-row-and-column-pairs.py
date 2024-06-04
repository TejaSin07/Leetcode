class Solution:

    def equalPairs(self, grid: List[List[int]]) -> int:
        colm = []
        res = 0
        for i in range(len(grid)):
            col_list = []
            for j in range(len(grid[i])):
                col_list.append(grid[j][i])
            colm.append(col_list)
        for element in grid:
            for ment in colm:
                if element == ment:
                    res +=1
        return res
            
        
          

        
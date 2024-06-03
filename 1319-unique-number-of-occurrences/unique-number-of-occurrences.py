class Solution:
    def uniqueOccurrences(self, arr: List[int]) -> bool:
        dic = {}

        for i in arr:
            if i in dic:
                dic[i] +=1
            else:
                dic[i] = 1
        occurrence = set(dic.values())
        if len(occurrence) == len(dic):
            return True
        else:
            False 

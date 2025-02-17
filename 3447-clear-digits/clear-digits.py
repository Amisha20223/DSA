class Solution:
    def clearDigits(self, s):
        res = ""
        for c in s:
            if c.isdigit():
                if res:
                    res = res[:-1] 
            else:
                res += c
        return res
        
class Solution(object):
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """
        # converting string to list
        stk = []

        for ele in s:
            if ele == '{' or ele == '[' or ele == '(':
                stk.append(ele)
            else:
                if len(stk) == 0:
                    return False
                elif ele == ')' and stk[-1] == '(':
                    stk.pop()
                elif ele == ']' and stk[-1] == '[':
                    stk.pop()
                elif ele == '}' and stk[-1] == '{':
                    stk.pop()
                else:
                    return False
            
        if len(stk) == 0:
            return True
        else: 
            return False
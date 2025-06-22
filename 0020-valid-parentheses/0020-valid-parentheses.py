class Solution(object):
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """
        # converting string to list
        stk = []
        if len(s) == 1:
            return False
        for ele in s:
            if ele == '}' or ele == ')' or ele == ']':
                if len(stk) == 0:
                    return False
            if ele == '{' or ele == '(' or ele == '[':
                stk.append(ele)
            elif ele == '}' and stk[-1] == '{':
                stk.pop()
            elif ele == ')' and stk[-1] == '(':
                stk.pop()
            elif ele == ']' and stk[-1] == '[':
                stk.pop()
            else:
                return False
        if len(stk) == 0:
            return True
        else:
            return False

class MyQueue(object):

    def __init__(self):
        self.s1 = []
        self.s2 = []

    def push(self, x):
        """
        :type x: int
        :rtype: None
        """
        s = len(self.s1)
        if len(self.s1) == 0:
            self.s1.append(x)
        elif not len(self.s1) == 0 and len(self.s2) == 0:
            while not len(self.s1) == 0:
                temp  = self.s1.pop()
                self.s2.append(temp)
            self.s1.append(x)

            while not len(self.s2) == 0:
                temp = self.s2.pop()
                self.s1.append(temp)

    def pop(self):
        """
        :rtype: int
        """
        return self.s1.pop()

    def peek(self):
        """
        :rtype: int
        """
        return self.s1[-1]

    def empty(self):
        """
        :rtype: bool
        """
        if len(self.s1) == 0:
            return True
        else:
            return False


# Your MyQueue object will be instantiated and called as such:
# obj = MyQueue()
# obj.push(x)
# param_2 = obj.pop()
# param_3 = obj.peek()
# param_4 = obj.empty()
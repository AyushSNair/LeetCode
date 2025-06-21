from Queue import Queue

class MyStack(object):

    def __init__(self):
        self.q1 = Queue()
        self.q2 = Queue()

    def push(self, x):
        """
        :type x: int
        :rtype: None
        """
        s = self.q1.qsize()
        if self.q1.empty():
            self.q1.put(x)
        
        elif not self.q1.empty() and self.q2.empty():
            while not self.q1.empty():
                temp = self.q1.get()
                self.q2.put(temp)
            
            self.q1.put(x)

            while not self.q2.empty():
                temp = self.q2.get()
                self.q1.put(temp)
        
        

    def pop(self):
        """
        :rtype: int
        """
        return self.q1.get()

    def top(self):
        """
        :rtype: int
        """
        return self.q1.queue[0]

    def empty(self):
        """
        :rtype: bool
        """
        if self.q1.empty():
            return True
        else:
            return False
        


# Your MyStack object will be instantiated and called as such:
# obj = MyStack()
# obj.push(x)
# param_2 = obj.pop()
# param_3 = obj.top()
# param_4 = obj.empty()
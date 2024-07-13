import random
class RandomizedSet:

    def __init__(self):
        self.seen=set()
        self.arr=[]
        

    def insert(self, val: int) -> bool:
        if val not in self.seen:
            self.seen.add(val)
            self.arr.append(val)
            return True
        return False
        

    def remove(self, val: int) -> bool:
        if val in self.seen:
            self.seen.remove(val)
            return True
        return False
        

    def getRandom(self) -> int:
        while True:
            N=len(self.arr)
            r=random.randint(0,N-1)
            if self.arr[r] in self.seen:
                return self.arr[r]
            self.arr[r]=self.arr[-1]
            self.arr.pop()
        


# Your RandomizedSet object will be instantiated and called as such:
# obj = RandomizedSet()
# param_1 = obj.insert(val)
# param_2 = obj.remove(val)
# param_3 = obj.getRandom()
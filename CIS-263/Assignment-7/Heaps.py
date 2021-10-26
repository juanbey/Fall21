class MinHeap:
    def __init__(self, min = 0):
        self.min = min
        self.size = 0
        self.heap = []
        

    def parent(self, ind):
        return (ind // 2)

    def left(self, ind):
        return (2 * ind)

    def right(self, ind):
        return (2 * ind) + 1
    def decreasekey(self, index, value):
        if value < self.heap[index]:      
            raise Exception(f"{value} is larger than {self.heap[index]}")
        self.heap[index] = value
        while index > 1 and self.heap[self.parent(index)]:
            self.heap[index], self.heap[self.parent(index)] = self.heap[self.parent(index)], self.heap[index]
            index = self.parent(index)  
    def heapinsert(self, value):
        if value < self.min:
            print(f"Value must be less than {self.min} entered: {value}")
            return
        self.size += 1
        current = self.size
        
        self.heap[current] = value
        self.decreasekey(current, value)





#TODO--------------------------------------------------
    def buildMinheap(self, array):
        size = len(array) // 2
        self.heap = [0] + array[:]
        for i in range(size, 0 ,-1):
            pass
        pass
    def heapsort(self, A):
        pass
    def heapmin(self, A):
        pass
    def extractmin(self):
        pass
    def minHeapify(self, index):
        self.l = self.left(index)
        self.r = self.right(index)
        if self.l <= self.heap[self.size] and self.left(index) < self.heap[index]: 
            smallest = self.l
        else:
            smallest = index
            pass
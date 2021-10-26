
class MinHeap:
    def __init__(self, max = 50):
        self.max = max
        self.size = 0
        self.heap = []
        

    def parent(self, ind):
        return (ind // 2)

    def left(self, ind):
        return (2 * ind)

    def right(self, ind):
        return (2 * ind) + 1
    def minHeapify(self, index):
        self.l = self.left(index)
        self.r = self.right(index)
        if self.l <= self.heap[self.size] and self.left(index) < self.heap[index]: 
            smallest = self.l
        else:
            smallest = index
            pass


    def buildMinheap(self, array):
        size = len(array) // 2
        self.heap = [0] + array[:]
        for i in range(size, 0 ,-1):

        pass
    def heapsort(self, A):
        pass
    def heapmin(self, A):
        pass
    def heapExtractmin(self):
        pass
    def heapDecreasekey(self, i, key):
        pass
    def minHeapinsert(self, value):
        if self.size >= self.max:
            return
        self.size += 1
        self.heap[self.size] = value

        while self.heap:
            
        pass

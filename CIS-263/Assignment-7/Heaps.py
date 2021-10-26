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
        pass
    def heapsort(self, A):
        pass
    def heapmin(self, A):
        pass
    def heapExtractmin(self):
        pass
    def heapDecreasekey(self, index, key):
        if key < self.heap[index]:      
            raise Exception(f"{key} is larger than {self.heap[index]}")
        self.heap[index] = key
        while index > 1 and self.heap[self.parent(index)]
        pass
    def minHeapinsert(self, value):
        if value < self.min:
            print(f"Value must be less than {self.min} entered: {value}")
            return
        self.size += 1
        current = self.size
        
        self.heap[current]= value

        while self.heap[current] < self.heap[self.parent[current]]:
            pass
        pass

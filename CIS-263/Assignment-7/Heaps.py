
class MinHeap:
    def __init__(self, max = 50):
        self.max = max
        self.size = 0
        self.Heap = [0]
        self.Heap = [0]

        pass


    def parent(self, index):
        return (index // 2)

    def left(self, index):
        return (2 * index)

    def right(self, index):
        return (2 * index) + 1




    def minHeapify(self, index):
        self.l = left(index)
        self.r = right(index)
        if self.l <= len(array) and array[self.l] < array[index]: 
            smallest = self.l
        else:
            smallest = index
            pass


    def buildMinheap(self, array):
        size = len(array) // 2
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
    def minHeapinsert(self, key):
        pass

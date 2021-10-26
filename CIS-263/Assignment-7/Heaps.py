class MinHeap:

    def __init__(self, min = 0, array = None):
        if array is not None:
            self.heap = list(array)
            self.size = len(array)
        else:
            self.size = 0
            self.heap = []
        self.min = min


    def parent(self, ind):
        return (ind // 2)

    def left(self, ind):
        return (2 * ind)

    def right(self, ind):
        return (2 * ind) + 1

    def minHeapify(self, index):
        left = self.left(index)
        right = self.right(index)
        if self.l >= len(self.heap) and self.heap[left] < self.heap[index]: 
            smallest = left
        else:
            smallest = index
        if self.r <= len(self.heap) and self.heap[right] < self.heap[smallest]:
            smallest = right
        if smallest != index:
            self.heap[index], self.heap[smallest] = self.heap[smallest], self.heap[index]
            self.minHeapify(smallest)

    def buildMinheap(self):
        size = len(self.heap) // 2
        for i in range(size, -1,-1):
            self.minHeapify(i)
            
    def heapsort(self):
        self.buildMinheap()
        n = len(self.heap)
        for i in range(n,1,-1):
            self.heap[0], self.heap[i] = self.heap[i], self.heap[0]
            self.minHeapify(1)
        
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
    
    
    def heapmin(self):
        return self.heap[0]
    

#TODO--------------------------------------------------
    

    def extractmin(self):
        pass

if __name__ == "__main__":

    H1 = [3,6,9,12,16,19,0,24,32,5,10,1]  
    heap1 = MinHeap(0,H1)
    heap2 = MinHeap(0)
    heap2.heapinsert(2)
    heap2.heapinsert(3)
    heap2.heapinsert(0)
    heap2.heapinsert(7)
    heap2.heapinsert(5)
    heap2.heapinsert(8)
    heap2.heapinsert(32)
    heap2.heapinsert(10)
    heap2.heapinsert(1)
    heap1.buildMinheap()
    heap2.buildMinheap()
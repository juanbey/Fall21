class Node:

    def __init__(self, child, leaf=False ):
        self.child = []
        self.leaf = leaf
        self.key = []


class BTree:

    def __init__(self, t):
        super.root = Node(True)
        self.t = t

    def __create__(self):

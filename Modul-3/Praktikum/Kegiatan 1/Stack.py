class Stack:
    def __init__(self):
        self.items = []

    def push(self, item):
        self.items.append(item)

    def pop(self):
        return self.items.pop()

    def peek(self):
        chrToStr = ""

        i = len(self.items)

        while i > 0:
            chrToStr += self.items[i-1]
            i -= 1

        print(chrToStr)

    def is_empty(self):
        return len(self.items) == 0

    def size(self):
        return len(self.items)


stack = Stack()


string = input("Your String : ")

for char in string:
    stack.push(char)

stack.peek()

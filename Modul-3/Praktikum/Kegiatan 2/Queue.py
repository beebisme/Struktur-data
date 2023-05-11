class Queue:
    def __init__(self):
        self.items = []

    def isEmpty(self):
        return self.items == []

    def enqueue(self, item):
        self.items.append(item)

    def dequeue(self):
        if self.isEmpty():
            return "No items"
        return self.items.pop(0)

    def peek(self):
        if self.isEmpty():
            print("not found")
        return self.items[0]

    def size(self):
        return len(self.items)


shoes = ["Patrobas Ivan", "Ventela Public", "Compas Gazelle"]


custList = Queue()
items = Queue()


def main():
    while True:
        print("\n1. Tambah pesanan")
        print("2. Checkout")
        print("3. Cek antrian")
        print("4. Hapus antrian pertama")
        print("Masukkan pilihan anda")
        userinput = input()

        if userinput == "1":
            print("\n")
            i = 0

            while len(shoes) != i:
                print(str(i+1) + ". " + shoes[i])
                i += 1

            print("pilih pesanan")
            chooseItem = input()
            print("Masukkan nama anda")
            custName = input()
            custList.enqueue(custName)

            if chooseItem == "1":
                items.enqueue(shoes[0])
                print("Pesanan telah ditambahkan")
                main()
            elif chooseItem == "2":
                items.enqueue(shoes[1])
                print("Pesanan telah ditambahkan")
                main()
            elif chooseItem == "3":
                items.enqueue(shoes[2])
                print("Pesanan telah ditambahkan")
                main()

        elif userinput == "2":
            print("\nnama : " + custList.peek())
            print("barang : " + items.peek())
            print("Berhasil checkout....")
            main()
        elif userinput == "3":
            print("jumlah antrian saat ini : " + str(custList.size()))
            print("antrian paling depan")
            print("nama : " + custList.peek())
            print("pesanan : " + items.peek())
        elif userinput == "4":
            custList.dequeue()
            items.dequeue()
            print("berhasil menghapus antrian")
            main()


main()

class Mahasiswa {
    String nama;
    String nim;
    String jurusan;

    public Mahasiswa(String nama, String nim, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }
}

class TreeNode {
    Mahasiswa data;
    TreeNode left;
    TreeNode right;

    public TreeNode(Mahasiswa data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class BT {
    TreeNode root;

    public BT() {
        root = null;
    }

    public void insert(Mahasiswa data) {
        root = insertNode(root, data);
    }

    private TreeNode insertNode(TreeNode root, Mahasiswa data) {
        if (root == null) {
            root = new TreeNode(data);
            return root;
        }

        if (data.nim.compareTo(root.data.nim) < 0) {
            root.left = insertNode(root.left, data);
        } else if (data.nim.compareTo(root.data.nim) > 0) {
            root.right = insertNode(root.right, data);
        }

        return root;
    }

    public void inorderTraversal() {
        inorder(root);
    }

    private void inorder(TreeNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.println("Nama: " + root.data.nama);
            System.out.println("NIM: " + root.data.nim);
            System.out.println("Jurusan: " + root.data.jurusan);
            System.out.println();
            inorder(root.right);
        }
    }

    public void preorderTraversal() {
        preorder(root);
    }

    private void preorder(TreeNode root) {
        if (root != null) {
            System.out.println("Nama: " + root.data.nama);
            System.out.println("NIM: " + root.data.nim);
            System.out.println("Jurusan: " + root.data.jurusan);
            System.out.println();
            preorder(root.left);
            preorder(root.right);
        }
    }

    public void postorderTraversal() {
        postorder(root);
    }

    private void postorder(TreeNode root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.println("Nama: " + root.data.nama);
            System.out.println("NIM: " + root.data.nim);
            System.out.println("Jurusan: " + root.data.jurusan);
            System.out.println();
        }
    }
}

public class Driver {
    public static void main(String[] args) {
        BT tree = new BT();

        // Menambahkan data mahasiswa ke dalam binary tree
        Mahasiswa m1 = new Mahasiswa("Budi", "301", "Informatika");
        Mahasiswa m2 = new Mahasiswa("Andi", "302", "Sistem Informasi");
        Mahasiswa m3 = new Mahasiswa("Tono", "303", "Komputerisasi Akuntansi");

        tree.insert(m2);
        tree.insert(m1);
        tree.insert(m3);

        // Menampilkan data mahasiswa dengan traversal in-order
        System.out.println("In-order Traversal:");
        tree.inorderTraversal();
        System.out.println();

        // Menampilkan data mahasiswa dengan traversal pre-order
        System.out.println("Pre-order Traversal:");
        tree.preorderTraversal();
        System.out.println();

        // Menampilkan data mahasiswa dengan traversal post-order
        System.out.println("Post-order Traversal:");
        tree.postorderTraversal();
    }
}

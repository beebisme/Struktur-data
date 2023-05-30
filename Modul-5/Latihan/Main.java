public class Main {
    public static void main(String[] args) {
        BinaryTree algoTree = new BinaryTree();

        algoTree.NewNode(20);
        algoTree.NewNode(2);
        algoTree.NewNode(25);
        algoTree.NewNode(37);
        algoTree.NewNode(16);

        System.out.print("Pre Order : ");
        algoTree.preOrder(algoTree.root);
        System.out.print("\nIn Order : ");
        algoTree.inOrder(algoTree.root);
        System.out.print("\nPost Order: ");
        algoTree.postOrder(algoTree.root);
    }

}

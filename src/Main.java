public class Main {
    public static void main(String[] args) {
        final RedBlackTree tree = new RedBlackTree();
        try {

            tree.add(45);
            tree.add(84);
            tree.add(23);
            tree.add(6);
            tree.add(25);
            tree.add(56);
            tree.add(17);

        } catch (Exception ignored) {
        }
        tree.prettyPrint();   // вывод дерева в консоль



    }
}
/**
 * This is a utility class that serves as a placeholder for the main method.
 * @author Tony Tran
 * @version 1.0
 * @since 2025-05-06
 */
final class Main {
    /**
     * This is a private constructor to satisfy style checker.
     * @exception IllegalStateException Utility class.
     * @see IllegalStateException
     */
    private Main() {
        throw new IllegalStateException("Utility class");
    }
    /**
     * The main method that serves as the entry point for the program.
     * @param args Command line arguments.
     */
    public static void main(final String[] args) {
        Tree tree = new Tree(10, 100);
        System.out.println("Tree Height: " + tree.getHeight());
        System.out.println("Number of Leaves: " + tree.getLeaves());
        System.out.println("Growing Tree...");
        tree.growTree(5, 50);
        System.out.println("New Height: " + tree.getHeight());
        System.out.println("New Number of Leaves: " + tree.getLeaves());
        System.out.println("Losing all leaves...");
        tree.loseAllLeaves();
        System.out.println("New Number of Leaves: " + tree.getLeaves());
    }
}

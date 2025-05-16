/**
 * This class represents a tree structure.
 *
 * @author Tony Tran
 * @version 1.0
 * @since 2025-05-06
 */
public class Tree {
    /** The height of the tree in feet.*/
    private int feetTall;
    /**Number of Leaves. */
    private int numberOfLeaves;
    /**
     * Constructor for the Tree class.
     *
     * @param heightOfTree The height of the tree in feet.
     * @param numberLeaves The number of leaves on the tree.
     */
    public Tree(final int heightOfTree, final int numberLeaves) {
        this.feetTall = heightOfTree;
        this.numberOfLeaves = numberLeaves;
    }
    /**
     * Gets the height of the tree.
     *
     * @return The height of the tree.
     */
    public int getHeight() {
        return this.feetTall;
    }
    /**
     * Gets the number of leaves on the tree.
     *
     * @return The number of leaves on the tree.
     */
    public int getLeaves() {
        return this.numberOfLeaves;
    }
    /**
     * Grows the tree by a specified height.
     *
     * @param heightOfTree The height to grow the tree.
     * @return The new height of the tree.
     */
    public int growTree(final int heightOfTree) {
        this.feetTall += heightOfTree;
        return this.feetTall;
    }
    /**
     * Grows the tree by a specified number of leaves.
     * @return The new number of leaves on the tree.
     */
    public int loseAllLeaves() {
        this.numberOfLeaves = 0;
        return this.numberOfLeaves;
    }
    /**
     * Grows the tree by a specified height and number of leaves.
     * @param heightOfTree The height to grow the tree.
     * @param numberLeaves The number of leaves to add to the tree.
     * @return The new height of the tree.
     */
    public int growTree(final int heightOfTree, final int numberLeaves) {
        this.numberOfLeaves += numberLeaves;
        this.feetTall += heightOfTree;
        return this.feetTall & this.numberOfLeaves;
    }
}

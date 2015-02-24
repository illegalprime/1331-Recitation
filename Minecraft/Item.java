public abstract class Item {

    private String name;
    private static final int MAX_STACK;
    private int stackSize;

    public Item(String name, int stackSize) {
        this.name = name;
        this.stackSize = stackSize;
    }

    public abstract int getStackSize();

    public abstract String getName();
}

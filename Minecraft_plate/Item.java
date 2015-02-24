public abstract class Item {

    private String name;
    private static int MAX_STACK = 20;
    private int stackSize;

    public Item(String name, int stackSize) {
        this.name = name;
        this.stackSize = stackSize;
    }

    public int getStackSize();

    public String getName();
}

public abstract class Block {

    private String name;
    private int weight;
    private int hardness;

    public Block(String name, int weight, int hardness) {
        /*
        What should go here?
        */
    }

    /*
    What other methods does a block have?
    */

    public Item[] dropItems();

    public String getName();

    public int getWeight();
}

package app.memory;

import java.util.ArrayList;

public class MemoryBlock {
    private static MemoryBlock calculations = new MemoryBlock();
    private ArrayList<String> memory;

    public static MemoryBlock getCalculations() {
        return calculations;
    }

    public MemoryBlock() {
        memory = new ArrayList<>();
    }

    public void addCalculation (String example) {
        memory.add(example);
    }

    public ArrayList<String> list() {
        return memory;
    }
}

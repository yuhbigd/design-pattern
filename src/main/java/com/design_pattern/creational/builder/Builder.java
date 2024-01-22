package com.design_pattern.creational.builder;

class Computer {
    @Override
    public String toString() {
        return "Computer [cpu=" + cpu + ", memory=" + memory + ", storage=" + storage
                + ", graphicsCard=" + graphicsCard + "]";
    }

    private String cpu;
    private String memory;
    private String storage;
    private String graphicsCard;

    // Private constructor to enforce the use of the builder
    private Computer() {}

    // Getter methods for components

    public String getCpu() {
        return cpu;
    }

    public String getMemory() {
        return memory;
    }

    public String getStorage() {
        return storage;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public static ComputerBuilder builder() {
        return new ComputerBuilder();
    }

    // Builder class
    public static class ComputerBuilder {
        private Computer computer;

        public ComputerBuilder() {
            this.computer = new Computer();
        }

        public ComputerBuilder setCpu(String cpu) {
            computer.cpu = cpu;
            return this;
        }

        public ComputerBuilder setMemory(String memory) {
            computer.memory = memory;
            return this;
        }

        public ComputerBuilder setStorage(String storage) {
            computer.storage = storage;
            return this;
        }

        public ComputerBuilder setGraphicsCard(String graphicsCard) {
            computer.graphicsCard = graphicsCard;
            return this;
        }

        // Build method to return the constructed computer
        public Computer build() {
            return computer;
        }
    }
}


// Client code
public class Builder {
    public static void main(String[] args) {
        // Using the builder to create a Computer instance with specific components
        Computer computer = Computer.builder().setCpu("Intel i7").setMemory("16GB RAM")
                .setStorage("512GB SSD").setGraphicsCard("NVIDIA GeForce RTX 3070").build();
        System.out.println(computer);
    }
}

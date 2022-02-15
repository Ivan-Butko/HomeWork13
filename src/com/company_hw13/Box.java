package com.company_hw13;

public class Box {
    private int length;
    private int width;
    private int height;
    private int volume;

    private Material material;

    public Box() {
    }

    public Box(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Box(int length, int width, int height, Material material) {
        this(length, width, height);
        this.material = material;
    }

    public void setLength(int length) {
        if (length > 0) {
            this.length = length;
        } else messageIncorrectExit();
    }

    public int getLength() {
        return length;
    }

    public void setWidth(int width) {
        if (width > 0) {
            this.width = width;
        } else messageIncorrectExit();
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int height) {
        if (height > 0) {
            this.height = height;
        } else messageIncorrectExit();
    }

    public int getHeight() {
        return height;
    }

    public void setMaterial(Material material) {
        if (!material.equals("")) {
            this.material = material;
        } else messageIncorrectExit();
    }

    public Material getMaterial() {
        return material;
    }

    public double getVolume() {
        return volume = length * width * height;
    }

    private void messageIncorrectExit() {
        System.out.println("Incorrect data entered.");
        System.exit(0);
    }

    @Override
    public String toString() {
        return "length = " + length +
                " cm   width = " + width +
                " cm   height = " + height +
                " cm   volume = " + volume +
                " cbcm   material = " + material.getMaterialName();
    }
}

package com.company_hw13;

public class ColorBox extends Box {
    private Color color;

    public ColorBox() {
    }

    public ColorBox (Color color) {
        this.color = color;
    }

    public ColorBox(int length, int width, int height, Material material, Color color) {
        super(length, width, height, material);
        this.color = color;
    }

    public void setColorBox(Color color) {
        if (!color.equals(null)) {
            this.color = color;
        } else messageIncorrectExit();
    }

    public Color getColorBox() {
        return color;
    }

    @Override
    public String toString() {
        return super.toString() +
                " color = " + color.getColorName();
    }

    private void messageIncorrectExit() {
        System.out.println("Incorrect data entered.");
        System.exit(0);
    }
}

package ie.tudublin;

import processing.core.PApplet;

public class Colour extends PApplet{
    
    private String colour;

    public int r;
    public int g;
    public int b;
    public int value;

    public Colour(){
        
    }

    public String toString()
    {
        return getColour() + " " + r + " " + g + " " + b + " " + value;
    }

    /**
     * @return the colour
     */
    public String getColour() {
        return colour;
    }

    /**
     * @param colour the colour to set
     */
    public void setColour(String colour) {
        this.colour = colour;
    }

}
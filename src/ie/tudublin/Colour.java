package ie.tudublin;

import processing.core.PApplet;
import processing.data.TableRow;

public class Colour extends PApplet{
    
    private String colour;

    public int r;
    public int g;
    public int b;
    public int value;

    public Colour(TableRow row){
        
        setColour( row.getString("colour") );

        r = row.getInt("r");
        g = row.getInt("g");
        b = row.getInt("b");
        value = row.getInt("value");  
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
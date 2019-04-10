package ie.tudublin;

import processing.data.TableRow;

public class Resistor
{
    public int value;
    public int ones;
    public int tens;
    public int hundreds;


    public Resistor(int value)
    {
        this.value = value;
        hundreds = (value / 100);
		tens = (value - (hundreds * 100)) / 10;
        ones = value - ((hundreds * 100)  + (tens * 10));
    }

    public Resistor(TableRow row)
    {
        //Couldn't get working
        ///this.value = row.getInt();
    }

    public String toString()
    {
        return  hundreds + "," + tens + "," + ones;
    }

}
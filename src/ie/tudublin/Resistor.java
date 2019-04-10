package ie.tudublin;

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

    public String toString()
    {
        return  hundreds + "," + tens + "," + ones;
    }
}
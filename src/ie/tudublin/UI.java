//OOP Year 2 Sem 2 Lab Test
//Student Name: Conor Rogers
//Student Number: C17730535
//Date: 10/4/2019

package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class UI extends PApplet
{	
	public ArrayList<Colour> colours = new ArrayList<Colour>();

	Resistor r = new Resistor(123);

	public void loadColours()
    {
        Table table = loadTable("colours.csv", "header");
        for(TableRow row : table.rows())
        {
            Colour c = new Colour(row);
            colours.add(c);
        }        
	}
	
	public void printColours()
	{
		for(Colour c: colours)
		{
			println(c.toString());
		}
	}

	public Colour findColor(int value)
	{
		int index=0;

		for(int i = 0; i < colours.size(); i++)
		{
			Colour c = colours.get(i);

			if( c.value == value )
			{

				index = i;
			}
		}

		return colours.get(index);
	}

	public void separate(int value)
	{
		int hundreds = (value / 100);
		int tens = (value - (hundreds * 100)) / 10;
		int ones = value - ((hundreds * 100)  + (tens * 10));
		print(hundreds + ",");
		print(tens + ",");
		println(ones);
	}

	public void settings()
	{
		size(500, 800);
		
		separate(381);
		separate(1);
		separate(92);
	}

	public void setup() 
	{
		loadColours();
		printColours();

		println( findColor(1) ); //Returns brown
		println(r.toString()); //Splits 123 into 1 2 3
	}
	
	public void draw()
	{		
		
	}
}

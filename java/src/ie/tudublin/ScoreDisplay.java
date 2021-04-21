package ie.tudublin;


import java.util.ArrayList;

import processing.core.PApplet;


public class ScoreDisplay extends PApplet
{
	ArrayList<Note> notes = new ArrayList<Note>();


	

	void loadScore()
	{
	for(int i =0; i<8;i++)
	{
		
	}
	}

	// method to draw the 5 horizontal lines
	void drawGrid()
    {
        float border = 0.1f * width;
        for(int i = 0 ; i <=5 ; i ++)
        {
            float x = map(i, 0, 5, border, width - border);
            float y = map(i, 0, 5, border, height - border);
            stroke(0, 0, 0);
            line(border, y, width - border, y);

        }
    }

	String score = "DEFGABcd";
	//String score = "D2E2F2G2A2B2c2d2";
	//String score = "DEF2F2F2EFA2A2B2AFD2E2D2D2D2";
	
	public void settings()
	{
		size(1000, 500);

		// How to convert a character to a number
		char c = '7'; // c holds the character 7 (55)
		int i = c - '0'; // i holds the number 7 (55 - 48) 
		println(i);
	}

	public void setup() 
	{
		loadScore();

	}

	public void draw()
	{
		background(255);
		drawGrid();
		
	}

	void drawNotes()
	{

	
	}


}

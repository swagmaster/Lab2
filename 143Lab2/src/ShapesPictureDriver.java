/**
 * Driver for CSS 162 Lab
 * 
 * uncomment sections to test Square, Circle, and Picture
 * 
 * @author Rob Nash
 */


public class ShapesPictureDriver {

	
	//precondition: assumes {Square, Circle, Picture} all exist in the same working directory
	//postcondition: 2 Squares, 2 Circles, and 1 Picture are constructed and manipulated, then reclaimed once main exits
	public static void main(String[] args) {
		 
		Square firstSquare = new Square();
		Square secondSquare = new Square(10,20);
		
		firstSquare.setX(3);
		firstSquare.setY(4);
		
		System.out.println( "Drawing the first square : " + firstSquare.toString());
		
		firstSquare.draw();
		
		secondSquare.setX(30);
		secondSquare.setY(30);
		
		System.out.println( "Drawing the next square with area : " + secondSquare.getArea());
		
		secondSquare.draw();
		
		
	
		//now for some circles
		Circle firstCircle = new Circle();
		Circle secondCircle = new Circle(5,5);
		
		firstCircle.setX(1);
		firstCircle.setY(5);
		firstCircle.setRadius(3);
		
		System.out.println( "Drawing the first circle : " + firstCircle.toString());
		
		firstCircle.draw();
		
		secondCircle.setX(2);
		secondCircle.setY(10);
		secondCircle.setRadius(6);
		
		System.out.println( "Drawing the second circle with area " + secondCircle.getArea());
		
		secondCircle.draw();
		
		
		//now, lets see the bigger picture
		Picture picture = new Picture();
		
		/* Unsure on how these methods are supposed to work.
		picture.addSquare( firstSquare );
		picture.addSquare( secondSquare );
		picture.addCircle( firstCircle );
		picture.addCircle( secondCircle );
		*/
		System.out.println( "Drawing a Picture with Circles and Squares:\n" );
		
		System.out.println(picture.toString());

		
	}

}

/*
 * 1. I think copying and pasting saves a lot of time for coders. 
 * 	  The problem with this is that there is more likeliness for
 * 	  small errors in names/syntax.
 * 2. They share very similar data types and characteristics to the point where
 * 	  they can be combined almost into shorter code.	
 * 3. I had to look up the override methods to get a refresher on how they work.
 * 4. Using different listOfObjectsays would cause more disorganization in adding shapes
 *    to the listOfObjectsay.It would also use more memory if it is making a new shape rather than
 *    adding to the listOfObjectsaylist.
 */









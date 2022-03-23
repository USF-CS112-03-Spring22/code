public abstract class AlienZ implements Moveable {
 	private double x, y, z; 

	public AlienZ() {
   		this.x = 0;
   		this.y = 0;
         this.z = 0;
   	}

   // Does not provide the implementation of the move() method, but it's declared as abstract,
   // so can't be instantiated

   public String toString() {
   		return x + " " + y + " " + z;
   }
}




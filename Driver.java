//Author:Maria Binti Abu Hussin
public class Driver {
	public static void main (String [] arg){
		//Fish actually is a data type
		//Fish nemo; == int x;
		//nemo adalah object, Fish adalah kelas
		Fish nemo = new Fish(); 
		nemo.Swim();
		nemo.color="red"; //tukar value
		nemo.Swim();

		Fish dory = new Fish(); 
		dory.Swim();
		nemo.color="yellow"; //tukar value
		nemo.Swim();
		
	}
}
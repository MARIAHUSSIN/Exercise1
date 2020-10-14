//Author:Maria Binti Abu Hussin
public class Fish {
	//Atribute or data member or fields
	private String color = "blue";  //default value

	//Method
	public void Swim(){
		System.out.println(color+" fish swim");
	}

	//Setter/Mutator method
	public void SetColor(String warna) {
		color=warna;
	}

	//Getter/Accessor method
	public String GetColor(){
		return color;
	}
}
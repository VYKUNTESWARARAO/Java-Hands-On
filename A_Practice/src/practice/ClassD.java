package practice;

public class ClassD 
{
	
	private String animal;
	private String breed;
	private String taste;
	public ClassD(String animal,String breed ,String taste) 
	{
		this.animal=animal;
		this.breed=breed;
		this.taste=taste;
	}

	@Override
	public String toString()
	{
		return animal + breed + taste;
		
	}

}

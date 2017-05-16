
public class TrippleDice extends Dice implements Cloneable{
	private  int randomNumber;
	@Override
	public int Throw()
	{		
		randomNumber=super.Throw()+super.Throw()+super.Throw();
		return randomNumber;
	}
	public int getNumber()
	{
		return randomNumber;
	}
	public boolean equals(TrippleDice obj)
	{
		if(this.getNumber()==obj.getNumber())return true;
		else return false;
	}
	public String toString()
	{
		return String.format("Random number of Tripple Dice is :%d",Throw());
	}
	public Object clone()throws CloneNotSupportedException{  
		return super.clone();  
		}  
}
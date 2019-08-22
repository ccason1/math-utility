package conlan.math;

public class Couple {
	public int a;
	public int b;
	
	public Couple(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	
	public String toString()
	{
		return "a: " + a + " b: " + b;
	}
	
	@Override
	public boolean equals(Object obj) {
	    if(this == obj)
	        return true;

	    if(obj == null || obj.getClass() != this.getClass())
	        return false;

	    Couple couple = (Couple) obj;
	    
	    //TODO rename these four booleans
	    
	    boolean firstConditionOne = this.a == couple.a;
	    boolean firstConditionTwo = this.b == couple.b;
	    
	    boolean secondConditionOne = this.a == couple.b;
	    boolean secondConditionTwo = this.b == couple.a;
	    
	    if (firstConditionOne && firstConditionTwo || secondConditionOne && secondConditionTwo)
	        return true;

	    return false;
	}
}

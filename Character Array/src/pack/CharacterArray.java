package pack;

public class CharacterArray {
	
	public String address;
	public char[] adr;
	/**
	 * Construct an character array with default value of "NVCC Manassas Campus 6901 Sudley Road Manassas VA 20109"
	 */
	public CharacterArray()
	{
		address = "NVCC Manassas Campus 6901 Sudley Road Manassas VA 20109";
		adr = new char[address.length()];
		for(int i = 0 ; i < address.length();i++)
			adr[i] = address.charAt(i);
	}
	/**
	 * Construct an character array with the string value of address
	 * @param address
	 */
	public CharacterArray(String address)
	{
		this.address = address;
		adr = new char[address.length()];
		for(int i = 0 ; i < address.length();i++)
			adr[i] = address.charAt(i);
	}
	/**
	 * Display the original character
	 * If the character is a lower case letter, it redisplays the character in upper case
	 * If the character is a upper case letter, it redisplays the character in lower case
	 * If the character is a digit, it displays it as an * (asterisk)
	 */
	public void display()
	{
		System.out.println("original character:");
		for(int i = 0 ; i < adr.length; i++)
		{
			System.out.print(adr[i]);
		}
		System.out.println();
		
		char[] temp = new char[adr.length];
		for(int i = 0 ; i < adr.length; i++)
		{
			if( Character.isUpperCase(adr[i]))
				temp[i] = Character.toLowerCase(adr[i]);
			else if( Character.isLowerCase(adr[i]))
				temp[i] = Character.toUpperCase(adr[i]);
			else if( Character.isDigit(adr[i]))
				temp[i] = '*';
		}
		
		System.out.println("lOWER, upper, digit* mode:");
		for(int i = 0 ; i < adr.length; i++)
		{
			System.out.print(temp[i]);
		}
		System.out.println();
	}
	
}

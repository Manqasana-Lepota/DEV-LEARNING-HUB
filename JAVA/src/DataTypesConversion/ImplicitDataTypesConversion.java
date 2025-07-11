package DataTypesConversion;

public class ImplicitDataTypesConversion {

	public static void main(String[] args) {
		
		byte byteValue = 42;
		short shortValue = byteValue;
		int intValue = shortValue;
		long longValue = intValue;
		float floatValue = longValue;
		double doubleValue = floatValue;
		
		System.out.println("byte: " + byteValue);
		System.out.println("short (from byte): " + shortValue);
		System.out.println("int (from short): " + intValue);
		System.out.println("long (from int): " + longValue);
		System.out.println("float (from long): " + floatValue);
		System.out.println("double (from float): " + doubleValue);
		
	
	}

}

package datatypesconversion;

public class ExplicitDataTypesConversion {

	public static void main(String[] args) {
		
		double doubleValue = 123.456;
		float floatValue = (float) doubleValue;
		long longValue = (long) doubleValue;
		int intValue = (int) doubleValue;
		short shortValue = (short) intValue;
		byte byteValue = (byte) shortValue;
		
		System.out.println("Original double: " + doubleValue);
		System.out.println("Converted to float: " + floatValue);
		System.out.println("Converted to long: " + longValue);
		System.out.println("Converted to int: " + intValue);
		System.out.println("Converted to short: " + shortValue);
		System.out.println("Converted to byte: " + byteValue);
	}

}

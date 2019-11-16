package com.virtusa.codingtask;

public class NumberToWordConverter {

	private static String[] ONES_ARRAY = { "zero ", "one ", "two ", "three ", "four ", "five ", "six ", "seven ",
			"eight ", "nine " };
	private static String[] TWOS_ARRAY = { "ten ", "eleven ", "tweleve ", "thirteen ", "fourteen ", "fifteen ",
			"sixteen ", "seventeen ", "eighteen ", "nineteen ", "twenty " };
	private static String[] TWOS_COMMON_ARRAY = { "", "", "twenty ", "thirty ", "forty ", "fifty ", "sixty ",
			"seventy ", "eighty ", "ninty ", "hundred ", "thousand ", "million " };
	private static String AND = "and ";

	public String convert(int num) {
		if (validateNumber(num)) {
			return convertNumberToWord(num);
		} else {
			return num + " is not supported.";
		}
	}

	private String convertNumberToWord(int value) {
		String valStr = value + "";
		if (valStr.length() == 1) {
			return ONES_ARRAY[value];
		}
		if (valStr.length() == 2) {
			return getTwosValue(value);
		}

		if (valStr.length() == 3) {
			return getHundredValue(valStr);
		}

		if (valStr.length() == 4) {
			return getTwosValue(Integer.parseInt(String.valueOf(valStr.charAt(0)))) + TWOS_COMMON_ARRAY[11]
					+ getHundredValue(valStr.substring(1, 4));
		}

		if (valStr.length() == 5) {
			return getTwosValue(Integer.parseInt(valStr.substring(0, 2))) + TWOS_COMMON_ARRAY[11]
					+ getHundredValue(valStr.substring(2, 5));
		}

		if (valStr.length() == 6) {
			return ONES_ARRAY[Integer.parseInt(String.valueOf(valStr.charAt(0)))] + TWOS_COMMON_ARRAY[10]
					+ getTwosValue(Integer.parseInt(valStr.substring(1, 3))) + TWOS_COMMON_ARRAY[11]
					+ getHundredValue(valStr.substring(3, 6));
		}

		if (valStr.length() == 7) {
			return ONES_ARRAY[Integer.parseInt(String.valueOf(valStr.charAt(0)))] + TWOS_COMMON_ARRAY[12]
					+ ONES_ARRAY[Integer.parseInt(String.valueOf(valStr.charAt(1)))] + TWOS_COMMON_ARRAY[10] + AND
					+ getTwosValue(Integer.parseInt(valStr.substring(2, 4))) + TWOS_COMMON_ARRAY[11]
					+ getHundredValue(valStr.substring(4, 7));
		}

		if (valStr.length() == 8) {
			return getTwosValue(Integer.parseInt(valStr.substring(0, 2))) + TWOS_COMMON_ARRAY[12]
					+ ONES_ARRAY[Integer.parseInt(String.valueOf(valStr.charAt(2)))] + TWOS_COMMON_ARRAY[10] + AND
					+ getTwosValue(Integer.parseInt(valStr.substring(3, 5))) + TWOS_COMMON_ARRAY[11]
					+ getHundredValue(valStr.substring(5, 8));
		}

		if (valStr.length() == 9) {
			return ONES_ARRAY[Integer.parseInt(String.valueOf(valStr.charAt(0)))] + TWOS_COMMON_ARRAY[10] + AND
					+ getTwosValue(Integer.parseInt(valStr.substring(1, 3))) + TWOS_COMMON_ARRAY[12]
					+ ONES_ARRAY[Integer.parseInt(String.valueOf(valStr.charAt(3)))] + TWOS_COMMON_ARRAY[10] + AND
					+ getTwosValue(Integer.parseInt(valStr.substring(4, 6))) + TWOS_COMMON_ARRAY[11]
					+ getHundredValue(valStr.substring(6, 9));
		}
		return "";
	}

	private boolean validateNumber(int num) {
		String valStr = num + "";
		if ((num >= 0) && (valStr.length() > 0) && (valStr.length() < 10)) {
			return true;
		}else {
			return false;			
		}
	}

	private static String getHundredValue(String valStr) {
		if (Integer.parseInt(String.valueOf(valStr.charAt(0))) > 0) {
			return ONES_ARRAY[Integer.parseInt(String.valueOf(valStr.charAt(0)))] + TWOS_COMMON_ARRAY[10] + AND
					+ getTwosValue(Integer.parseInt(valStr.substring(1, 3)));
		} else {
			return getTwosValue(Integer.parseInt(valStr.substring(1, 3)));
		}
	}

	private static String getTwosValue(int val) {
		String valStr = val + "";
		String result = "";
		if (val > 9 && val < 21) {
			result += TWOS_ARRAY[val - 10];
		} else if (val > 20) {
			result += TWOS_COMMON_ARRAY[Integer.parseInt(String.valueOf(valStr.charAt(0)))]
					+ ONES_ARRAY[Integer.parseInt(String.valueOf(valStr.charAt(1)))];
		} else {
			result += ONES_ARRAY[Integer.parseInt(String.valueOf(val))];
		}
		return result;
	}

}

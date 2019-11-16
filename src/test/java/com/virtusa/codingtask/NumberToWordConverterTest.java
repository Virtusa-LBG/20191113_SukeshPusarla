package com.virtusa.codingtask;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class NumberToWordConverterTest {

	private NumberToWordConverter numberToWordConverter;
	private String errorMessage = " is not supported.";

	@Before
	public void setup() {
		numberToWordConverter = new NumberToWordConverter();
	}

	@SuppressWarnings("deprecation")
	@Test
	public void negativeValueTest() {
		int number = -21;
		String result = numberToWordConverter.convert(number);
		Assert.assertEquals(number + errorMessage, result);
	}

	@SuppressWarnings("deprecation")
	@Test
	public void Value_1_Test() {
		String result = numberToWordConverter.convert(1);
		Assert.assertEquals("one ", result);
	}

	@SuppressWarnings("deprecation")
	@Test
	public void Value_2_Test() {
		String result = numberToWordConverter.convert(0);
		Assert.assertEquals("zero ", result);
	}

	@SuppressWarnings("deprecation")
	@Test
	public void Value_3_Test() {
		String result = numberToWordConverter.convert(23);
		Assert.assertEquals("twenty three ", result);
	}

	@SuppressWarnings("deprecation")
	@Test
	public void Value_4_Test() {
		String result = numberToWordConverter.convert(864);
		Assert.assertEquals("eight hundred and sixty four ", result);
	}

	@SuppressWarnings("deprecation")
	@Test
	public void Value_5_Test() {
		String result = numberToWordConverter.convert(9510);
		Assert.assertEquals("nine thousand five hundred and ten ", result);
	}

	@SuppressWarnings("deprecation")
	@Test
	public void Value_6_Test() {
		String result = numberToWordConverter.convert(34525);
		Assert.assertEquals("thirty four thousand five hundred and twenty five ", result);
	}

	@SuppressWarnings("deprecation")
	@Test
	public void Value_7_Test() {
		String result = numberToWordConverter.convert(124587);
		Assert.assertEquals("one hundred twenty four thousand five hundred and eighty seven ", result);
	}

	@SuppressWarnings("deprecation")
	@Test
	public void Value_8_Test() {
		String result = numberToWordConverter.convert(5142544);
		Assert.assertEquals("five million one hundred and forty two thousand five hundred and forty four ", result);
	}

	@SuppressWarnings("deprecation")
	@Test
	public void Value_9_Test() {
		String result = numberToWordConverter.convert(89374344);
		Assert.assertEquals("eighty nine million three hundred and seventy four thousand three hundred and forty four ",
				result);
	}

	@SuppressWarnings("deprecation")
	@Test
	public void Value_10_Test() {
		String result = numberToWordConverter.convert(842345244);
		Assert.assertEquals("eight hundred and forty two million three hundred and forty five thousand two hundred and forty four ", result);
	}

	@SuppressWarnings("deprecation")
	@Test
	public void Value_11_Test() {
		String result = numberToWordConverter.convert(999999999);
		Assert.assertEquals("nine hundred and ninty nine million nine hundred and ninty nine thousand nine hundred and ninty nine " + 
				"", result);
	}
	
	@SuppressWarnings("deprecation")
	@Test(expected = NullPointerException.class)
	public void Value_12_Test() {
		String result = numberToWordConverter.convert((Integer) null);
	}

}

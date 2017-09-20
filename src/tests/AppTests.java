package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import meeldetuletus.Meeldetuletus;

public class AppTests {
	 Meeldetuletus app = new Meeldetuletus();
	// translateNumberToWord(2) -> "kaks"
	@Test
	public void numTranslation() {
		String methodResult = app.translateNumberToWord(2);
		String expectedResult = "kaks";
		assertEquals(methodResult, expectedResult);
	}
	
	@Test
	public void numTranslationVer2() {
		assertEquals(app.translateNumberToWord(5), "viis");
	}
	
	
	@Test
	public void numComparison () {
		assertTrue(app.assertBothValues(7, "seitse"));
	}
}

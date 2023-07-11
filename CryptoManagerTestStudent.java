/*
 * Class: CMSC203
 * Instructor: Ashique Tanveer
 * Description: This class is simply a test format to test and see
 * if the coding in the "CryptoManager" is working properly.
 * Due: 07/10/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Nabil El-Hage
*/





import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CryptoManagerTestStudent {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testStringInBounds() {
		assertTrue(CryptoManager.isStringInBounds("MONTGOMERY COLLEGE IS THE BEST"));
	}

	@Test
	public void testEncryptCaesar() {
		assertEquals("KRZ#LV#LW#JRLQJ", CryptoManager.caesarEncryption("HOW IS IT GOING", 3));
	}

	@Test
	public void testDecryptCaesar() {
		assertEquals("HOW IS IT GOING", CryptoManager.caesarDecryption("KRZ#LV#LW#JRLQJ", 3));
	}
	
	@Test
	public void testEncryptBellaso() {
		assertEquals("F^HR\\N@R&@NV ", CryptoManager.bellasoEncryption("CODING IS FUN", "CODING IS HARD"));
	}

	@Test
	public void testDecryptBellaso() {
		assertEquals("CODING IS FUN", CryptoManager.bellasoDecryption("F^HR\\N@R&@NV ", "CODING IS HARD"));
	}
}

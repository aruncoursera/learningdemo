/**
 * 
 */
package src.mf.com;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author RArun
 *
 */
public class TestMessageCreator {
	
	public MessageCreator mcObj;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		mcObj = new MessageCreator();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testWorld() {
		try {
			String mcVal = mcObj.getMessage("world");
			assertEquals(mcVal,"HELLO WORLD!");
		} catch(Exception e) {
			fail("Not excepted values");
		}
	}
	
	@Test
	public void testWorldCaps() {
		try {
			String mcVal = mcObj.getMessage("WORLD");
			assertEquals(mcVal,"HELLO WORLD!");
		} catch(Exception e) {
			fail("Not excepted values");
		}	
	}
	
	@Test
	public void testUniverse() {
		try {
			String mcVal = mcObj.getMessage("universe");
			assertEquals(mcVal,"HELLO UNIVERSE!");
		} catch(Exception e) {
			fail("Not excepted values");
		}
	}
	
	@Test
	public void testUniverseCaps() {
		try {
			String mcVal = mcObj.getMessage("UNIVERSE");
			assertEquals(mcVal,"HELLO UNIVERSE!");
		} catch(Exception e) {
			fail("Not excepted values");
		}	
	}
}

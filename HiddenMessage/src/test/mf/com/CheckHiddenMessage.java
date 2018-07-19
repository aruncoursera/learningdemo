/**
 * 
 */
package test.mf.com;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author RArun
 *
 */
public class CheckHiddenMessage {

	public HiddenMessageReader hmrObj;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		hmrObj = new HiddenMessageReader();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testHiddenWorld() {
		assertTrue(hmrObj.checkHiddenWorld());
		assertTrue(hmrObj.HiddenWorldContentMatches());
	}
	
	@Test
	public void testHiddenUniverse() {
		//assertTrue(hmrObj.checkHiddenUniverse());
		//assertTrue(hmrObj.HiddenUniverseContentMatches());
	}
}

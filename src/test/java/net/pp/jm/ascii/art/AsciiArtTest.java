/**
 * Copyright (C) 2014 Jose Manuel Prieto Palacios (josemanuel@prietopalacios.net)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.pp.jm.ascii.art;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.awt.Font;
import java.io.File;

import org.junit.Before;
import org.junit.Test;

public class AsciiArtTest {

	private AsciiArt art;

	@Before
	public void init(){
		art = new AsciiArt();
	}

	@Test
	public void defaultTest() {
		try {
			System.out.println("defaultTest(): " + art.doArt());
			assertTrue(true);
		} catch (Exception e) {
			assertFalse(false);
		}
	}

	@Test
	public void customTest() {
		try {
			String asciiartString = art.
					setText("IVAN").
					setWidth(70).
					setHeight(20).
					setFont(new Font(AsciiArt.FONT_SANSSERIF, Font.BOLD, 24)).
					setTextWidth(2).
					setTextHeight(19).
					setBackgroundSymbol("8").
					setTextSymbol("1").
					doArt();
			System.out.println("customTest(): \n" + asciiartString);
			assertTrue(true);
		} catch (Exception e) {
			assertFalse(false);
		}
	}

	@Test
	public void customTestMini() {
		try {
			String asciiartString = art.
					setText("IVAN").
					setWidth(35).
					setHeight(12).
					setFont(new Font(AsciiArt.FONT_SANSSERIF, Font.BOLD, 12)).
					setTextWidth(2).
					setTextHeight(10).
					setBackgroundSymbol("8").
					setTextSymbol("*").
					doArt();
			System.out.println("customTest(): \n" + asciiartString);
			assertTrue(true);
		} catch (Exception e) {
			assertFalse(false);
		}
	}

	@Test
	public void toFileTest() {
		try {
			String asciiartString = art.
					setText("PEPE").
					setWidth(100).
					setHeight(30).
					setFont(new Font(AsciiArt.FONT_SANSSERIF, Font.BOLD, 24)).
					setTextWidth(15).
					setTextHeight(22).
					setBackgroundSymbol("8").
					setTextSymbol("1").
					setFileOut(new File("src/test/resources/pruebaTextToIma.png")).
					doArt();
			System.out.println("toFileTest(): " + asciiartString);
			assertTrue(true);
		} catch (Exception e) {
			assertFalse(false);
		}
	}

	@Test
	public void overwriteImageTest() {
		try {
			String asciiartString = art.
					setFileIn(new File("src/test/resources/facebook.jpg")).
					setFileOut(new File("src/test/resources/pruebaFacebook.png")).
					doArt();
			System.out.println("overwriteImageTest(): " + asciiartString);
			assertTrue(true);
		} catch (Exception e) {
			assertFalse(false);
		}
	}

}
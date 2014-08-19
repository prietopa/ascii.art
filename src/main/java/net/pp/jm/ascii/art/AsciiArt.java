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

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class AsciiArt {

	public final static String FONT_SANSSERIF = "SansSerif";

	private int width;
	private int height;
	private String text;
	private Font font;
	private int textWidth;
	private int textHeight;
	private String backgroundSymbol;
	private String textSymbol;
	private File fileIn;
	private File fileOut;

	public AsciiArt(){
		setWidth(100);
		setHeight(30);
		setText("JAVA");
		setTextHeight(22);
		setTextWidth(15);
		setBackgroundSymbol("8");
		setTextSymbol("1");
		setFont(new Font(FONT_SANSSERIF, Font.BOLD, 24));
	}

	public File getFileOut() {
		return fileOut;
	}

	public AsciiArt setFileOut(File file) {
		this.fileOut = file;
		return this;
	}

	public File getFileIn() {
		return fileIn;
	}

	public AsciiArt setFileIn(File file) {
		this.fileIn = file;
		return this;
	}

	public String getTextSymbol() {
		return textSymbol;
	}

	public AsciiArt setTextSymbol(String textSymbol) {
		this.textSymbol = textSymbol;
		return this;
	}

	public String getBackgroundSymbol() {
		return backgroundSymbol;
	}

	public AsciiArt setBackgroundSymbol(String symbol) {
		this.backgroundSymbol = symbol;
		return this;
	}

	public int getTextWidth() {
		return textWidth;
	}

	public AsciiArt setTextWidth(int textWidth) {
		this.textWidth = textWidth;
		return this;
	}

	public int getTextHeight() {
		return textHeight;
	}

	public AsciiArt setTextHeight(int textHeight) {
		this.textHeight = textHeight;
		return this;
	}

	public String getText() {
		return text;
	}

	public AsciiArt setText(String text) {
		this.text = text;
		return this;
	}

	public Font getFont() {
		return font;
	}

	public AsciiArt setFont(Font font) {
		this.font = font;
		return this;
	}

	public int getWidth() {
		return width;
	}

	public AsciiArt setWidth(int width) {
		this.width = width;
		return this;
	}

	public int getHeight() {
		return height;
	}

	public AsciiArt setHeight(int height) {
		this.height = height;
		return this;
	}

	public String doArt() throws Exception {
		if(getFileIn() != null && getFileOut() == null)
			throw new Exception("Is necessary an output file");

		BufferedImage image = null;
		if(getFileIn() != null){
			image = ImageIO.read(getFileIn());
		}else{
			image = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_RGB);
		}
		Graphics g = image.getGraphics();
		g.setFont(getFont());

		Graphics2D graphics = (Graphics2D) g;
		graphics.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		graphics.drawString(getText(), getTextWidth(), getTextHeight());

		StringBuilder finalText = new StringBuilder();
		if(getFileOut() != null){
			ImageIO.write(image, "png", getFileOut());
			finalText.append("do it");
		}else{
			for (int y = 0; y < getHeight(); y++) {
				StringBuilder sb = new StringBuilder();
				for (int x = 0; x < getWidth(); x++) {
					sb.append(image.getRGB(x, y) == -16777216 ? getBackgroundSymbol() : getTextSymbol());
				}

				if (sb.toString().trim().isEmpty()) {
					continue;
				}

				finalText.append(sb.toString() + "\n");
			}
		}

		return finalText.toString();
	}

}

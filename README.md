***
This code allows you to enter any text in ascii characters. You can define the margins of the resulting image. Just as the margins of the text within the image. Actions with images are outside the target, but your chances are given.
***

######Show [unit test](https://github.com/prietopa/ascii.art/blob/master/src/test/java/net/pp/jm/ascii/art/AsciiArtTest.java) to show how it runs.

1.- **Show a default text to ascii art**:
```java
AsciiArt art = new AsciiArt();
art.doArt();
```

2.- **Create a custom text to ascii art**:
```java
	AsciiArt art = new AsciiArt();
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
```
> 8888888888888888888888888888888888888888888888888888888888888888888888
> 8888111188111118888888811118888881111188888888811118888888111188888888
> 8888111188111118888888811118888881111118888888811111888888111188888888
> 8888111188111118888888811188888881111118888888811111888888111188888888
> 8888111188811111888888111188888811111118888888811111188888111188888888
> 8888111188811111888888111188888811111111888888811111118888111188888888
> 8888111188811111188888111888888111111111888888811111118888111188888888
> 8888111188881111188881111888888111181111188888811111111888111188888888
> 8888111188881111188881111888888111181111188888811111111188111188888888
> 8888111188888111118811118888881111881111188888811111111188111188888888
> 8888111188888111118811118888881111888111118888811118111118111188888888
> 8888111188888111118811118888881118888111118888811118111111111188888888
> 8888111188888811111111188888811111111111118888811118811111111188888888
> 8888111188888811111111188888811111111111111888811118881111111188888888
> 8888111188888811111111188888111111111111111888811118881111111188888888
> 8888111188888881111111888888111188888881111188811118888111111188888888
> 8888111188888881111111888888111188888881111188811118888811111188888888
> 8888111188888888111118888881111888888881111188811118888811111188888888
> 8888111188888888111118888881111888888888111118811118888881111188888888
> 8888888888888888888888888888888888888888888888888888888888888888888888
					
3.- **Create a PNG file**:
```java
AsciiArt art = new AsciiArt();
art.
setText("PEPE").
setWidth(100).
setHeight(30).
setFont(new Font(AsciiArt.FONT_SANSSERIF, Font.BOLD, 24)).
setTextWidth(15).
setTextHeight(22).
setBackgroundSymbol("8").
setTextSymbol("1").
setFileOut(new File("/Users/jmprieto/Downloads/prueba1.png")).
doArt();
```
					
4.- **Overwrite a image with some text**:
```java
AsciiArt art = new AsciiArt();
art.
setFileIn(new File("src/test/resources/facebook.jpg")).
setFileOut(new File("src/test/resources/prueba1.png")).
doArt();
```

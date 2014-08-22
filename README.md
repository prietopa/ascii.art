Show unit test to show how it runs.

Show a default text to ascii art:
```java
AsciiArt art = new AsciiArt();
art.doArt();
```

Create a custom text to ascii art:
```java
AsciiArt art = new AsciiArt();
String asciiartString = art.
setText("IVAN").
setWidth(100).
setHeight(30).
setFont(new Font(AsciiArt.FONT_SANSSERIF, Font.BOLD, 24)).
setTextWidth(15).
setTextHeight(22).
setBackgroundSymbol("8").
setTextSymbol("1").
doArt();
```
					
Create a PNG file:
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
					
Overwrite a image with some text:
```java
AsciiArt art = new AsciiArt();
art.
setFileIn(new File("src/test/resources/facebook.jpg")).
setFileOut(new File("src/test/resources/prueba1.png")).
doArt();
```

# BreedingFlower
- The main class of the project is fleur.java. From fleur.java we create a class named FirstWindow.java which gives the user
3 options to use the program.
- Our project is divided into 3 main parts:
   * Button1.java: Animal
   * Button2.java: Flower
   * Button3.java: Mystic
- Button1 uses a subclass named Result1.java to show possible hybrids between animals.
- Button2 is the most complicated when using 2 classes: CouleurChoix.java and FleurDecouverte.java. ColorChoix.java is
used to find a way to find a hybrid method for a desired color, using a GetColor.java subclass which
contains the color of the parent flower, the parent flower and the percentage of offspring. FleurDecouverte.java uses the subclass
ReadData to read data from an Excel table from outside the program using the apache.poi library.
- Button3 uses a subclass named Result3.java to show possible hybrids between different species.

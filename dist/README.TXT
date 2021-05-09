- La classe principale du projet est fleur.java. À partir de fleur.java, nous créons une classe nommée FirstWindow.java qui donne à l'utilisateur 
3 options pour utiliser le programme.
- Notre projet est divisé en 3 parties principales  :
   * Button1.java  : Animal
   * Button2.java  : Flower
   * Button3.java  : Mystic
- Button1 utilise une sous-classe nommée Result1.java pour montrer les hybrides possibles entre les animaux.
- Button2 est le plus compliqué lors de l'utilisation de 2 classes: CouleurChoix.java et FleurDecouverte.java. CouleurChoix.java est 
utilisé pour trouver un moyen de trouver une méthode hybride pour une couleur désirée, en utilisant une sous-classe GetColor.java qui 
contient la couleur de la fleur parente, la fleur parente et le pourcentage de la progéniture. FleurDecouverte.java utilise la sous-classe 
ReadData pour lire les données d'une table Excel depuis l'extérieur du programme à l'aide de la bibliothèque apache.poi.
- Button3 utilise une sous-classe nommée  Result3.java pour montrer les hybrides possibles entre les differents	espèce.   

import java.util.Scanner;
public class Zauberwunsch{
      public static void main(String[] argS) {
             Scanner scanner = new Scanner (System.in);

while (true) {
	      System.out.print("Liste der Zauber: 1=gestalten 2=Nachtsicht 3=gegen verdrehen");	
              System.out.print("Bitte Zahl zwischen 1 und 3 eingeben!");
              String Input = scanner.nextLine();

              if (Input.equalsIgnoreCase("Exit")){
              break;
              }
              int zahl;
              try{
              zahl = Integer.parseInt(Input);
              } catch (NumberFormatException e) {
              System.out.println ("ungültige Eingabe");
              continue;
              }

              switch (zahl){

              case 1:
              System.out.println ("gestalten    ");
              break;

              case 2:
              System.out.println ("Nachtsicht    ");
              break;

              case 3:
              System.out.println ("gegen verdrehen    ");
              break;

              default :
              System.out.println ("ungültige Zahl wähle 1-3");
       }
   }
   scanner.close();
  }
}




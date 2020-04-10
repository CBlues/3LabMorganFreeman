package ui;
import java.util.*;
import model.Load;
import model.Client;
import model.Ship;

public class Main{
	//Atributes
		
		public static Scanner sc;
		public static void main(String[] args) {
			Scanner sc = new Scanner (System.in);
			Main objMain=new Main();
			int option;
			do{
			System.out.println ("Decida una de las opciones"+"\n1.Ver Info del Cliente"+"\n2.Ir a la carga"+"\n3.Ir al barco");
				
				option=sc.nextInt();
				sc.nextLine();
				switch (option){
					case 1:
						Client();
						break;
					case 2:
						Load();
						break;
					case 3:
						Ship();
						break;
					case 4:
						objMain.reportClient();
						break;
				}
				System.out.println("To return type 0");
				option=sc.nextInt();
			} while (option==0);
		}
}
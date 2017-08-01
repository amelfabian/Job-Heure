package controle;

import java.util.Scanner;

import vue.Vue;

public class Controle {
	char continuer = 'O';
	Scanner sc = new Scanner(System.in);
		public void start(){
			
			while( Character.toUpperCase(continuer) == 'O'){
			Vue vue = new Vue();
			System.out.println(vue.getScreenAcceuil());
			int choix = sc.nextInt();
			switch(choix){
			case 1 : System.out.println(vue.getScreenJobbeur());
			break;
			case 2 : System.out.println(vue.getScreenJob());
			break;
			}
			
			System.out.println("voulez vous continuer (O/N) ?: ");
			continuer = sc.nextLine().charAt(0);
			
			}
			System.out.println("Au revoir");
		}
}

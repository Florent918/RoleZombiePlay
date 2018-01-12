package zombiePlay.view;


import java.util.Scanner;


import zombiePlay.model.Cashier;
import zombiePlay.model.ChickenZombi;
import zombiePlay.model.Cop;
import zombiePlay.model.FireFighter;
import zombiePlay.model.Hobo;
import zombiePlay.model.MilitaryZombi;
import zombiePlay.model.Personnage;
import zombiePlay.model.PersonnageFactory;
import zombiePlay.model.SplashZombi;
import zombiePlay.model.TraitementAction;
import zombiePlay.model.Zombi;

public class Game {
	
	private String userInput;
	private Personnage player1,player2,currentEnnemy;
	private String regex = "[0-9]";
	private TraitementAction traitement = TraitementAction.getInstance();
	
	public Game() {
		/**
		 * Initalization with nothing !
		 */
	}
	public void play() {
		/**
		 * Boucle principal de jeu jusqu'à la fin de la partie.
		 */
		clearConsole();
		player1 = traitement.userChoice(1);
		player2 = traitement.userChoice(2);
		System.out.println("Vous arrivez dans la bouche d'un tigre\nCa pue.....");
		
		while(!traitement.isOver(player1) && !traitement.isOver(player2)) {

			clearConsole();
			currentEnnemy = traitement.existedEnnemy(currentEnnemy);
			System.out.println(String.format("Un %s vous fais face...",currentEnnemy.getName()));
			traitement.Statistiques(currentEnnemy);
			
			/////////////////TOUR JOUEUR 1///////////////////////
			traitement.Turn(player1, currentEnnemy);
			/////////////////TOUR JOUEUR 1///////////////////////
			
			/////////////////TOUR ENNEMY///////////////////////
			traitement.EnnemyTurn(player1, currentEnnemy);
			/////////////////TOUR ENNEMY///////////////////////
			
			/////////////////TOUR JOUEUR 2///////////////////////
			traitement.Turn(player2, currentEnnemy);
			/////////////////TOUR JOUEUR 2///////////////////////
			
			/////////////////TOUR ENNEMY///////////////////////
			traitement.EnnemyTurn(player2, currentEnnemy);
			/////////////////TOUR ENNEMY///////////////////////
		}
	}
	public void clearConsole() {
		int i = 0;
		while(i < 25) {
			System.out.println(" ");
			i++;
		}
	}
}


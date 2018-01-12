package zombiePlay.model;

import java.util.Scanner;

public class TraitementAction {
	
		private PersonnageFactory personnageFactory = new PersonnageFactory();
		private String userInput;
		private String regex = "[0-9]";
		
		private static TraitementAction instance = new TraitementAction();
		private TraitementAction() {}
		public static TraitementAction getInstance(){
			return instance;
		}
		public void Turn(Personnage player, Personnage ennemy) {
			System.out.println(String.format("Au tour du %s !",player.getName()));
			this.Statistiques(player);
			this.Action(player,ennemy);
			clearConsole();
			this.existedEnnemy(ennemy);
		}
		public void EnnemyTurn(Personnage player, Personnage ennemy) {
			System.out.println(String.format("Au tour du %s !",ennemy.getName()));
			this.Statistiques(ennemy);
			player.setCurrentLife(player.getCurrentLife() - ennemy.Attack());
			this.Statistiques(player);
		}
		public Personnage existedEnnemy(Personnage currentEnnemy) {
			if(currentEnnemy != null) {
				if(!currentEnnemy.IsAlive()) {
					return null;
				}
			}
			if(currentEnnemy == null) {
				return this.ennemyChoice();
			}
			return currentEnnemy;
		}
		public void Action(Personnage player, Personnage ennemy) {
			System.out.println("Quel action choississez vous ?\n1 - Attaquer\n2 - Se soigner");
			Scanner sc = new Scanner(System.in);
			if(sc.nextLine().matches(regex)) {
				userInput = sc.nextLine();
				this.actionChoice(userInput, player,ennemy);
			} else {
				System.out.println("Rentre un chiffre entre 0 et 1.....COTO");
			}
		}
		public void Statistiques(Personnage playerObject) {
				System.out.println(String.format("Statistiques du %s: %s/%s HP",playerObject.getName(),playerObject.getCurrentLife(),playerObject.getLifeMax()));
		}
		public Personnage ennemyChoice() {
			int rand = (int)(Math.random()*4);
			switch(rand) {
			case 0:
				return personnageFactory.createZombi();
			case 1:
				return personnageFactory.createMilitaryZombi();
			case 2:
				return personnageFactory.createSplashZombi();
			case 3:
				return personnageFactory.createChickenZombi();
			default :
				break;
			}
			
			return null;
		}
		public Personnage userChoice(int player) {
			System.out.println(String.format("Bienvenue.....\nJoueur %s choisis ta classe :\n1 - Caissier\n2 - Pompier\n3 - Flic\n4 - Clodo",player));
			Scanner sc = new Scanner(System.in);
			userInput = sc.nextLine();
			switch(userInput.toCharArray()[0]) {
				case '1':
					return personnageFactory.createCashier();
				case '2':
					return personnageFactory.createFireFighter();
				case '3':
					return personnageFactory.createCop();
				case '4':
					return personnageFactory.createHobo();		
				default :
					break;
			}
			return null;
		}
		public boolean isOver(Personnage player) {
			if(player.IsAlive()) {
				return false;
			}
			return true;
		}
		
		public void actionChoice(String input,Personnage player, Personnage ennemy) {
			if(input != "") {
				switch(input.toCharArray()[0]) {
				case '1':
					ennemy.setCurrentLife(ennemy.getCurrentLife() - player.Attack());
					break;
				case '2':
					player.setCurrentLife(player.getCurrentLife() + player.getHeal());
					break;
				default:
					break;
				}
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


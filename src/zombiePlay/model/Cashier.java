package zombiePlay.model;

public class Cashier extends Personnage {
		/**
		 * Red�finition des attributs:
		 * 	Defence
		 * 	StaminaMax
		 */
		public Cashier() {
			super();
			this.init();
			this.defence = 12;
			this.StaminaMax = 120;
			this.name = "Caissier";
			
		}
}

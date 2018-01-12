package zombiePlay.model;

public class Cop extends Personnage {
		/**
		 * Redéfinition des attributs:
		 * 	Attack
		 * 	StaminaMax
		*/
		public Cop() {
			super();
			this.init();
			this.attack = 17;
			this.StaminaMax = 130;
			this.name = "Flic";
		}
}

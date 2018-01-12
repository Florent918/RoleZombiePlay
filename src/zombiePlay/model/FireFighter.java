package zombiePlay.model;

public class FireFighter extends Personnage {
		/**
		 * Redéfinition des attributs:
		 * 	LifeMAx
		 * 	StaminaMax
		 */
		public FireFighter() {
			super();
			this.init();
			this.lifeMax = 150;
			this.StaminaMax  = 150;
			this.name = "Pompier";
		}
}

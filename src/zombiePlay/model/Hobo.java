package zombiePlay.model;

public class Hobo extends Personnage {
		/**
		 * Attributs re :
		 * Dodge
		 * StaminaMax.
		 */
		public Hobo () {
			super();
			this.init();
			this.dodge = 50;
			this.StaminaMax = 90;
			this.name = "Clodo";
		}
}

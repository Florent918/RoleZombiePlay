package zombiePlay.model;

public abstract class Weapon {

		/**
		 * Definition attribut
		 * Name
		 * Specialattackname
		 * Damage
		 */
		protected String name;
		protected String specialName;
		protected Integer damage = 10;
		protected Integer specialDamage;
		/////////////////////////////GETTER\\\\\\\\\\\\\\\\\\\\\\
		protected String getName() {
			return this.name;
		}
		protected String getSpecialAttackName() {
			return this.specialName;
		}
		protected int getTotalDamage() {
			return this.damage;
		}
		///////////////////////////GETTER\\\\\\\\\\\\\\\\\\\\\\
		protected int CriticalHit() {
			/**
			 * Retourne la valeur de dégats du coup critique(0 si pas CC);
			 */
			return this.damage*2;
		}
		
}

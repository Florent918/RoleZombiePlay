package zombiePlay.model;

public abstract class Personnage {

	/**
	 * Rajouter tous les attributs:
		 * lifeMax
		 * currentLife
		 * newWeapon
		 * attack
		 * dodge
		 * defence
		 * staminaMan
		 * currentStamina
		 * level
		 * exp
		 * palierLevel
	 */
	protected  Integer lifeMax;
	protected  Integer currentLife;
	protected  Integer attack;
	protected  Integer dodge;
	protected  Integer defence;
	protected  Integer StaminaMax;
	protected  Integer currentStamina;
	protected  Integer level;
	protected  Integer currentExp;
	protected  Integer expMax;
	protected  Integer heal;
	protected  Weapon newWeapon;
	protected  String name;
	protected String testGit;
	///////////////////////////////////////////////////GETTER\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
	protected int getDefence() {
		/**
		 * getter
		 */
		return this.defence;
	}
	protected int getStaminaMax() {
		/**
		 * getter
		 */
		return this.StaminaMax;
	}
	protected int getCurrentStamina() {
		/**
		 * getter
		 */
		return this.currentStamina;
		
	}
	protected int getAttack() {
		/**
		 * getter
		 */
		return this.attack;
	}
	protected int getLevel() {
		/**
		 * getter
		 */
		return this.level;
	}
	protected int getCurrentExp() {
		/**
		 * getter
		 */
		return this.currentExp;
		
	}
	public void setCurrentLife(int newlife) {
		this.currentLife = newlife;
	}
	protected int getExpMax() {
		/**
		 * getter
		 */
		return this.expMax;
	}
	public int getLifeMax() {
		/**
		 * getter
		 */
		return this.lifeMax;
	}
	public int getCurrentLife() {
		/**
		 * getter
		 */
		return this.currentLife;
	}
	public String getName() {
		return this.name;
	}
	public Integer getDodge() {
		return dodge;
	}
	public void setDodge(Integer dodge) {
		this.dodge = dodge;
	}
	public Integer getHeal() {
		return heal;
	}
	public void setHeal(Integer heal) {
		this.heal = heal;
	}
	public Weapon getNewWeapon() {
		return newWeapon;
	}
	public void setNewWeapon(Weapon newWeapon) {
		this.newWeapon = newWeapon;
	}
	public void setLifeMax(Integer lifeMax) {
		this.lifeMax = lifeMax;
	}
	public void setCurrentLife(Integer currentLife) {
		this.currentLife = currentLife;
	}
	public void setAttack(Integer attack) {
		this.attack = attack;
	}
	public void setDefence(Integer defence) {
		this.defence = defence;
	}
	public void setStaminaMax(Integer staminaMax) {
		StaminaMax = staminaMax;
	}
	public void setCurrentStamina(Integer currentStamina) {
		this.currentStamina = currentStamina;
	}
	public void setLevel(Integer level) {
		this.level = level;
	}
	public void setCurrentExp(Integer currentExp) {
		this.currentExp = currentExp;
	}
	public void setExpMax(Integer expMax) {
		this.expMax = expMax;
	}
	public void setName(String name) {
		this.name = name;
	}
	/////////////////////////////////////////////////GETTER\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
	public int Attack() {
		/**
		 * Renvoi la valeur de l'attaque pour un coup pour un personnage
		 */
		
		return newWeapon.getTotalDamage() + attack;
	}	
	
	protected void IncreaseWeapon() {
		/**
		 * Upgrade l'arme en prenant la suivante
		 */
	}
	public int DamageTaken(Personnage player) {
		/**
		 * Mets à jour currentLige en fonction de damage
		 */
		return player.newWeapon.getTotalDamage() + player.Attack();
	}
	public boolean IsAlive() {
		/**
		 * Teste si le personnage est encore vivant (currentLife > 0)
		 */
		if(this.currentLife > 0) {
			return true;
		}
			
	
		return false;
	}
	
	protected void UseStamina(int stamina) {
		/**
		 * Mets à jour current Stamina 
		 */
		this.currentStamina = this.currentStamina - stamina;
	}
	protected boolean EnoughStamina(int stamina) {
		/**
		 * Vérifie le solde de Stamina
		 */
		if(this.currentStamina - stamina < 0) {
			return false;
		}
		return true;
	}

	protected void UpdateLevel(int exp) {
		/**
		 * Mets à jour le niveau si currentExp >= expMax 
		 */
		if(this.currentExp > this.expMax) {
			this.expMax = this.expMax*2;
			this.level++;
			this.lifeMax = this.lifeMax*2;
			this.currentLife = this.lifeMax;
			this.attack = this.attack*2;
			this.dodge = this.dodge*2;
			this.defence = this.defence*2;
			this.StaminaMax = this.StaminaMax*2;
			this.currentStamina = this.StaminaMax*2;
		}
	}
	
	protected void init() {
		/**
		 * Initialise les attributs
		 */
		this.lifeMax = 100;
		this.currentLife = this.lifeMax;
		attack = 15;
		dodge = 10;
		heal = 5;
		defence = 7;
		StaminaMax = 100;
		currentStamina = StaminaMax;
		level = 1;
		currentExp  = 0;
		expMax = 100;
		newWeapon = new PiedDeBiche();
	}
	
	
	
	
}

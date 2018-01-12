package zombiePlay.model;

public class PersonnageFactory {
	
	public Personnage createCashier() {
		return new Cashier();
	}
	
	public Personnage createFireFighter() {
		return new FireFighter();
	}
	
	public Personnage createCop() {
		return new Cop();
	}
	
	public Personnage createHobo() {
		return new Hobo();
	}
	
	public Personnage createZombi() {
		return new Zombi();
	}
	
	public Personnage createMilitaryZombi() {
		return new MilitaryZombi();
	}
	
	public Personnage createSplashZombi() {
		return new SplashZombi();
	}
	
	public Personnage createChickenZombi() {
		return new ChickenZombi();
	}
	
}

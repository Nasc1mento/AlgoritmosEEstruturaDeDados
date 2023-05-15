package test.unit.first.question3;

public class Dealership {
	
	private Queue queueCarSale;
	private Queue queueMechanicalWorkshop;
	private Queue queueAccessories;
	private Funcionary receptionist;
	
	public Dealership() {
		this.queueCarSale = new Queue(Departaments.CAR_SALE);
		this.queueMechanicalWorkshop = new Queue(Departaments.MECHANICAL_WORKSHOP);
		this.queueAccessories = new Queue(Departaments.ACCESSORIES);
		this.receptionist = new Receptionist("Fulano");
	}
	
	
	
}

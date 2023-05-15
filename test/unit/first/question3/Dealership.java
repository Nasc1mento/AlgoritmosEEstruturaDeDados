package test.unit.first.question3;

public class Dealership {

	private Queue queueCarSale;
	private Queue queueMechanicalWorkshop;
	private Queue queueAccessories;
	private Receptionist receptionist;

	public Dealership() {
		this.queueCarSale = new Queue(Departaments.CAR_SALE);
		this.queueMechanicalWorkshop = new Queue(Departaments.MECHANICAL_WORKSHOP);
		this.queueAccessories = new Queue(Departaments.ACCESSORIES);
		this.receptionist = new Receptionist("Fulano");
	}

	public void enter(Client client) {
		Departaments deparament = receptionist.redirect();
		if (deparament == Departaments.ACCESSORIES)
			queueAccessories.enqueue(client);
		else if (deparament == Departaments.CAR_SALE)
			queueCarSale.enqueue(client);
		else if (deparament == Departaments.MECHANICAL_WORKSHOP)
			queueMechanicalWorkshop.enqueue(client);
	}
}

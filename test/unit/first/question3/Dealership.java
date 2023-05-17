package test.unit.first.question3;


public class Dealership {

	private QueueClients queueCarSale;
	private QueueClients queueMechanicalWorkshop;
	private QueueClients queueAccessories;
	private Receptionist receptionist;
	private Attendant attendantCarSale;
	private Attendant attendantMechanicalWorkshop;
	private Attendant attendantAcessories;
	private QueueClients registeredClients;


	public Dealership() {
		this.queueCarSale = new QueueClients();
		this.queueMechanicalWorkshop = new QueueClients();
		this.queueAccessories = new QueueClients();
		this.receptionist = new Receptionist("Fulano da Recepcao");
		this.attendantAcessories = new Attendant("Fulano Atendente Acessorios", Departament.ACCESSORIES);
		this.attendantCarSale = new Attendant("Fulano Atendente Carros", Departament.CAR_SALE);
		this.attendantMechanicalWorkshop = new Attendant("Fulano Atendente Mecanico", Departament.MECHANICAL_WORKSHOP);
		this.registeredClients = new QueueClients();
	}

	public void enter(Client client, Departament departament) {
		if (departament == Departament.ACCESSORIES)
			queueAccessories.enqueue(client);
		else if (departament == Departament.CAR_SALE)
			queueCarSale.enqueue(client);
		else if (departament == Departament.MECHANICAL_WORKSHOP)
			queueMechanicalWorkshop.enqueue(client);
	}

	public boolean tv() {
		int count = 0;
		
		if (!queueAccessories.isEmpty()) {
			System.out.println("TV: "+ new Token(attendantAcessories.serve(queueAccessories), attendantAcessories));
			count++;
		}
			
		if (!queueCarSale.isEmpty()) {
			System.out.println("TV: "+ new Token(attendantCarSale.serve(queueCarSale), attendantCarSale));
			count++;
		}
			
		if (!queueMechanicalWorkshop.isEmpty()) {
			System.out.println("TV: "+ new Token(attendantMechanicalWorkshop.serve(queueMechanicalWorkshop), attendantMechanicalWorkshop));
			count++;
		}
			
		return count > 0;
	}

	public void action() {

		this.load();
		this.state();
		boolean flag = true;
		while (true) {
			System.out.println("------------------------------------------------------------------------");
			boolean tv = tv();
			System.out.println("------------------------------------------------------------------------");
			if (!tv)
				break;			
			state();
		}

	}

	public void load() {
		for (int i = 1; i <= 10; i++) {
			Client client = new Client();
			client.setName("Pessoa" + i);
			client.setCpf(i + "" + i + "" + i);
			client.setPhoneNumber(i + "" + i + "" + i);
			client.setPriority(i % 2 == 0);
			if(!registeredClients.contains(client)) {
				this.enter(client, this.receptionist.redirect());
				this.registeredClients.enqueue(client);
			}else {
				System.out.println("Cliente já registrado no sistema");
			}
			
		}
	}

	public void state() {
		System.out.println(this.queueMechanicalWorkshop);
		System.out.println(this.queueAccessories);
		System.out.println(this.queueCarSale);
	}
}

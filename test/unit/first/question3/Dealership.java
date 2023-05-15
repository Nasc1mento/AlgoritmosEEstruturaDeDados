package test.unit.first.question3;

public class Dealership {

	private Queue queueCarSale;
	private Queue queueMechanicalWorkshop;
	private Queue queueAccessories;
	private Receptionist receptionist;
	private Attendant attendantCarSale;
	private Attendant attendantMechanicalWorkshop;
	private Attendant attendantAcessories;

	public Dealership() {
		this.queueCarSale = new Queue(Departament.CAR_SALE);
		this.queueMechanicalWorkshop = new Queue(Departament.MECHANICAL_WORKSHOP);
		this.queueAccessories = new Queue(Departament.ACCESSORIES);
		this.receptionist = new Receptionist("Fulano da Recepcao");
		this.attendantAcessories = new Attendant("Fulano Atendente Acessorios", Departament.ACCESSORIES);
		this.attendantCarSale = new Attendant("Fulano Atendente Carros", Departament.CAR_SALE);
		this.attendantMechanicalWorkshop = new Attendant("Fulano Atendente Mecanico", Departament.MECHANICAL_WORKSHOP);
	}

	public void enter(Client client, Departament departament) {
		if (departament == Departament.ACCESSORIES)
			queueAccessories.enqueue(client);
		else if (departament == Departament.CAR_SALE)
			queueCarSale.enqueue(client);
		else if (departament == Departament.MECHANICAL_WORKSHOP)
			queueMechanicalWorkshop.enqueue(client);
	}
	
	public void serve(Departament departament) {
		if (departament == Departament.ACCESSORIES)
			System.out.println(new Token(attendantAcessories.serve(queueAccessories), attendantAcessories));
		else if (departament == Departament.CAR_SALE)
			System.out.println(new Token(attendantCarSale.serve(queueCarSale), attendantCarSale));
		else if (departament == Departament.MECHANICAL_WORKSHOP)
			System.out.println(new Token(attendantMechanicalWorkshop.serve(queueMechanicalWorkshop), attendantMechanicalWorkshop));
	}
	
	
	public static void main(String[] args) {
		Dealership ds = new Dealership();
		
		Client client = new Client();
		client.setName("NaoPCD");
		client.setCpf("123456789011");
		client.setPhoneNumber("99 9999-9999");
		client.setAddress("Mais perto que o IF");
		client.setPriority(false);
		Departament departament = ds.receptionist.redirect();
		ds.enter(client, departament);
		System.out.println(ds.queueMechanicalWorkshop);
		System.out.println(ds.queueAccessories);
		System.out.println(ds.queueCarSale);
		
		Client clientpcd = new Client();
		clientpcd.setName("ClientPCD");
		clientpcd.setCpf("123456789011");
		clientpcd.setPhoneNumber("99 9999-9999");
		clientpcd.setAddress("Mais perto que o IF");
		clientpcd.setPriority(true);
		
		ds.enter(clientpcd, departament);
		System.out.println(ds.queueMechanicalWorkshop);
		System.out.println(ds.queueAccessories);
		System.out.println(ds.queueCarSale);
		
		ds.serve(departament);
		//Coloca pra printar denovo
	}
}

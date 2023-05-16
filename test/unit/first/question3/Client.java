package test.unit.first.question3;

public class Client {
	
	
	private String name;
	private String cpf;
	private String address;
	private String phoneNumber;
	private boolean priority;
	private Client next;
	
	public Client() {
		this.next = null;
	}
	
	public Client(Client next) {
		this.next = next;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public boolean isPriority() {
		return priority;
	}

	public void setPriority(boolean priority) {
		this.priority = priority;
	}
	
	public void setNext(Client next) {
		this.next = next;
	}
	
	public Client getNext() {
		return this.next;
	}
	
	@Override
	public String toString() {
		return "Client:[name=" + name + ", cpf=" + cpf + ", address=" + address + ", phoneNumber=" + phoneNumber
				+ ", priority=" + priority + "]";
	}
}

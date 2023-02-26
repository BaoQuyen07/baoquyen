package encapsulation.inside;

public class Company {
	public String id;
	public String name;
	protected String insurance;
	private Long fund;
	
	public Company() {
		
	}

	// overloading
	public Company(String id, String name, String insurance, Long fund) {
		super();
		this.id = id;
		this.name = name;
		this.insurance = insurance;
		this.fund = fund;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInsurance() {
		return insurance;
	}

	public void setInsurance(String insurance) {
		this.insurance = insurance;
	}

	public Long getFund() {
		return fund;
	}

	public void setFund(Long fund) {
		this.fund = fund;
	}
	
	
	// override toString method from Object 
	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", insurance=" + insurance + ", fund=" + fund + "]";
	}
	
	
	
}

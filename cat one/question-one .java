public class Customer {
    private String name;
    private LocalDate dateOfBirth;

    public Customer(String name, String address, LocalDate dateOfBirth, Nationality, Date of registration) {
        this.name = name;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
		this.Nationality=Nationality;
		this.dateOfRegistration=dateOfRegistration;
    }

    public String getaddress() {
        return address;
    }

    public String getName() {
        throw new UnsupportedOperationException("Access to name is restricted.");
    }

    public LocalDate getDateOfBirth() {
        throw new UnsupportedOperationException("Access to date of birth is restricted.");
    }

    public void setaddress(String address) {
        this.address = address;
    }


    public void Nationality(String Nationality) {
        this.Nationality = Nationality;
    }
	
	public void dateOfRegistration(String dateOfRegistration) {
        this.dateOfRegistration = dateOfRegistration;
    }
	
    public void setName(String name) {
        throw new UnsupportedOperationException("Modification of name is restricted.");
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        throw new UnsupportedOperationException("Modification of date of birth is restricted.");
    }
}

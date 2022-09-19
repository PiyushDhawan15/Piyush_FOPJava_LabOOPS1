package greatlearning.emailapp.service;
import greatlearning.emailapp.model.Employee;

public interface  CredentialService {
	public String generateEmailId(String fname, String lname , String dept );
    public String generatePassword();
    public void showcredentials(Employee e);
}

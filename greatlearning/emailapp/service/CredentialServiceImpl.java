package greatlearning.emailapp.service;
import java.util.Random;
import greatlearning.emailapp.model.Employee; 

 public class CredentialServiceImpl implements CredentialService {
private String domain  ;
public CredentialServiceImpl(String domain) {
	super();
	this.domain= domain;
}

@Override
public String generateEmailId(String fname, String lname, String dept) {
	// TODO Auto-generated method stub
	return fname+lname+"@"+dept+"."+domain;
}

@Override
public String generatePassword() {
	// TODO Auto-generated method stu
	Random r=new Random();
	StringBuilder sb = new StringBuilder();
	for (int i=0;i<8;i++)
	{
		int n=r.nextInt(127-32)+32;
		sb.append((char)n);
	}
	return sb.toString();
}

@Override
public void showcredentials(Employee e) {
	// TODO Auto-generated method stub
	System.out.println("Dear "+  e.getFirstName() );
	System.out.println ("Your generated credential are as follows ");
	System.out.println("Email-->"+ e.getEmailId());
	System.out.println("Password-->"+e.getPassWord());
   
}

}

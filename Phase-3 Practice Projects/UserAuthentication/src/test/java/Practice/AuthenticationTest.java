package Practice;

import static org.junit.jupiter.api.Assertions.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class AuthenticationTest {
private UserAuthentication Uauth;
	
	@BeforeEach
	public void setup() {
		Uauth= new UserAuthentication();
		System.out.println("Authentication User main class inititated");
	}
	
	@AfterEach
	public void tearDown() {
		Uauth=null;
		System.out.println("Class Closed");
	}
	
	@Test
	public void checkUser() {
		assertEquals("radithya@gmail.com", Uauth.username());
	}
	@Test
	public void checkUserNull()
	{
		assertNotNull(Uauth.username());
	}
	
	@Test
	public void checkPass() {
		assertEquals("123456789", Uauth.password());
	}
	
	@Test
	public void checkPassNull()
	{
		assertNotNull(Uauth.password());
	}
	
	@Test
	public void checkUserRegx()
	{
		String email = Uauth.username();
		String regex = "^(.+)@(.+)$";
		 
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		
		
		assertEquals(true, matcher.matches());
	}

	
}
	


package Practice;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

class ConditionalTest {
	
	
	@Test
	@EnabledOnOs({OS.WINDOWS})
	public void runOnWindows() {
		System.out.println(" This run is on Windows OS");
		
	}

	@Test
	@DisabledOnOs({OS.MAC})
	public void notRunOnMac() {
		System.out.println(" Not Run on MAC OS");
		
	}
	
	@Test
	@EnabledOnOs({OS.MAC})
	public void runOnMac() {
		System.out.println(" This run is on MAC OS");
		
	}
	
	
	@Test
	@EnabledOnOs({OS.LINUX})
	public void runOnLinux() {
		System.out.println(" This run is on LINUX OS");
		
	}
	 
}
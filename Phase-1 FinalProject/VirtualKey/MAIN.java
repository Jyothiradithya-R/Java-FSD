package VirtualKey;

public class MAIN {
		public static void main(String[] args) {
				
				
				FileOperations.createMainFolderIfNotPresent("main");
				
				MENU.printWelcomeScreen("virtualkey", "Jyothiradithya");
				
				HandleOptions.handleWelcomeScreenInput();
			}


		}



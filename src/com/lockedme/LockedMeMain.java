package com.lockedme;

public class LockedMeMain {
public static void main(String[] args) {
		FileOperations.createMainFolderIfNotPresent("main");
		
		LockedMeMenu.printWelcomeScreen("LockedMe", "chikitha");
		
		HandleOperations.handleWelcomeScreenInput();
	}
}


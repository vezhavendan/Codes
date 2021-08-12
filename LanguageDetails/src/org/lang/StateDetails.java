package org.lang;

public class StateDetails {
	public void southindia() {
		System.out.println("south india");
	}
	public void northindia() {
		System.out.println("northindia");
	}

	public static void main(String[] args) {
		LanguageInfo language=new LanguageInfo();
		StateDetails state=new StateDetails();
		language.englishlanguage();
		language.hindilanguage();
		language.tamillanguage();
		state.northindia();
		state.southindia();
	}
}

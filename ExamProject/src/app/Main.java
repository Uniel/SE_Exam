package app;

public class Main {
	
	public static void main(String[] args) {
		App app = new App(); 
		UI ui = new UI(app); 
		ui.run();
	}
}

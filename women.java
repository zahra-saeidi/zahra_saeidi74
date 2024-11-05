package ir.isc.saeidi;

public class women {

	public static void main(String[] args) {
		String name = "reza";
		switch(name) {
		case " ali", "reza" -> System.out.println("Welcome Men");
		case "zahra", "behnaz" -> System.out.println("Welcom Women");
		default -> System.out.println("how are you");
		}

	}

}

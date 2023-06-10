class Compiletime{
	static void contact(String fname, long number) {
		System.out.println("Name : "+fname+"\nNumber : "+number);
 	}
	static void contact(String fname, String mailid) {
		System.out.println("Name : "+fname+"\nEmail : "+mailid);
	}
}
class Polymorphism{
    public static void main(String[] args) {
        Compiletime.contact("Sonu", 1234567890);
        System.out.print("\n");
        Compiletime.contact("Sonu", "sonu@mail.com");
    }
}

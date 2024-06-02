package library;

public class Main {

	public static void main(String[] args) {
		Ebook ebook=new Ebook("Denizler altında 20 bin fersah","Jules Verne", "124.312", "PDF", 204800);
		PrintedBook pb=new PrintedBook("COSMOS","Carl Sagan","321.125",200,2021);
		ebook.displayDetails();
		System.out.println("\n");
		pb.displayDetails();
	}

}

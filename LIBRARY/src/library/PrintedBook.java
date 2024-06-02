package library;

public class PrintedBook extends book{
	private int numberOfPages;
	private int yearOfPublication;
	
	

	public PrintedBook(String topic, String writer, String ISBN,int numberOfPages,int yearOfPublication) {
		super(topic, writer, ISBN);
		this.yearOfPublication=yearOfPublication;
		this.numberOfPages=numberOfPages;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void displayDetails() {
		System.out.println("Basılı kitap bilgileri: adı: "+
				this.getTopic() +"\nyazar: " +
				this.getWriter() + "\nISBN: " +
				this.getISBN() + "\nSayfa Sayısı: " +
				this.numberOfPages + "\nBasım Yılı: " +
				this.yearOfPublication
		);
		
	}

}

package library;

public class Ebook extends book{
	//file size in kilobytes
	private int fileSize;
	
	private String format;

	public Ebook(String topic, String writer, String ISBN, String format,int fileSize) {
		super(topic, writer, ISBN);
		this.fileSize=fileSize;
		this.format=format;
		
	}

	@Override
	public void displayDetails() {
		System.out.println("E Book bilgileri: adı: "+
				this.getTopic() +"\nyazar: " +
				this.getWriter() + "\nISBN: " +
				this.getISBN() + "\nformat: " +
				this.format + "\ndosya boyutu: " +
				this.fileSize
		);
		
	}

}

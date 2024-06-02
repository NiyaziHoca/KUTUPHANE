package library;

public abstract class book {
	private String topic;
	private String writer;
	private String ISBN;

	public book(String topic,String writer,String ISBN) {
		this.ISBN=ISBN;
		this.topic=topic;
		this.writer=writer;
		
	}// constructor sonu
	
	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public abstract void displayDetails();
	
}// class sonu

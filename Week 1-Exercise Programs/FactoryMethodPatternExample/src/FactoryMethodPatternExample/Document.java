package FactoryMethodPatternExample;

public interface Document {
	void create();
}

class WordDocument implements Document {
	public void create() {
		System.out.println("Creating Word Document in Word Factory");
	}
}

class PdfDocument implements Document {
	public void create() {
		System.out.println("Creating Pdf Document in Pdf Factory");
	}
}

class ExcelDocument implements Document {
	public void create() {
		System.out.println("Creating Excel Document in Excel Factory");
	}
}
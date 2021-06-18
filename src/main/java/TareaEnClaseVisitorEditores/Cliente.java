package TareaEnClaseVisitorEditores;

public class Cliente {

	public static void main(String[] args) {
		
		Word word = new Word();
		word.crear(new Documento("Word1", "aaa"));
		
		Sublime sublime = new Sublime();
		sublime.crear(new Documento("NotePad1", "bbbbb"));
		
		NotePad notePad = new NotePad();
		notePad.crear(new Documento("Sublime1", "cccccccccc"));

		GuardarFormatoPDF formatoPDF = new GuardarFormatoPDF();
		
		word.guardarPDF(formatoPDF);
		
		sublime.guardarPDF(formatoPDF);

		notePad.guardarPDF(formatoPDF);

	}

}

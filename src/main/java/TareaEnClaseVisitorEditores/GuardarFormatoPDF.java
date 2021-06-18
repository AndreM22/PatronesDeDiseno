package TareaEnClaseVisitorEditores;

public class GuardarFormatoPDF implements IGuardarPDF {

	@Override
	public void guardandoPDF(Word word) {
		System.out.println("***************");

		System.out.println("Guardando word en PDF");
		word.setPalabras(word.getDocumento().getContenido().split("").length);
		System.out.println("Numero de car�cteres: " + word.getPalabras());
	}

	@Override
	public void guardandoPDF(NotePad notePad) {
		System.out.println("***************");

		System.out.println("Guardando word en NotePad");
		notePad.setPalabras(notePad.getDocumento().getContenido().split("").length);
		System.out.println("Numero de car�cteres: " + notePad.getPalabras());

	}

	@Override
	public void guardandoPDF(Sublime sublime) {
		System.out.println("***************");

		System.out.println("Guardando word en Sublime");
		sublime.setPalabras(sublime.getDocumento().getContenido().split("").length);
		System.out.println("Numero de car�cteres: " + sublime.getPalabras());

	}

}

package EjercicioMediatorSkype;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


public class Skype implements ICanalDeComunicacion{

    private Map<Integer,Colleague> personasChat= new HashMap<Integer, Colleague>();
    private List<Integer> personasChatCi = new LinkedList<Integer>();

    public void addCollegue(Colleague c) {
    	personasChat.put(c.ci, c);
    	personasChatCi.add(c.ci);
    }
	@Override
	public void send(String message, Colleague colleague) {
		Colleague personaParseOrigen= colleague;
		for(int c:personasChatCi) {
			if(c!=personaParseOrigen.ci) {
				if(personaParseOrigen instanceof SM) {
					personasChat.get(c).messageReceived(message);
				}else if(personaParseOrigen instanceof QA && personasChat.get(c) instanceof QA) {
					personasChat.get(c).messageReceived(message);
				}else if(personaParseOrigen instanceof DEV && personasChat.get(c) instanceof DEV) {
					personasChat.get(c).messageReceived(message);
				}
			}
		}
		
	}

}

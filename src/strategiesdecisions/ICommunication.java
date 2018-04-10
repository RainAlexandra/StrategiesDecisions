package strategiesdecisions;

import java.util.List;

public interface ICommunication {
	public void diffuserMessage(String m);
	public void envoyerMessage(int emetteur, int desitinataire, String m);
	public List<String> recevoirMessage(int destinataire);
}
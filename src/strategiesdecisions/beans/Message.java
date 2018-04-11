package strategiesdecisions.beans;

/**
 * Messages are used by agents in order to communicate with each other
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public abstract class Message {
	String emetteur; // refAgent emetteur
	String destinataire; // refAgent destinataire
	String contenu;
}

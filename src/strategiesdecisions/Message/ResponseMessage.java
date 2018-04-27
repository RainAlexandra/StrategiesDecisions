package strategiesdecisions.Message;


import OCPlateforme.OCService;

import java.util.ArrayList;


public class ResponseMessage extends MessageAgent {

    /**
	 * Creer une réponse
	 * @param service
	 * 			service de l'agent qui répond
	 * @param expediteur
	 * 			reference de l'agent qui répond
     * @param destinataires
     * 		les references des agents destinataires. Si == Null, alors diffusion en Broadcast
	 */
    public ResponseMessage(OCService service, ReferenceAgent expediteur, ArrayList<ReferenceAgent> destinataires) {
		this.service = service;
		this.expediteur = expediteur;
		this.destinataires = destinataires;
    }

    @Override
    public OCService getService() {
        return this.service;
    }

    @Override
    public ReferenceAgent getExpediteur() {
        return this.expediteur;
    }

    @Override
	public AbstractPerception toPerception() {
		return null;
	}
    @Override
    public ArrayList<ReferenceAgent> getDestinataires() {
        return null;
    }

    @Override
    public String toString() {
        return "ResponseMessage{" +
                "service=" + service +
                ", expediteur=" + expediteur +
                ", destinataires=" + destinataires +
                '}';
    }
}

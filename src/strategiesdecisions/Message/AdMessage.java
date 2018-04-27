package strategiesdecisions.Message;

import java.util.ArrayList;

import OCPlateforme.OCService;

public class AdMessage extends MessageAgent {

    /**
	 * Creer une annonce
	 * @param service
	 * 			service de l'agent annonceur
	 * @param expediteur
	 * 			reference de l'agent annonceur
     * @param destinataires
     * 			les références des agents destinataires. Si == Null, alors diffusion en Broadcast
	 */
    public AdMessage(OCService service, ReferenceAgent expediteur, ArrayList<ReferenceAgent> destinataires) {
        this.service = service;
        this.expediteur = expediteur;
        this.destinataires = destinataires;
    }

    @Override
    public ReferenceAgent getExpediteur() {
        return this.expediteur;
    }

    @Override
    public OCService getService() {
        return this.service;
    }

    @Override
    public ArrayList<ReferenceAgent> getDestinataires() {
        return this.destinataires;
    }

    @Override
	public AbstractPerception toPerception() {
		return null;
	}

    @Override
    public String toString() {
        return "AdMessage{" +
                "service=" + service +
                ", expediteur=" + expediteur +
                ", destinataires=" + destinataires +
                '}';
    }
}

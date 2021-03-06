package strategiesdecisions.Message;

import OCPlateforme.OCService;

import java.util.ArrayList;

public class AgreementMessage extends MessageAgent {

    /**
     * Creer un message d'acceptation
     * @param service
     * 			service de l'agent annonceur
     * @param expediteur
     * 			reference de l'agent annonceur
     * @param destinataires
     * 			les references des agents destinataires. Si == Null, alors diffusion en Broadcast
     */
    public AgreementMessage(OCService service, ReferenceAgent expediteur, ArrayList<ReferenceAgent> destinataires) {
        this.expediteur = expediteur;
        this.destinataires = destinataires;
        this.service = service;
    }

    @Override
    public AbstractPerception toPerception() {
        return null;
    }

    @Override
    public ArrayList<ReferenceAgent> getDestinataires() {
        return this.destinataires;
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
    public String toString() {
        return "AgreementMessage{" +
                "service=" + service +
                ", expediteur=" + expediteur +
                ", destinataires=" + destinataires +
                '}';
    }
}

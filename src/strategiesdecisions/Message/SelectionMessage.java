package strategiesdecisions.Message;

import OCPlateforme.OCService;

import java.util.ArrayList;

public class SelectionMessage extends MessageAgent {
    private ReferenceAgent agentBinder; // La référence de l'agent Binder

    /**
     * créer un message de sélection
     * @param service
     * 			service de l'agent émétteur
     * @param expediteur
     * 			reference de l'agent qui émétteur
     * @param destinataires
     * 		les references des agents destinataires. Si == Null, alors diffusion en Broadcast
     */
    public SelectionMessage(OCService service, ReferenceAgent expediteur, ArrayList<ReferenceAgent> destinataires) {
        this.expediteur = expediteur;
        this.destinataires = destinataires;
        this.service = service;
    }

    public void setAgentBinder(ReferenceAgent agentBinder) {
        this.agentBinder = agentBinder;
    }

    public ReferenceAgent getAgentBinder() {
        return agentBinder;
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
    public OCService getService() {
        return this.service;
    }

    @Override
    public ArrayList<ReferenceAgent> getDestinataires() {
        return null;
    }

    @Override
    public String toString() {
        return "SelectionMessage{" +
                "agentBinder=" + agentBinder +
                ", service=" + service +
                ", expediteur=" + expediteur +
                ", destinataires=" + destinataires +
                '}';
    }
}

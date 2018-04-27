package strategiesdecisions.Message;

import OCPlateforme.OCService;

import java.util.ArrayList;

public class EmptyMessage extends MessageAgent {


    /**
     * Creer un message vide
     *
     */
    public EmptyMessage() {
        this.expediteur = null; // Aucun expéditeur car pas de messages
        this.service = null; // Aucun service géré
        this.destinataires = null;
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
        return this.destinataires;
    }

    @Override
    public String toString() {
        return "EmptyMessage{" +
                "service=" + service +
                ", expediteur=" + expediteur +
                ", destinataires=" + destinataires +
                '}';
    }
}

package strategiesdecisions.Message;


import OCPlateforme.OCService;


import java.util.ArrayList;

public class SondeMessage extends MessageAgent {

    private Boolean existe; // variable boolean pour dire est ce que le service géré par l'agent existe ou pas

    /**
     *
     * @param existe
     * 			boolean pour dire est ce que le service géré par l'agent existe encore dans l'environnement ou pas
     * @param destinataires
     * 		les references des agents destinataires. Si == Null, alors diffusion en Broadcast
     */
    public SondeMessage(Boolean existe, ArrayList<ReferenceAgent> destinataires) {
        this.expediteur = null; // Expediteur est la "sonde"
        this.service = null; // Expediteur est la "sonde" --> il n'y a pas de service géré
        this.destinataires = destinataires;
        this.existe = existe;
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
        return "SondeMessage{" +
                "existe=" + existe +
                ", service=" + service +
                ", expediteur=" + expediteur +
                ", destinataires=" + destinataires +
                '}';
    }
}

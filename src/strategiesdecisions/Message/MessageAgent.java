package strategiesdecisions.Message;

import OCPlateforme.OCService;

import java.util.ArrayList;

public abstract class MessageAgent implements IMessageAgent {

      protected OCService service;
      protected ReferenceAgent expediteur;
      protected ArrayList<ReferenceAgent> destinataires; // La liste des déstinataires du message --> il peut être un seul agent ou plusieurs, si = null -> en diffusiion broadcast

      public abstract AbstractPerception toPerception();
      public abstract OCService getService();
}

package strategiesdecisions.Message;


import javax.security.auth.Refreshable;
import java.util.ArrayList;

public interface IMessageAgent {

    ReferenceAgent getExpediteur();
    AbstractPerception toPerception();
    ArrayList<ReferenceAgent> getDestinataires();
}

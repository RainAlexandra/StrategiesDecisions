package strategiesdecisions;

import java.util.List;

import strategiesdecisions.beans.Message;
import strategiesdecisions.beans.MessageType;

public class Utility {
	public static boolean findEvent(List<Message> msgs){
		for (Message m : msgs){
			if (m.getMsgType() == MessageType.EVENT)
				return true;
		}
		return false;
	}
}

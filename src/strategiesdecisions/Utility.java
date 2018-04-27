package strategiesdecisions;

import java.util.List;

import strategiesdecisions.Message.MessageAgent;
import strategiesdecisions.Message.MessageType;

public class Utility {
	public static boolean findEvent(List<MessageAgent> msgs){
		for (MessageAgent m : msgs){
			if (m.getMsgType() == MessageType.EVENT)
				return true;
		}
		return false;
	}
}

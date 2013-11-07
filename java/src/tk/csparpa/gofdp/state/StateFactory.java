package tk.csparpa.gofdp.state;

import java.util.HashMap;
import java.util.Map;

/**
 * Factory that handles State flyweights
 */
public class StateFactory {
	
	private Map<String, State> states;
	
	public StateFactory(){
		states = new HashMap<String, State>();
		states.put("unversioned", new UnversionedState());
		states.put("staged", new StagedState());
		states.put("committed", new CommittedState());
	}
	
	public State getState(String type){
		return states.get(type);
	}
}

package tk.csparpa.gofdp.proxy;

import java.util.List;

/**
 * This is the Proxy that will be handling access to a ConcreteSubject instance,
 * which is the object "represented by" the proxy. Here are shown a few
 * proxy tipologies. 
 */
public class Proxy extends AbstractSubject {
	
	ConcreteSubject real;
	String fileName;
	List<String> usersAllowedToRename;
	
	int cachedLineNumber;
	String cachedLine;
	
	public Proxy(String fileName, List<String> usersAllowedToRename) {
		this.fileName = fileName;
		this.usersAllowedToRename = usersAllowedToRename;
	}

	@Override
	public String getContent() {
		//Check if represented object has already been instantiated:
		//if not, instantiate it - virtual proxying
		if(real == null){
			real = new ConcreteSubject(fileName);
		}
		//delegate the heavy-weight operation to the represented object
		return real.getContent();
	}
	
	private boolean isAllowed(String username){
		return usersAllowedToRename.contains(username);
	}

	@Override
	public void rename(String username, String newName) {
		//Check access permissions: protection proxy
		if(isAllowed(username)){
			if(real == null){
				real = new ConcreteSubject(fileName);
			}
			real.rename(username, newName);
		}
		else{
			//One should throw and exception here
			System.out.println("Renaming not allowed for user "+username);
		}
	}
	
	@Override
	public String getLine(int lineNumber){
		//check if the desired data chunk is already cached - cache proxying
		if(lineNumber == cachedLineNumber){
			return cachedLine;
		}
		else{
			if(real == null){
				real = new ConcreteSubject(fileName);
			}
			cachedLineNumber = lineNumber;
			cachedLine = real.getLine(lineNumber);
			return cachedLine;
		}
	}
}
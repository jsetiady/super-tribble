package tribble.base.model;

/**
 * Created by jsetiady
 * Last modified: 10/03/2017
 *
 */
abstract class User 
{
    private String id;
    private String name;
    private String password;
    private boolean isAdmin;
    
    public User(String id, String name, String password, boolean isAdmin) {
    	this.id = id;
    	this.name = name;
    	this.password = password;
    	this.isAdmin = isAdmin;
    }
    
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean isAdmin() {
		return isAdmin;
	}
	
	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
    
    
}

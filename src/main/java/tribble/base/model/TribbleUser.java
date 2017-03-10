package tribble.base.model;

/**
 * Created by jsetiady
 * Last modified: 10/03/2017
 *
 */
public class TribbleUser extends User {
	
	private String joinDate;
	
	public TribbleUser(String id, String name, String password, boolean isAdmin) {
		super(id, name, password, isAdmin);
		// TODO Auto-generated constructor stub
	}

	public TribbleUser(String id, String name, String password, boolean isAdmin, String joinDate) {
		super(id, name, password, isAdmin);
		this.joinDate = joinDate;
	}
	
	public String getJoinDate() {
		return this.joinDate;
	}
	
	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}
	
}

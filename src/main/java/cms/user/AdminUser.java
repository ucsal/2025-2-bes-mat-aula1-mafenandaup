package cms.user;

public class AdminUser extends User {

	public AdminUser(int id, String nome, String email, String password) {
		super( id, nome, email, password);
	}

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getEmail() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean checkPassword(String p) {
		// TODO Auto-generated method stub
		return false;
	}

	public void deleteContent(int contentId) {
	/* exclusivo do admin */ }

}

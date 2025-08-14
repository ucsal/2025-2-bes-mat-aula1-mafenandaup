package cms.user;

public abstract class User {
	
	private final int id;
	private final String nome;
	private final String email;
	private final String password;

	public User(int id, String nome, String email, String password) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.password = password;
	}

	public abstract int getId();
	public abstract String getNome();
	public abstract String getEmail();
	public abstract boolean checkPassword(String p);

}

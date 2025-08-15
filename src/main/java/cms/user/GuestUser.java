package cms.user;

public class GuestUser extends User {

	public GuestUser(int id, String nome, String email, String password) {
        super(id, nome, email, password);
    }

	public void viewContent(int contentId) {
		System.out.println("conteúdo "+contentId+" (A EDITAR) mostrado com sucesso!");
}
}

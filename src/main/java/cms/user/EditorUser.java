package cms.user;

public class EditorUser extends User {

	public EditorUser(int id, String nome, String email, String password) {
        super(id, nome, email, password);
    }


	public void editContent(int contentId, String body) {
		if (body == null || body.isBlank()) {
	        throw new IllegalArgumentException("Não são permitidos campos vazios.");
	    }
	    System.out.println("Conteúdo editado com sucesso! ID: " + contentId + ". corpo: " + body);
		}
}


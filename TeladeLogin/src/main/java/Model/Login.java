package Model;

public class Login {
	 private String usuario;
	    private String senha;

	public Login (String user , String senha){
	     super();
	    this.senha = senha;
	    this.usuario = user;

	}

	public Login(){
	    super();
	}

	    public void setUsuario(String user){

	        this.usuario = user;
	    }
	public String getUsuario(){

	    return usuario;
	}

	public void setSenha(String senha){
	    this.senha = senha;
	}

	public String getSenha(){

	    return senha;
	}

}

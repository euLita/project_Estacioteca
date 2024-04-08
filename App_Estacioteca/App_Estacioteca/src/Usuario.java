public class Usuario {
    int id_usuario;
    String nome_usu;
    public Usuario( int id_usuario, String nome_usu){
        this.id_usuario = id_usuario;
        this.nome_usu = nome_usu;

        System.out.println("ID do usuário :" +id_usuario);
        System.out.println("Nome do usuário :" +nome_usu);
    }
}
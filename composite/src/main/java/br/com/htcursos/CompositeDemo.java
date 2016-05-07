package br.com.htcursos;

public class CompositeDemo {
	public static StringBuffer identacao = new StringBuffer();

    public static void main(String[] args)
    {
        Diretorio faculdade = new Diretorio("faculdade");
        Diretorio cursos = new Diretorio("cursos");
        Diretorio trabalho = new Diretorio("trabalho");
        Doc compiladores = new Doc("compiladores.doc");
        Doc redes = new Doc("redes.doc");
        Doc testes = new Doc("testes.doc");
        Doc algoritimos = new	Doc("algoritimos.doc");
        Doc java = new Doc("java.doc");

        faculdade.adicionar(compiladores);
        faculdade.adicionar(cursos);
        faculdade.adicionar(redes);

        cursos.adicionar(testes);
        cursos.adicionar(algoritimos);
        cursos.adicionar(trabalho);

        trabalho.adicionar(java);

        faculdade.exibir();

        trabalho.exibir();
    }
}

package br.com.htcursos;

public class CompositeDemo {
	public static StringBuffer identacao = new StringBuffer();

    public static void main(String[] args)
    {
        Diretorio one = new Diretorio("dir111"), two = new Diretorio("dir222"),
          thr = new Diretorio("dir333");
        Doc a = new Doc("a"), 
        b = new Doc("b"), c = new Doc("c"), d = new
        		Doc("d"), e = new Doc("e");
        one.adicionar(a);
        one.adicionar(two);
        one.adicionar(b);
        two.adicionar(c);
        two.adicionar(d);
        two.adicionar(thr);
        thr.adicionar(e);
        one.exibirDiretorio();
    }
}

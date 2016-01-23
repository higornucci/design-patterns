package br.com.htcursos;

import java.util.HashMap;
import java.util.Map;

public class FabricaDeLetras {
	private Map<Character, Letra> letras = new HashMap<Character, Letra>();

	public Letra getLetra(Character chave) {
		Letra letra = null;
		if (letras.containsKey(chave)) {
			letra = letras.get(chave);
		} else {
			switch (chave) {
			case 'A':
				letra = new LetraA();
				break;
			case 'B':
				letra = new LetraB();
				break;
			case 'Z':
				letra = new LetraZ();
				break;
			}
			letras.put(chave, letra);
		}
		return letra;
	}
}

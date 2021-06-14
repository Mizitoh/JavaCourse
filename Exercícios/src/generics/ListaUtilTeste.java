package generics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {
	public static void main(String[] args) {
		
		//sem generics
		
		List<String> langs = Arrays.asList("JAva", "JS", "PHP", "C#");
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);
		
		String ultimaLinguagem = (String) ListaUtil.getUtil1(langs);
		System.out.println(ultimaLinguagem);
		
		Integer ultimoNumero = (Integer) ListaUtil.getUtil1(nums);
		System.out.println(ultimoNumero);
		
		// com generics, eliminamos o cast
		
		String ultimaLinguagem2 = ListaUtil.getUtil2(langs);
		System.out.println(ultimaLinguagem2);
		
		Integer ultimoNumero2 = ListaUtil.getUtil2(nums);
		System.out.println(ultimoNumero2);
	}

}

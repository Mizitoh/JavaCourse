package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		HashSet conjunto =new HashSet();
		
		conjunto.add(1.2); // automaticamente o java converte os primitivos para os whrapers
		conjunto.add(true); 
		conjunto.add("teste");
		conjunto.add(1);  // ex in para Integer
		conjunto.add("x");
		
		System.out.println("Tamanho é: " + conjunto.size());
		
		conjunto.add("x");
		System.out.println("Tamanho é: " + conjunto.size());
		// mantem o mesmo tamanho pq nao aceita repetição
		
		System.out.println("Tamanho é: " + conjunto.remove(1));
		System.out.println("Tamanho é: " + conjunto.size());
		System.out.println("Tamanho é: " + conjunto.contains(1));
		
		Set nums =new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		
		System.out.println(nums);
		System.out.println(conjunto);
		conjunto.addAll(nums);
		// uniao dos dois conjuntos
		System.out.println(conjunto);
		conjunto.retainAll(nums);
		System.out.println(conjunto);
		//retem valores iguais ou mantes os adicionados caso nao tenha nenhum
		
		conjunto.clear();
		System.out.println(conjunto);
	}
}

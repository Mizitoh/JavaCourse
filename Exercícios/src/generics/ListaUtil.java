package generics;

import java.util.List;

public class ListaUtil {
	
	public static Object getUtil1(List<?> lista) {
		return lista.get(lista.size()-1);
	}
	
	//Nao preciso me preocupar com cast
	public static <T> T getUtil2(List<T> lista) {
		return lista.get(lista.size()-1);
	}

}

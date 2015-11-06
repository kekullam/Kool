package praktikum10;

public class Rekursioon {

	public static void main(String[] args) {
		System.out.println(astenda(2, 10));

	}

	public static int astenda(int arv, int aste) {
		if (aste == 0) {
			return 1;
		} else {
		return arv * astenda(arv, aste-1);
		}
	
	}

}

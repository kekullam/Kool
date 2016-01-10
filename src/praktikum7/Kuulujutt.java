package praktikum7;

public class Kuulujutt {


		public static void main(String[] args){
			String[] nimed1 = {"Kati", "Tiina", "Liisu", "Nele"};
			String[] tegus6nad = {"Paneb", "Leiab", "Näeb", "Teab"};
			String[] nimed2 = {"T6nu", "Martin", "Margus"};

			System.out.println(nimed1[ranGen(nimed1.length)] + " " +
					tegus6nad[ranGen(tegus6nad.length)] + " " +
					nimed2[ranGen(nimed2.length)]);
		}

		private static int ranGen(int _length){
			return (int) (Math.random() * _length);
		}

	}



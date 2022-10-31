package SecurityManager.com;

import java.util.Random;

public class Seguridad {

	static int contadorMayusculas, contadorMinusculas, contadorCaracteres, contadorNumeros;
	static String password = "";

	public Seguridad() {

	}

	public String generarPassword(int longitud) {

		Random random = new Random();

		for (int i = 0; i < longitud; i++) {

			char caracter = (char) (33 + random.nextInt((126 + 1) - 33));

			if (contadorMayusculas < 5) {
				password += caracter;
				System.out.println(password);
				contadorMayusculas++;
			} else if (contadorMinusculas < 5) {
				password += caracter;
				System.out.println(password);
				contadorMinusculas++;
			} else if (contadorCaracteres < 4) {
				password += caracter;
				System.out.println(password);
				contadorCaracteres++;
			} else if (contadorNumeros < 4) {
				password += caracter;
				System.out.println(password);
				contadorNumeros++;
			}

		}

		return password;

	}

	static String cadenaCaracteres() {
		try {
			return password;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return password;

	}

	static String passwordFuerte() {

		@SuppressWarnings("unused")
		Random random = new Random();

		for (int i = 0; i < 18; i++) {

			if (i < 5) {

			} else if (i >= 5 && i < 10) {

			} else if (i >= 10 && i < 14) {

			}

		}
		return password;

	}

}
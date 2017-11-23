public class Main {

	public static void main(String[] args) {
		Consola c = new Consola();
		c.inicializar();
		//Capturar un dato
		Senal s = new Senal();
		s.x = 100;
		c.recibir(s,0);
		System.out.println(c.salida());

	}

}


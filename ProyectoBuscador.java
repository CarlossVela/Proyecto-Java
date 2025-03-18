package Proyecto;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ProyectoBuscador {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		
		// Aqui creamos los numeros necesarios para introducir las opciones y un boolean para el bucle del menu
				int anyoLanzamiento;
				int numeroOperacion;
				int numeroOperacionAnyo;
				boolean confirmacion = false;
				
				// Aqui hemos creado el array de los juegos con sus caracteristicas, hemos considerado que 90 son mas que necesarios, aunque se podría introducir mas de ser necesario

		Juego[] juegos = new Juego[90];

		juegos[0] = new Juego("ELDEN RING", "ACCIÓN", 96, 2022, "PS, XBOX, PC", "FROMSOFTWARE");
		juegos[1] = new Juego("BLOODBORNE", "ACCIÓN", 92, 2015, "PS", "FROMSOFTWARE");
		juegos[2] = new Juego("SEKIRO: SHADOWS DIE TWICE", "AVENTURA", 90, 2019, "PS, XBOX, PC", "FROMSOFTWARE");
		juegos[3] = new Juego("DARK SOULS", "ACCIÓN", 89, 2011, "PS, XBOX, PC", "PLAYSTATION STUDIOS");
		juegos[4] = new Juego("THE LAST OF US PART 1", "AVENTURA", 95, 2022, "PS, PC", "PLAYSTATION STUDIOS");
		juegos[5] = new Juego("THE LAST OF US PART 2", "AVENTURA", 93, 2020, "PS", "PLAYSTATION STUDIOS");
		juegos[6] = new Juego("GRAND THEFT AUTO III", "ACCIÓN", 97, 2001, "PS, XBOX, PC", "ROCKSTAR GAMES");
		juegos[7] = new Juego("GRAND THEFT AUTO IV", "ACCIÓN", 98, 2008, "PS, XBOX, PC", "ROCKSTAR GAMES");
		juegos[8] = new Juego("GRAND THEFT AUTO V", "ACCIÓN", 96, 2013, "PS, XBOX, PC", "ROCKSTAR GAMES");
		juegos[9] = new Juego("GOD OF WAR (2018)", "AVENTURA", 94, 2018, "PS, PC", "PLAYSTATION STUDIOS");
		juegos[10] = new Juego("GOD OF WAR: RAGNAROK", "AVENTURA", 94, 2022, "PS, PC", "PLAYSTATION STUDIOS");
		juegos[11] = new Juego("HORIZON ZERO DAWN", "ACCIÓN", 89, 2017, "PS, PC", "PLAYSTATION STUDIOS");
		juegos[12] = new Juego("HORIZON FORBIDDEN WEST", "ACCIÓN", 88, 2022, "PS, PC", "PLAYSTATION STUDIOS");
		juegos[13] = new Juego("SPIDER-MAN (PS4/PS5)", "ACCIÓN", 87, 2018, "PS, PC", "PLAYSTATION STUDIOS");
		juegos[14] = new Juego("SPIDER-MAN 2 (PS5)", "ACCIÓN", 91, 2023, "PS, PC", "PLAYSTATION STUDIOS");
		juegos[15] = new Juego("SUPER MARIO ODYSSEY", "AVENTURA", 97, 2017, "SWITCH", "NINTENDO");

		juegos[16] = new Juego("THE LEGEND OF ZELDA: BREATH OF THE WILD", "AVENTURA", 97, 2017, "NINTENDO SWITCH",
				"NINTENDO");
		juegos[17] = new Juego("THE LEGEND OF ZELDA: TEARS OF THE KINGDOM", "AVENTURA", 96, 2023, "NINTENDO SWITCH",
				"NINTENDO");
		juegos[18] = new Juego("SONIC FRONTIERS", "AVENTURA", 75, 2022, "PS, XBOX, NINTENDO SWITCH, PC", "SEGA");
		juegos[19] = new Juego("PERSONA 3 Reload", "RPG", 88, 2024, "PS, XBOX, SWITCH", "SEGA");
		juegos[20] = new Juego("PERSONA 4 Golden", "RPG", 93, 2012, "PS2, XBOX, SWITCH", "SEGA");
		juegos[21] = new Juego("PERSONA 5 Royal", "RPG", 95, 2021, "PS, XBOX, SWITCH", "SEGA");
		juegos[22] = new Juego("GRAN TURISMO 7", "DEPORTIVO", 87, 2022, "PS", "PLAYSTATION STUDIOS");
		juegos[23] = new Juego("FORZA HORIZON 3", "DEPORTIVO", 91, 2016, "XBOX, PC", "MICROSOFT STUDIOS");
		juegos[24] = new Juego("FORZA HORIZON 4", "DEPORTIVO", 92, 2018, "XBOX, PC", "MICROSOFT STUDIOS");
		juegos[25] = new Juego("FORZA HORIZON 5", "DEPORTIVO", 92, 2021, "XBOX, PC", "MICROSOFT STUDIOS");
		juegos[26] = new Juego("HALO: THE MASTER CHIEF COLLECTION", "SHOOTER", 85, 2014, "XBOX, PC",
				"MICROSOFT STUDIOS");
		juegos[27] = new Juego("HALO INFINITE", "SHOOTER", 87, 2021, "XBOX, PC", "MICROSOFT STUDIOS");
		juegos[28] = new Juego("ASSASSIN’S CREED: THE EZIO COLLECTION", "AVENTURA", 80, 2016, "PS, XBOX, SWITCH",
				"UBISOFT");
		juegos[29] = new Juego("PRINCE OF PERSIA: THE LOST CROWN", "AVENTURA", 86, 2024, "PS, XBOX, PC, SWITCH",
				"UBISOFT");
		juegos[30] = new Juego("WATCH DOGS", "ACCIÓN", 77, 2014, "PS, XBOX, PC", "UBISOFT");
		juegos[31] = new Juego("WATCH DOGS 2", "ACCIÓN", 81, 2016, "PS4, XBOX, PC", "UBISOFT");

		juegos[32] = new Juego("FIFA 24", "DEPORTIVO", 77, 2023, "PS, XBOX, PC, SWITCH", "EA");
		juegos[33] = new Juego("F1 23", "DEPORTIVO", 82, 2023, "PS, XBOX, PC", "EA");
		juegos[34] = new Juego("MADDEN NFL 24", "DEPORTIVO", 70, 2023, "PS, XBOX, PC", "EA");
		juegos[35] = new Juego("RED DEAD REDEMPTION", "ACCIÓN", 95, 2010, "PS, XBOX", "ROCKSTAR GAMES");
		juegos[36] = new Juego("RED DEAD REDEMPTION 2", "ACCIÓN", 97, 2018, "PS, XBOX, PC", "ROCKSTAR GAMES");
		juegos[37] = new Juego("FORSPOKEN", "ACCIÓN", 64, 2023, "PS, PC", "SQUARE ENIX");
		juegos[38] = new Juego("CONCORD", "ACCIÓN", 63, 2024, "PS, PC", "PLAYSTATION STUDIOS");
		juegos[39] = new Juego("FINAL FANTASY XV", "RPG", 81, 2016, "PS, XBOX, PC", "SQUARE ENIX");
		juegos[40] = new Juego("FINAL FANTASY XVI", "RPG", 87, 2023, "PS", "SQUARE ENIX");
		juegos[41] = new Juego("DRAGON QUEST XI", "RPG", 91, 2017, "SWITCH, PC, PS, XBOX", "SQUARE ENIX");
		juegos[42] = new Juego("GRAND THEFT AUTO TRILOGY (REMASTERIZADO)", "ACCIÓN", 53, 2021, "PS, XBOX, SWITCH, PC",
				"ROCKSTAR GAMES");
		juegos[43] = new Juego("CALL OF DUTY: BLACK OPS 2", "SHOOTER", 83, 2012, "PS, XBOX, PC", "MICROSOFT STUDIOS");
		juegos[44] = new Juego("CALL OF DUTY: BLACK OPS 3", "SHOOTER", 81, 2015, "PS, XBOX, PC", "MICROSOFT STUDIOS");
		juegos[45] = new Juego("CALL OF DUTY: BLACK OPS 4", "SHOOTER", 83, 2018, "PS, XBOX, PC", "MICROSOFT STUDIOS");
		juegos[46] = new Juego("CALL OF DUTY: BLACK OPS COLD WAR", "SHOOTER", 76, 2020, "PS, XBOX, PC",
				"MICROSOFT STUDIOS");
		juegos[47] = new Juego("CALL OF DUTY: BLACK OPS 6", "SHOOTER", 83, 2024, "PS, XBOX, PC", "MICROSOFT STUDIOS");
		juegos[48] = new Juego("SILENT HILL 2", "TERROR", 89, 2001, "PS", "KONAMI");
		juegos[49] = new Juego("SUPER MARIO GALAXY", "PLATAFORMAS", 97, 2007, "WII", "NINTENDO");
		juegos[50] = new Juego("PORTAL", "PUZZLE", 90, 2007, "PC, XBOX, PS", "VALVE");
		juegos[51] = new Juego("PORTAL 2", "PUZZLE", 95, 2011, "PC, XBOX, PS", "VALVE");
		juegos[52] = new Juego("HALF-LIFE", "SHOOTER", 96, 1998, "PC", "VALVE");
		juegos[53] = new Juego("HALF-LIFE 2", "SHOOTER", 96, 2004, "PC, XBOX", "VALVE");
		juegos[54] = new Juego("RESIDENT EVIL 2 REMAKE", "TERROR", 91, 2019, "PS, XBOX, PC", "CAPCOM");
		juegos[55] = new Juego("RESIDENT EVIL 4 REMAKE", "TERROR", 93, 2023, "PS, XBOX, PC", "CAPCOM");
		juegos[56] = new Juego("UNCHARTED 4: A THIEF'S END", "AVENTURA", 93, 2016, "PS", "PLAYSTATION STUDIOS");
		juegos[57] = new Juego("METAL GEAR SOLID 3: SNAKE EATER", "SIGILO", 91, 2004, "PS", "KONAMI");
		juegos[58] = new Juego("METAL GEAR SOLID 2: SONS OF LIBERTY", "SIGILO", 96, 2001, "PS", "KONAMI");
		juegos[59] = new Juego("NINTENDOGS", "SIMULACIÓN", 85, 2005, "NINTENDO DS", "NINTENDO");
		juegos[60] = new Juego("WII SPORTS", "DEPORTIVO", 81, 2006, "WII", "NINTENDO");
		juegos[61] = new Juego("THE LEGEND OF ZELDA: TWILIGHT PRINCESS", "AVENTURA", 95, 2006, "WII", "NINTENDO");
		juegos[62] = new Juego("SUPER SMASH BROS. BRAWL", "LUCHA", 93, 2008, "WII", "NINTENDO");
		juegos[63] = new Juego("SUPER MARIO GALAXY", "PLATAFORMAS", 97, 2007, "WII", "NINTENDO");
		juegos[64] = new Juego("MARIO KART WII", "CARRERAS", 85, 2008, "WII", "NINTENDO");
		juegos[65] = new Juego("POKÉMON DIAMOND", "RPG", 91, 2006, "NINTENDO DS", "GAME FREAK");
		juegos[66] = new Juego("MARIO KART DS", "CARRERAS", 91, 2005, "NINTENDO DS", "NINTENDO");
		juegos[67] = new Juego("THE LEGEND OF ZELDA: PHANTOM HOURGLASS", "AVENTURA", 90, 2007, "NINTENDO DS",
				"NINTENDO");
		juegos[68] = new Juego("NEW SUPER MARIO BROS.", "PLATAFORMAS", 89, 2006, "NINTENDO DS", "NINTENDO");
		juegos[69] = new Juego("ANIMAL CROSSING: WILD WORLD", "SIMULACIÓN", 85, 2005, "NINTENDO DS", "NINTENDO");
		juegos[70] = new Juego("HALO 3", "SHOOTER", 94, 2007, "XBOX", "MICROSOFT STUDIOS");
		juegos[71] = new Juego("HALO REACH", "SHOOTER", 91, 2010, "XBOX", "MICROSOFT STUDIOS");
		juegos[72] = new Juego("GOW: JUDGMENT", "ACCIÓN", 80, 2013, "XBOX", "MICROSOFT STUDIOS");
		juegos[73] = new Juego("FABLE II", "RPG", 89, 2008, "XBOX", "MICROSOFT STUDIOS");
		juegos[74] = new Juego("FABLE III", "RPG", 82, 2010, "XBOX", "MICROSOFT STUDIOS");
		juegos[75] = new Juego("Gears of War 4", "ACCIÓN", 84, 2016, "XBOX, PC", "MICROSOFT STUDIOS");
		juegos[76] = new Juego("SUNSET OVERDRIVE", "ACCIÓN", 81, 2014, "XBOX", "MICROSOFT STUDIOS");
		juegos[77] = new Juego("LITTLEBIGPLANET", "PLATAFORMAS", 93, 2008, "PS", "PLAYSTATION STUDIOS");
		juegos[78] = new Juego("LITTLEBIGPLANET 2", "PLATAFORMAS", 92, 2011, "PS", "PLAYSTATION STUDIOS");
		juegos[79] = new Juego("UNCHARTED: DRAKE'S FORTUNE", "AVENTURA", 88, 2007, "PS", "PLAYSTATION STUDIOS");
		juegos[80] = new Juego("UNCHARTED 2: AMONG THIEVES", "AVENTURA", 96, 2009, "PS", "PLAYSTATION STUDIOS");
		juegos[81] = new Juego("UNCHARTED 3: DRAKE'S DECEPTION", "AVENTURA", 93, 2011, "PS", "PLAYSTATION STUDIOS");
		juegos[82] = new Juego("GRAN TURISMO 5", "DEPORTIVO", 92, 2010, "PS", "PLAYSTATION STUDIOS");
		juegos[83] = new Juego("GRAN TURISMO 6", "DEPORTIVO", 88, 2013, "PS", "PLAYSTATION STUDIOS");
		juegos[84] = new Juego("DEMOS: GOD OF WAR (2018)", "AVENTURA", 94, 2018, "PS", "PLAYSTATION STUDIOS");
		juegos[85] = new Juego("BLOODBORNE", "ACCIÓN", 92, 2015, "PS", "FROM SOFTWARE");
		juegos[86] = new Juego("GOD OF WAR: RAGNAROK", "AVENTURA", 94, 2022, "PS", "PLAYSTATION STUDIOS");
		juegos[87] = new Juego("MARIO KART 8 DELUXE", "CARRERAS", 92, 2017, "SWITCH", "NINTENDO");
		juegos[88] = new Juego("SUPER MARIO PARTY", "FAMILIA", 80, 2018, "SWITCH", "NINTENDO");
		juegos[89] = new Juego("ZELDA: BREATH OF THE WILD", "AVENTURA", 97, 2017, "SWITCH", "NINTENDO");

		do {
			do {

				while (true) {
					// Usamos un while para repetir la opcion si se introduce un número incorrecto o una palabra la cual no deberia ser admitida. 
					// Habrá un total de 7 opciones representadas por sus números correspondientes. Hemos usado switchs para el resto del codigo.
					// Usamos el metodo override para sobreescribir el metodo Comparator y cambiarlo por un compare. Lo usaremos durante el resto del codigo
					// Gracias al Comparator (ahora nombrado compare) podemos comparar las caracteristicas de un objeto (como ordenarlos de mayor a menor, ordenar alfabeticamente, etc)

					System.out.println(
							"Bienvenido al buscador de videojuegos personalizado. Seleccione la opción con la que desea empezar su búsqueda.");
					System.out.println("1- Buscar por nombre:");
					System.out.println("2- Buscar por nota:");
					System.out.println("3- Buscar por año de lanzamiento:");
					System.out.println("4- Buscar por género:");
					System.out.println("5- Buscar por consola:");
					System.out.println("6- Buscar por desarolladora:");
					System.out.println("7 - ¿Quieres finalizar la busqueda?");

					if (teclado.hasNextInt()) {
						numeroOperacion = teclado.nextInt();
						break;
					} else {
						System.out.println("Entrada inválida. Por favor, ingrese un número.");
						teclado.next(); 
					}
				}

				if (numeroOperacion < 1 || numeroOperacion > 7) {
					System.out.println("Opción inválida. Intente de nuevo.\n");
				}

			} while (numeroOperacion < 1 || numeroOperacion > 7);

			switch (numeroOperacion) {
			case 1:
				int opcionOrden = 0;
				do {

					while (true) {
						// Volvemos a usar el metodo while para verificar la entrada. Se usara siempre a partir de ahora con lo cual no repetire mas esta frase.
						// Tenemos tres opciones disponibles. 

						System.out.println("1- Buscar por nombre: ");
						System.out.println("2- Opción (A-Z)");
						System.out.println("3- Opción (Z-A)");

						if (teclado.hasNextInt()) {
							opcionOrden = teclado.nextInt();
							break; //
						} else {
							System.out.println("Entrada inválida. Por favor, ingrese un número.");
							teclado.next();
						}
					}

					if (opcionOrden < 1 || opcionOrden > 3) {
						System.out.println("Opción incorrecta. Por favor, elige una opción entre 1 y 3.");

					}
				} while (opcionOrden > 3 || opcionOrden < 1);

				teclado.nextLine();
				if (opcionOrden == 1) {
					System.out.println("Introduzca el nombre a buscar: ");
					String nombreJuego = teclado.nextLine();
					nombreJuego = nombreJuego.trim().toUpperCase();
					// Usamos el metodo trim y to uppercase por si el usuario introduce espacios y para que se coloque en mayusculas como el nombre del juego a continuacion.

					boolean encontrado = false;
					for (Juego juego : juegos) {
						// Usamos el contains para que sea solo que lo contiene, ya que por ejemplo usando el equals deberian introducirse datos precisos y no se encontrarian.

						if (juego.getNombre().toUpperCase().contains(nombreJuego)) {
							System.out.println("Juego encontrado: " + juego.getNombre() + " - " + juego.getGenero()
									+ " - " + juego.getNota() + " - " + juego.getAnyoLanzamiento() + " - "
									+ juego.getConsola() + " - " + juego.getDesarollador());
							encontrado = true;

						}
					}
					if (!encontrado) {
						System.out.println("No se encontró ningún juego con el nombre: " + nombreJuego);
					}
				}

				if (opcionOrden == 2) {
					Arrays.sort(juegos, new Comparator<Juego>() {
						@Override
						public int compare(Juego j1, Juego j2) {
							// Orden ascendente (A-Z)
							return j1.getNombre().compareTo(j2.getNombre());

						}
					});
					System.out.println("Juegos ordenados por nombre:");
					for (Juego juego : juegos) {
						System.out.println(juego.getNombre());
					}

				} else if (opcionOrden == 3) {
					Arrays.sort(juegos, new Comparator<Juego>() {
						@Override
						public int compare(Juego j1, Juego j2) {
							// Orden descendente (Z-A)
							return j2.getNombre().compareTo(j1.getNombre());
						}
					});

					System.out.println("Juegos ordenados por nombre:");
					for (Juego juego : juegos) {
						System.out.println(juego.getNombre());
					}
				}

				break;

			case 2:

				int casoOrdenado;

				do {

					while (true) {
						// Aqui tenemos tres opciones para ordenar la nota y una final para buscar juegos por nota en concreto. 

						System.out.println("¿Cómo deseas ordenar las notas? (Escribe el número de la opción)");
						System.out.println("1: De mayor a menor");
						System.out.println("2: De menor a mayor");
						System.out.println("3: Por nota enconcreta");

						if (teclado.hasNextInt()) {
							casoOrdenado = teclado.nextInt();
							break; //
						} else {
							System.out.println("Entrada inválida. Por favor, ingrese un número.");
							teclado.next();
						}
					}

					if (casoOrdenado != 1 && casoOrdenado != 2 && casoOrdenado != 3) {
						System.out.println("Opción inválida. Intente de nuevo.");
					}
				} while (casoOrdenado != 1 && casoOrdenado != 2 && casoOrdenado != 3);
				switch (casoOrdenado) {
				case 1:
					Arrays.sort(juegos, new Comparator<Juego>() {
						@Override
						public int compare(Juego j1, Juego j2) {
							return Integer.compare(j2.getNota(), j1.getNota());
						}
					});
					System.out.println("Juegos ordenados por nota (de mayor a menor):");
					for (Juego juego : juegos) {
						System.out.println(juego.getNombre()+" | "+juego.getNota());
					}
					break;
				case 2:
					Arrays.sort(juegos, new Comparator<Juego>() {
						@Override
						public int compare(Juego j1, Juego j2) {
							return Integer.compare(j1.getNota(), j2.getNota());
						}
					});
					System.out.println("Juegos ordenados por nota (de menor a mayor):");
					for (Juego juego : juegos) {
						System.out.println(juego.getNombre()+" | "+juego.getNota());
					}
					break;
				case 3:
					int notaBuscar = 0;
					System.out.print("Introduzca la nota: ");
					notaBuscar = teclado.nextInt();
					System.out.println("\nJuegos con la nota " + notaBuscar + ":");
					for (Juego juego : juegos) {
						if (juego.nota == notaBuscar) {
							System.out.println(juego.getNota() + " | " + juego.getNombre());

						}
					}
					break;

				}
				break;

			case 3:
				do {

					while (true) {
						
						// En este caso tenemos cuatro opciones para especificar los años de lanzamiento de cada objeto Juego.

						System.out.println("1 - Mostrar todos los juegos a partir del año que introduzcas");
						System.out.println("2 - Mostrar todos los juegos del año que introduzcas");
						System.out
								.println("3 - Mostrar los juegos ordenados por el año de lanzamiento de menor a mayor");
						System.out
								.println("4 - Mostrar los juegos ordenados por el año de lanzamiento de mayor a menor");
						System.out.print("Introduce el número de la operación que quieras realizar: ");

						if (teclado.hasNextInt()) {
							numeroOperacionAnyo = teclado.nextInt();
							break; 
						} else {
							System.out.println("Entrada inválida. Por favor, ingrese un número.");
							teclado.next();
						}
					}

					if (numeroOperacionAnyo < 1 || numeroOperacionAnyo > 4) {
						System.out.println("Opción inválida. Intente de nuevo.");
					}
				} while (numeroOperacionAnyo < 1 || numeroOperacionAnyo > 4);

				switch (numeroOperacionAnyo) {
				
				// Hemos establecido que el minimo de año de lanzamiento sean los 2000, por lo cual dara error si se introduce una fecha anterior a ello.
				case 1:
					do {
						System.out.print("Introduce el año a partir del cual quieres mostrar los juegos: ");
						anyoLanzamiento = teclado.nextInt();
					} while (anyoLanzamiento < 2000 && anyoLanzamiento > 2025);
					for (int i = 0; i < juegos.length; i++) {
						if (juegos[i].anyoLanzamiento >= anyoLanzamiento) {
							System.out.println(juegos[i].nombre + " | " + juegos[i].anyoLanzamiento);
						}
					}
					break;
				case 2:
					do {
						System.out.print("Introduce el año que quieres buscar: ");
						anyoLanzamiento = teclado.nextInt();
					} while (anyoLanzamiento < 2000 && anyoLanzamiento > 2025);
					for (int j = 0; j < juegos.length; j++) {
						if (juegos[j].anyoLanzamiento == anyoLanzamiento) {
							System.out.println(juegos[j].nombre + " | " + juegos[j].anyoLanzamiento);
						}
					}
					break;
				case 3:
					Arrays.sort(juegos, Comparator.comparingInt((Juego j) -> j.anyoLanzamiento));
					for (Juego juego : juegos) {
						System.out.println(juego.nombre + " | " + juego.anyoLanzamiento);
					}
					break;
				case 4:
					Arrays.sort(juegos, Comparator.comparingInt((Juego j) -> j.anyoLanzamiento).reversed());
					for (Juego juego : juegos) {
						System.out.println(juego.nombre + " | " + juego.anyoLanzamiento);
					}
					break;
				}
				break;
			case 4:

				teclado.nextLine();
				boolean encontradoGenero = false;

				do {
					// Aqui volveremoms a usar el contains, no hemos colocado todos los generos, solo los que estan en nuestro array de objetos.
					System.out.println("Generos disponibles:");
					System.out.println("Accion");
					System.out.println("Aventura");
					System.out.println("Deportivo");
					System.out.println("Plataformas");
					System.out.println("Puzzle");
					System.out.println("RPG");
					System.out.println("Shooter");
					System.out.println("Sigilo");
					System.out.println("Simulacion");
					System.out.println("Terror");

					String generoBuscar = teclado.nextLine().trim().toUpperCase();
					// Comparamos el genero de cada objeto Juego, enseñandonos el juego y sus caracteristicas si coinciden. 
					// Lo mostrara por pantalla con un If, si no dara un error.
					System.out.println("Juegos del género " + generoBuscar + ":");
					for (Juego juego : juegos) {
						if (juego.getGenero().toUpperCase().contains(generoBuscar)) {
							System.out.println(juego.getNombre() + " - " + juego.getGenero() + " - " + juego.getNota()
									+ " - " + juego.getAnyoLanzamiento() + " - " + juego.getConsola() + " - "
									+ juego.getDesarollador());
							encontradoGenero = true;
						}
					}

					if (!encontradoGenero) {
						System.out.println("No se encontraron juegos para el género: " + generoBuscar);
					}

				} while (encontradoGenero == false);

				break;
			case 5:
				int opcionConsola = 0;
				do {

					while (true) {
						// En la primera opcion enseña todas las consolas con sus respectivos juegos, hemos hecho que no se repitan 
						// ordenando si varios juegos aparecen en varias consolas a la vez.
						// En la segunda por consola introducida por el usuario.

						System.out.println("¿Que filtro quieres aplicar?: ");
						System.out.println("1- Filtrar todos los juegos por consola");
						System.out.println("2- Filtrar por consola especifica: (PS (Consolas Playstation), XBOX (Consolas Xbox), PC, Switch, Wii, Nintendo DS)");

						if (teclado.hasNextInt()) {
							opcionConsola = teclado.nextInt();
							break; 
						} else {
							System.out.println("Entrada inválida. Por favor, ingrese un número.");
							teclado.next();
						}
					}

					if (opcionConsola > 2 || opcionConsola < 0) {
						System.out.println("Numero de operacion incorrecto. Introduzca de nuevo.");
					}
				} while (opcionConsola > 2 || opcionConsola < 0);

				switch (opcionConsola) {

				case 1:

					Arrays.sort(juegos, Comparator.comparing(Juego::getConsola));
					System.out.println("Juegos ordenados por consola:");
					for (Juego juego : juegos) {
						System.out.println(juego.getConsola() + " - " + juego.getNombre());
					}
					break;

				case 2:

					teclado.nextLine();
					System.out.println("Introduzca la consola a buscar: ");
					String nombreConsola = teclado.nextLine();

					nombreConsola = nombreConsola.trim().toUpperCase();

					boolean encontrado = false;
					for (Juego juego : juegos) {

						if (juego.getConsola().toUpperCase().contains(nombreConsola)) {
							System.out.println( juego.getNombre() + " - " + juego.getGenero()
									+ " - " + juego.getNota() + " - " + juego.getAnyoLanzamiento() + " - "
									+ juego.getConsola() + " - " + juego.getDesarollador());
							encontrado = true;

						}
					}

					if (!encontrado) {
						System.out.println("No se encontró ninguna consola con el nombre: " + nombreConsola);
					}
					break;
				}
				break;

			case 6:
				int busqDesarrollador = 0;
				do {

					while (true) {

						System.out.println("Como deseas filtrar los desarrolladores:");
						System.out.println("1: Ordenar alfabeticamente");
						System.out.println("2: Por desarrollador especifico");

						if (teclado.hasNextInt()) {
							busqDesarrollador = teclado.nextInt();
							break; //
						} else {
							System.out.println("Entrada inválida. Por favor, ingrese un número.");
							teclado.next();
						}
					}
					
				} while (busqDesarrollador != 1 && busqDesarrollador != 2);
				switch (busqDesarrollador) {
				case 1:
					
					Arrays.sort(juegos, new Comparator<Juego>() {
						public int compare(Juego j1, Juego j2) {
							return j1.getDesarollador().compareTo(j2.getDesarollador());
						}
					});
					System.out.println("Listado de juegos por desarrolladores:");
					for (Juego juego : juegos) {
						System.out.print(juego.getDesarollador());
						System.out.print(" | ");
						System.out.println(juego.getNombre());
					}
					break;
				case 2:
					teclado.nextLine();
					String DesarrolladorBusq;
					
					System.out.println("Lista desarrolladoras:");
					System.out.println("CAPCOM");
					System.out.println("EA");
					System.out.println("FROMSOFTWARE");
					System.out.println("GAME FREAK");
					System.out.println("KONAMI");
					System.out.println("MICROSOFT STUDIOS");
					System.out.println("PLAYSTATION STUDIOS");
					System.out.println("NINTENDO");
					System.out.println("ROCKSTAR GAMES");
					System.out.println("SEGA");
					System.out.println("SQUARE ENIX");
					System.out.println("UBISOFT");
					System.out.println("VALVE");
					
					
					do {
						
						System.out.print("Introduzca el desarrollador: ");
						DesarrolladorBusq = teclado.nextLine().trim().toUpperCase();
						
						if (!DesarrolladorBusq.equals("CAPCOM") && 
							    !DesarrolladorBusq.equals("EA") && 
							    !DesarrolladorBusq.equals("FROMSOFTWARE") &&
							    !DesarrolladorBusq.equals("GAME FREAK") &&
							    !DesarrolladorBusq.equals("KONAMI") &&
							    !DesarrolladorBusq.equals("MICROSOFT STUDIOS") &&
							    !DesarrolladorBusq.equals("NINTENDO") &&
							    !DesarrolladorBusq.equals("PLAYSTATION STUDIOS") &&
							    !DesarrolladorBusq.equals("ROCKSTAR GAMES") &&
							    !DesarrolladorBusq.equals("SEGA") &&
							    !DesarrolladorBusq.equals("SQUARE ENIX") &&
							    !DesarrolladorBusq.equals("UBISOFT") &&
							    !DesarrolladorBusq.equals("VALVE")) {
							    
							    System.out.println("Esa desarrolladora no figura en nuestros datos, por favor introduce otra");
							}
 {
							
						
							
						}
						
					}while(!DesarrolladorBusq.equals("CAPCOM") && 
						    !DesarrolladorBusq.equals("EA") && 
						    !DesarrolladorBusq.equals("FROMSOFTWARE") &&
						    !DesarrolladorBusq.equals("GAME FREAK") &&
						    !DesarrolladorBusq.equals("KONAMI") &&
						    !DesarrolladorBusq.equals("MICROSOFT STUDIOS") &&
						    !DesarrolladorBusq.equals("NINTENDO") &&
						    !DesarrolladorBusq.equals("PLAYSTATION STUDIOS") &&
						    !DesarrolladorBusq.equals("ROCKSTAR GAMES") &&
						    !DesarrolladorBusq.equals("SEGA") &&
						    !DesarrolladorBusq.equals("SQUARE ENIX") &&
						    !DesarrolladorBusq.equals("UBISOFT") &&
						    !DesarrolladorBusq.equals("VALVE"));
					
					System.out.println("\nJuegos con el desarrollador " + DesarrolladorBusq + ":");
					for (Juego juego : juegos) {
						if (juego.getDesarollador().toUpperCase().contains(DesarrolladorBusq)) {
							System.out.println(juego.getDesarollador() + " | " + juego.getNombre());
						}
					}
					break;
				}
				break;



			case 7:
				char caracter;
				do {
					System.out.println("¿Quieres finalizar la busqueda? S/N");
					caracter = teclado.next().toUpperCase().charAt(0);

				} while (caracter != 'S' && caracter != 'N');

				do {
					if (caracter == 'S') {
						// Con esto confirmamos que queremos salir de la aplicacion, siempre es bueno preguntar dos veces para asegurarse. 
						System.out.println("¿Seguro? Mira que no quiero problemas eh S/N");
						if (teclado.next().toUpperCase().charAt(0) == 'S') {
							confirmacion = true;
						}

					}
				} while (caracter != 'S' && caracter != 'N');

				break;

			default:
				System.out.println("Opción no válida.");
				break;
			}

		} while (confirmacion == false);

		// Cerramos el teclado al acabar
		
		teclado.close();
	}
}
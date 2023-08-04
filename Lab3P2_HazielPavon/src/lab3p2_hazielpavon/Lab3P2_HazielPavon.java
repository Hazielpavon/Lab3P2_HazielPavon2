package lab3p2_hazielpavon;

import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JColorChooser;

public class Lab3P2_HazielPavon {

    static ArrayList vehiculosarr = new ArrayList();
    static int cont = 0;

    public static void main(String[] args) throws ParseException {

        Scanner leer = new Scanner(System.in);
        boolean seguir = true;

        while (seguir) {

            System.out.println("1. Sistema de vehiculos");
            System.out.println("2. Salir");
            int opcion = leer.nextInt();

            switch (opcion) {

                case 1:

                    boolean seguir2 = true;

                    while (seguir2) {
                        System.out.println("1. Agregar Automovil");
                        System.out.println("2. Agregar moto");
                        System.out.println("3. Agregar Bus");
                        System.out.println("4. Modificar un vehiculo");
                        System.out.println("5. Eliminar Vehiculo");
                        System.out.println("6. Listar vehiculos");
                        System.out.println("7. Salir");
                        int opvehiculos = leer.nextInt();

                        switch (opvehiculos) {

                            case 1: {
                                String placa = "", parteLetras = "H", parteNumeros = "", transm = "", gaso = "";
                                boolean v = true, t = true;

                                System.out.println("Ingrese los 2 caracteres (ya empieza en H) ");
                                parteLetras += leer.next();

                                while (v) {
                                    if (parteLetras.length() > 3) {
                                        System.out.println("Ingresó más caracteres, solo pueden ser 2 caracteres");
                                        parteLetras = "H";
                                        parteLetras += leer.next();
                                    } else if (parteLetras.length() == 3) {
                                        System.out.println("Ingrese los 4 dígitos restantes");
                                        int placa2 = leer.nextInt();
                                        parteNumeros += String.valueOf(placa2);
                                        v = false;
                                    }
                                }

                                while (t) {
                                    if (parteNumeros.length() > 4) {
                                        System.out.println("Ingrese bien la placa");
                                        parteNumeros = "";
                                        int placa3 = leer.nextInt();
                                        parteNumeros += String.valueOf(placa3);
                                    } else {
                                        t = false;
                                    }
                                }

                                placa = parteLetras.toUpperCase() + parteNumeros;

                                System.out.println("Ingrese una marca");
                                String marca = leer.next();

                                System.out.println("Ingrese un modelo");
                                String modelo = leer.next();

                                System.out.println("Ingrese un tipo");
                                String tipo = leer.next();

                                Color color;
                                color = JColorChooser.showDialog(null, "Seleccione un color", Color.RED);

                                Date fecha1 = obtenerFechaDelUsuario();

                                System.out.println("Ingrese un tipo de combustible, 1: Diesel, 2: Regular, 3: Super");
                                int tip = leer.nextInt();

                                if (tip == 1) {
                                    gaso = "Diesel";
                                } else if (tip == 2) {
                                    gaso = "Regular";
                                } else if (tip == 3) {
                                    gaso = "Super";
                                } else {
                                    gaso = null;
                                }

                                System.out.println("Ingrese cantidad de puertas");
                                int cantp = leer.nextInt();

                                System.out.println("Ingrese el tipo de transmisión 1. Manual, 2. Automático");
                                int tr = leer.nextInt();

                                if (tr == 1) {
                                    transm = "Manual";
                                } else if (tr == 2) {
                                    transm = "Automático";
                                } else {
                                    transm = null;
                                }

                                System.out.println("Ingrese el número de asientos");
                                int cantA = leer.nextInt();
                                cont++;
                                vehiculosarr.add(new Automovil(gaso, cantp, transm, cantA, placa, marca, modelo, tipo, fecha1, color));
                                break;
                            }

                            case 2: {
                                String placa = "", parteLetras = "B", parteNumeros = "";
                                boolean v = true, t = true;

                                System.out.println("Ingrese los 2 caracteres (ya empieza en B) ");
                                parteLetras += leer.next();

                                while (v) {
                                    if (parteLetras.length() > 3) {
                                        System.out.println("Ingresó más caracteres, solo pueden ser 2 caracteres");
                                        parteLetras = "B";
                                        parteLetras += leer.next();
                                    } else if (parteLetras.length() == 3) {
                                        System.out.println("Ingrese los 4 dígitos restantes");
                                        int placa2 = leer.nextInt();
                                        parteNumeros += String.valueOf(placa2);
                                        v = false;
                                    }
                                }

                                while (t) {
                                    if (parteNumeros.length() > 4) {
                                        System.out.println("Ingrese bien la placa");
                                        parteNumeros = "";
                                        int placa3 = leer.nextInt();
                                        parteNumeros += String.valueOf(placa3);
                                    } else {
                                        t = false;
                                    }
                                }

                                placa = parteLetras.toUpperCase() + parteNumeros;

                                System.out.println("Ingrese una marca");
                                String marca = leer.next();

                                System.out.println("Ingrese un modelo");
                                String modelo = leer.next();

                                System.out.println("Ingrese un tipo");
                                String tipo = leer.next();

                                Color color;
                                color = JColorChooser.showDialog(null, "Seleccione un color", Color.RED);

                                Date fecha1 = obtenerFechaDelUsuario();

                                System.out.println("Ingresa una velocidad máxima");
                                double velocidad = leer.nextDouble();

                                System.out.println("Ingrese el peso de la moto en kg");
                                double peso = leer.nextDouble();

                                System.out.println("Ingrese el gasto de gasolina en l/km");
                                double gaso = leer.nextDouble();

                                cont++;
                                vehiculosarr.add(new Moto(velocidad, peso, gaso, placa, marca, modelo, tipo, fecha1, color));
                                break;
                            }
                            case 3: {
                                String placa = "", parteLetras = "H", parteNumeros = "", trans = "", tipoC = "";
                                boolean v = true, t = true;

                                System.out.println("Ingrese los 2 caracteres (ya empieza en H) ");
                                parteLetras += leer.next();

                                while (v) {
                                    if (parteLetras.length() > 3) {
                                        System.out.println("Ingresó más caracteres, solo pueden ser 2 caracteres");
                                        parteLetras = "H";
                                        parteLetras += leer.next();
                                    } else if (parteLetras.length() == 3) {
                                        System.out.println("Ingrese los 4 dígitos restantes");
                                        int placa2 = leer.nextInt();
                                        parteNumeros += String.valueOf(placa2);
                                        v = false;
                                    }
                                }

                                while (t) {
                                    if (parteNumeros.length() > 4) {
                                        System.out.println("Ingrese bien la placa");
                                        parteNumeros = "";
                                        int placa3 = leer.nextInt();
                                        parteNumeros += String.valueOf(placa3);
                                    } else {
                                        t = false;
                                    }
                                }

                                placa = parteLetras.toUpperCase() + parteNumeros;

                                System.out.println("Ingrese una marca");
                                String marca = leer.next();

                                System.out.println("Ingrese un modelo");
                                String modelo = leer.next();

                                System.out.println("Ingrese un tipo");
                                String tipo = leer.next();

                                Color color;
                                color = JColorChooser.showDialog(null, "Seleccione un color", Color.RED);

                                Date fecha1 = obtenerFechaDelUsuario();

                                System.out.println("Ingrese la cantidad de pasajeros que puede tener");
                                int cantp = leer.nextInt();

                                System.out.println("Ingrese la cantidad de ejes");
                                int ejes = leer.nextInt();

                                System.out.println("Ingrese la longitud");
                                int longitud = leer.nextInt();

                                cont++;
                                vehiculosarr.add(new Bus(cantp, ejes, longitud, placa, marca, modelo, tipo, fecha1, color));
                                break;
                            }

                            case 4:
                                if (cont != 0) {
                                    boolean seguir9 = true;
                                    System.out.println("Ingrese qué vehículo desea modificar:");
                                    System.out.println("1. Automóvil");
                                    System.out.println("2. Moto");
                                    System.out.println("3. Bus");
                                    System.out.println("4. Salir");
                                    int op = leer.nextInt();

                                    switch (op) {

                                        case 1:

                                            for (Object arr : vehiculosarr) {
                                                if (arr instanceof Automovil) {
                                                    System.out.println(vehiculosarr.indexOf(arr) + "----" + arr.toString());
                                                }
                                            }

                                            System.out.println("Ingrese el número del Auto que quiere modificar:");
                                            int mod = leer.nextInt() - 1;

                                            if (mod >= 0 && mod < vehiculosarr.size()) {
                                                String placa = "", parteLetras = "H", parteNumeros = "", trans = "", gaso = "";
                                                boolean v = true, t = true;

                                                System.out.println("Ingrese los 2 caracteres (ya empieza en H):");
                                                parteLetras += leer.next();

                                                while (v) {
                                                    if (parteLetras.length() > 3) {
                                                        System.out.println("Ingresó más caracteres, solo pueden ser 2 caracteres");
                                                        parteLetras = "H";
                                                        parteLetras += leer.next();
                                                    } else if (parteLetras.length() == 3) {
                                                        System.out.println("Ingrese los 4 dígitos restantes:");
                                                        int placa2 = leer.nextInt();
                                                        parteNumeros += String.valueOf(placa2);
                                                        v = false;
                                                    }
                                                }

                                                while (t) {
                                                    if (parteNumeros.length() > 4) {
                                                        System.out.println("Ingrese bien la placa");
                                                        parteNumeros = "";
                                                        int placa3 = leer.nextInt();
                                                        parteNumeros += String.valueOf(placa3);
                                                    } else {
                                                        t = false;
                                                    }
                                                }

                                                placa = parteLetras.toUpperCase() + parteNumeros;

                                                ((Automovil) vehiculosarr.get(mod)).setPlaca(placa);

                                                System.out.println("Ingrese una marca:");
                                                String marca = leer.next();
                                                ((Automovil) vehiculosarr.get(mod)).setMarca(marca);

                                                System.out.println("Ingrese un modelo:");
                                                String modelo = leer.next();
                                                ((Automovil) vehiculosarr.get(mod)).setModelo(modelo);

                                                System.out.println("Ingrese un tipo:");
                                                String tipo = leer.next();
                                                ((Automovil) vehiculosarr.get(mod)).setTipo(tipo);

                                                Color color;
                                                color = JColorChooser.showDialog(null, "Seleccione un color", Color.RED);
                                                ((Automovil) vehiculosarr.get(mod)).setColor(color);

                                                Date fecha1 = obtenerFechaDelUsuario();
                                                ((Automovil) vehiculosarr.get(mod)).setAno(fecha1);

                                                System.out.println("Ingrese un tipo de combustible, 1: Diesel, 2: Regular, 3: Super");
                                                int tip = leer.nextInt();

                                                if (tip == 1) {
                                                    gaso = "Diesel";
                                                } else if (tip == 2) {
                                                    gaso = "Regular";
                                                } else if (tip == 3) {
                                                    gaso = "Super";
                                                } else {
                                                    gaso = null;
                                                }

                                                ((Automovil) vehiculosarr.get(mod)).setTipoC(gaso);

                                                System.out.println("Ingrese cantidad de puertas:");
                                                int cantp = leer.nextInt();
                                                ((Automovil) vehiculosarr.get(mod)).setCantP(cantp);

                                                System.out.println("Ingrese el tipo de transmisión 1. Manual, 2. Automático");
                                                int tr = leer.nextInt();

                                                if (tr == 1) {
                                                    trans = "Manual";
                                                } else if (tr == 2) {
                                                    trans = "Automático";
                                                } else {
                                                    trans = null;
                                                }

                                                ((Automovil) vehiculosarr.get(mod)).setTrans(trans);

                                                System.out.println("Ingrese el número de asientos:");
                                                int cantA = leer.nextInt();
                                                ((Automovil) vehiculosarr.get(mod)).setCantA(cantA);
                                            }

                                            break;

                                        case 2:
                                            for (Object arr : vehiculosarr) {
                                                if (arr instanceof Moto) {
                                                    System.out.println(vehiculosarr.indexOf(arr) + "----" + arr.toString());
                                                }
                                            }

                                            System.out.println("Ingrese el número de la moto que quiere modificar");
                                            int mod2 = leer.nextInt() - 1;

                                            if (mod2 >= 0 && mod2 < vehiculosarr.size()) {
                                                String placa = "",
                                                        parteLetras = "B",
                                                        parteNumeros = "";
                                                boolean v = true,
                                                        t = true;
                                                System.out.println("Ingrese los 2 caracteres (ya empiza en B) ");
                                                parteLetras += leer.next();

                                                while (v) {
                                                    if (parteLetras.length() > 3) {
                                                        System.out.println("Ingreso mas caracteres, solo pueden ser 2 caracteres");
                                                        parteLetras = "B";
                                                        parteLetras += leer.next();
                                                    } else if (parteLetras.length() == 3) {
                                                        System.out.println("Ingrese los 4 digitos restantes");
                                                        int placa2 = leer.nextInt();
                                                        parteNumeros += String.valueOf(placa2);
                                                        v = false;
                                                    }
                                                }

                                                while (t) {
                                                    if (parteNumeros.length() > 4) {
                                                        System.out.println("Ingrese bien la placa");
                                                        parteNumeros = "";
                                                        int placa3 = leer.nextInt();
                                                        parteNumeros += String.valueOf(placa3);
                                                    } else {
                                                        t = false;
                                                    }
                                                }

                                                placa = parteLetras.toUpperCase() + parteNumeros;

                                                ((Moto) vehiculosarr.get(mod2)).setPlaca(placa);

                                                System.out.println("Ingrese una marca");
                                                String marca = leer.next();

                                                ((Moto) vehiculosarr.get(mod2)).setMarca(marca);

                                                System.out.println("Ingrese un modelo");
                                                String modelo = leer.next();

                                                ((Moto) vehiculosarr.get(mod2)).setModelo(modelo);

                                                System.out.println("Ingrese un tipo");
                                                String tipo = leer.next();

                                                ((Moto) vehiculosarr.get(mod2)).setTipo(tipo);

                                                Color color;
                                                color = JColorChooser.showDialog(null, "Seleccione un color", Color.RED);

                                                ((Moto) vehiculosarr.get(mod2)).setColor(color);

                                                Date fecha1 = obtenerFechaDelUsuario();

                                                ((Moto) vehiculosarr.get(mod2)).setAno(fecha1);

                                                System.out.println("Ingresa una velocidad maxima");
                                                double velocidad = leer.nextDouble();

                                                ((Moto) vehiculosarr.get(mod2)).setVelocidad(velocidad);

                                                System.out.println("Ingrese el peso de la moto en kg");
                                                double peso = leer.nextDouble();

                                                ((Moto) vehiculosarr.get(mod2)).setPeso(peso);

                                                System.out.println("Ingrese el gasto de gasolina en l/km");
                                                double gaso = leer.nextDouble();

                                                ((Moto) vehiculosarr.get(mod2)).setCombustible(gaso);
                                            }
                                            break;

                                        case 3:
                                            for (Object arr : vehiculosarr) {
                                                if (arr instanceof Bus) {
                                                    System.out.println(vehiculosarr.indexOf(arr) + "----" + arr.toString());
                                                }
                                            }

                                            System.out.println("Ingrese el número del Bus que quiere modificar");
                                            int mod3 = leer.nextInt() - 1;

                                            if (mod3 >= 0 && mod3 < vehiculosarr.size()) {
                                                String placa = "",
                                                        parteLertras = "H",
                                                        parteNumeros = "",
                                                        trans = "",
                                                        tipoC = "";
                                                boolean v = true,
                                                        t = true;
                                                System.out.println("Ingrese los 2 caracteres (ya empiza en H) ");
                                                parteLertras += leer.next();

                                                while (v) {
                                                    if (parteLertras.length() > 3) {
                                                        System.out.println("Ingreso mas caracteres, solo pueden ser 2 caracteres");
                                                        parteLertras = "H";
                                                        parteLertras += leer.next();
                                                    } else if (parteLertras.length() == 3) {
                                                        System.out.println("Ingrese los 4 digitos restantes");
                                                        int placa2 = leer.nextInt();
                                                        parteNumeros += String.valueOf(placa2);
                                                        v = false;
                                                    }
                                                }

                                                while (t) {
                                                    if (parteNumeros.length() > 4) {
                                                        System.out.println("Ingrese bien la placa");
                                                        parteNumeros = "";
                                                        int placa3 = leer.nextInt();
                                                        parteNumeros += String.valueOf(placa3);
                                                    } else {
                                                        t = false;
                                                    }
                                                }

                                                placa = parteLertras.toUpperCase() + parteNumeros;

                                                ((Bus) vehiculosarr.get(mod3)).setPlaca(placa);

                                                System.out.println("Ingrese una marca");
                                                String marca = leer.next();

                                                ((Bus) vehiculosarr.get(mod3)).setMarca(marca);

                                                System.out.println("Ingrese un modelo");
                                                String modelo = leer.next();

                                                ((Bus) vehiculosarr.get(mod3)).setModelo(modelo);

                                                System.out.println("Ingrese un tipo");
                                                String tipo = leer.next();

                                                ((Bus) vehiculosarr.get(mod3)).setTipo(tipo);

                                                Color color;
                                                color = JColorChooser.showDialog(null, "Seleccione un color", Color.RED);

                                                ((Bus) vehiculosarr.get(mod3)).setColor(color);

                                                Date fecha1 = obtenerFechaDelUsuario();

                                                ((Bus) vehiculosarr.get(mod3)).setAno(fecha1);

                                                System.out.println("Ingrese la cantidad de pasajeros que puede tener");
                                                int cantp = leer.nextInt();

                                                ((Bus) vehiculosarr.get(mod3)).setCantP(cantp);

                                                System.out.println("Ingrese la cantidad de ejes");
                                                int ejes = leer.nextInt();

                                                ((Bus) vehiculosarr.get(mod3)).setEje(ejes);

                                                System.out.println("Ingrese la longitud");
                                                int longitud = leer.nextInt();

                                                ((Bus) vehiculosarr.get(mod3)).setLongitud(longitud);
                                            }
                                            break;

                                        case 4:
                                            seguir9 = false;
                                            break;

                                        default:
                                            System.out.println("Ingrese un valor valido");
                                            break;
                                    }

                                } else {
                                    System.out.println("Agregue un vehiculo primero");
                                }

                                break;

                            case 5:
                                if (cont != 0) {
                                    for (int i = 0; i < vehiculosarr.size(); i++) {
                                        System.out.println((i + 1) + ". " + vehiculosarr.get(i));
                                    }

                                    System.out.println("Ingrese el vehículo que quiere eliminar");
                                    int eliminar = leer.nextInt() - 1;

                                    if (eliminar >= 0 && eliminar < vehiculosarr.size()) {
                                        vehiculosarr.remove(eliminar);
                                        System.out.println("Vehículo eliminado correctamente.");
                                        cont--;
                                    } else {
                                        System.out.println("Ingrese un número válido.");
                                    }
                                } else {
                                    System.out.println("Debe agregar un vehículo primero.");
                                }
                                break;

                            case 6:
                                System.out.println("Imprimir carros");

                                for (Object arg : vehiculosarr) {
                                    if (arg instanceof Vehiculos) {
                                        System.out.println(arg);
                                    }
                                }

                                System.out.println("Imprimir Motos");

                                for (Object arg : vehiculosarr) {
                                    if (arg instanceof Moto) {
                                        System.out.println(arg);
                                    }
                                }

                                System.out.println("Imprimir buses");

                                for (Object arg : vehiculosarr) {
                                    if (arg instanceof Bus) {
                                        System.out.println(arg);
                                    }
                                }
                                break;

                            case 7:
                                if (cont != 0) {
                                    for (int i = 0; i < vehiculosarr.size(); i++) {
                                        System.out.println((i + 1) + ". " + vehiculosarr.get(i));
                                    }

                                    System.out.println("Seleccione un vehículo para generar la Boleta de Revisión Vehicular");
                                    int seleccion = leer.nextInt() - 1;

                                    if (seleccion >= 0 && seleccion < vehiculosarr.size()) {
                                        Vehiculos vehiculoSeleccionado = (Vehiculos) vehiculosarr.get(seleccion);

                                        System.out.println("Boleta de Revisión Vehicular");
                                        System.out.println("----------------------------");
                                        System.out.println("Datos del Vehículo:");
                                        System.out.println("Placa: " + vehiculoSeleccionado.getPlaca());
                                        System.out.println("Marca: " + vehiculoSeleccionado.getMarca());
                                        System.out.println("Modelo: " + vehiculoSeleccionado.getModelo());
                                        System.out.println("Tipo: " + vehiculoSeleccionado.getTipo());

                                        double totalAPagar = 275.0 + 250.0; // Valor base de la tasa vehicular y valor de la placa

                                        if (vehiculoSeleccionado instanceof Automovil) {
                                            totalAPagar += 1200.0;
                                        } else if (vehiculoSeleccionado instanceof Moto) {
                                            totalAPagar += 200.0;
                                        } else if (vehiculoSeleccionado instanceof Bus) {
                                            totalAPagar += 1000.0;
                                        }

                                        System.out.println("Total a Pagar de la Tasa Vehicular: Lps." + totalAPagar);
                                    } else {
                                        System.out.println("Ingrese un número válido.");
                                    }
                                } else {
                                    System.out.println("Debe agregar un vehículo primero.");
                                }

                                break;

                            default:
                                System.out.println("Ingrese una opción válida.");
                                break;

                        }
                    }
                    break;

                case 2:

                    seguir = false;
                    System.out.println("Saliendo");

                    break;

                default:

                    System.out.println("Ingrese una opcion correcta");

            }

        }

    }

    public static Date obtenerFechaDelUsuario() throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el ano del vehiculo en el formato dd/mm/yyyy: ");
        String fechaInput = scanner.nextLine();

        String[] tokens = fechaInput.split("/");
        if (tokens.length != 3) {
            System.out.println("Formato de fecha incorrecto. Intente nuevamente.");
            return obtenerFechaDelUsuario();
        }

        int dia = Integer.parseInt(tokens[0]);
        int mes = Integer.parseInt(tokens[1]);
        int anio = Integer.parseInt(tokens[2]);

        if (dia < 1 || dia > 31 || mes < 1 || mes > 12 || anio < 0) {
            System.out.println("Fecha inválida. Intente nuevamente.");
            return obtenerFechaDelUsuario();
        }

        if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
            System.out.println("Fecha inválida. Intente nuevamente.");
            return obtenerFechaDelUsuario();
        } else if (mes == 2) {
            boolean esBisiesto = (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
            if ((esBisiesto && dia > 29) || (!esBisiesto && dia > 28)) {
                System.out.println("Fecha inválida. Intente nuevamente.");
                return obtenerFechaDelUsuario();
            }
        }

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.parse(fechaInput);
    }

}

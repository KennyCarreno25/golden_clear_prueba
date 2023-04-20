package ejercicio_siete;

public class Cadena {

    public boolean validarCadena(String cadena) {
        if (cadena != null && !cadena.isEmpty()) {
            return true;
        }
        return false;
    }

    public void cadenaMinuscula(String cadena) {
        if (validarCadena(cadena)) {
            System.out.println(cadena.toLowerCase());
        } else {
            System.out.println("No se pudo colocar la cadena en minuscula ya que no hay texto");
        }
    }

    public void cadenaMayuscula(String cadena) {
        if (validarCadena(cadena)) {
            System.out.println(cadena.toUpperCase());
        } else {
            System.out.println("No se pudo colocar la cadena en mayuscula ya que no hay texto");
        }
    }

    public void cadenaPrimerosDosCaracteres(String cadena) {
        if (validarCadena(cadena)) {
            System.out.println(cadena.substring(0, 2));
        } else {
            System.out.println("No se pudo obtener los primero 2 caracteres");
        }
    }

    public void cadenaUltimosDosCaracteres(String cadena) {
        if (validarCadena(cadena)) {
            System.out.println(cadena.substring((cadena.length() - 2)));
        } else {
            System.out.println("No se pudo obtener los ultimos 2 caracteres");
        }
    }

    public void cadenaOcurrenciaUltimoCaracter(String cadena) {
        if (validarCadena(cadena)) {
            int cont = 0;
            String ultimoCaracter = cadena.substring(cadena.length() - 1);
            for (int i = 0; i < cadena.length(); i++) {
                String car = String.valueOf(cadena.charAt(i));
                if (ultimoCaracter.equals(car)) {
                    cont++;
                }
            }
            System.out.println("numero de ocurrencias encontradas con la letra: " + ultimoCaracter + " es: " + cont);
        } else {
            System.out.println("No se pudo obtener la ocurrencia del ultimo caracter caracteres");
        }
    }

    public void cadenaConAsteriscos(String cadena) {
        if (validarCadena(cadena)) {
            System.out.println("***"+cadena+"***");
        } else {
            System.out.println("la cadena no es valida");
        }
    }

    public void cadenaInvertida(String cadena) {
        if (validarCadena(cadena)) {
            String cadenaInvertida = "";
            for (int i = cadena.length()-1; i >= 0; i--) {
                cadenaInvertida+=String.valueOf(cadena.charAt(i));
            }
            System.out.println(cadenaInvertida);
        } else {
            System.out.println("No se pudo obtener la cadena invertida");
        }
    }

}

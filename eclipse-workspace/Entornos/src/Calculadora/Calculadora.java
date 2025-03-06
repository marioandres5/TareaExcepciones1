package Calculadora;

public class Calculadora {

public Integer sumar(Integer valora, Integer valorb) {
if (valora!=null && valorb!=null) {
return valora+valorb;
}
else {
System.out.println("Los valores de entrada no pueden ser cero");
return 0;
}
}

public Integer restar(Integer valora, Integer valorb) {
return valora-valorb;
}

public Integer multiplicar(Integer valora, Integer valorb) {
return valora*valorb;
}

public Integer dividir(Integer valora, Integer valorb) {
	return valora/valorb;
	}
	}
package udla.dmolina.pooexcepcion.ejemplo;

public class Calculadora {

    public double dividir(int dividendo, int divisor) throws DivisionPorCeroException{ // se controla noma solo con el throws
        if(divisor == 0){
            throw new DivisionPorCeroException("No se puede dividir pa' 0" ); // se crea la nueva excepcion

        }
        return  dividendo/(double)divisor; // se pone el double para evitar la advertencia de que la division genera un float
    }
    public double dividir(String dividendo, String divisor) throws DivisioPorLetras, DivisionPorCeroException {
        try{
            int divid = Integer.parseInt(dividendo);
            int divos = Integer.parseInt(divisor);
            return this.dividir(divid, divos);
        }catch(NumberFormatException e){
            throw new DivisioPorLetras("Imbecil"); //se instancia una excepcion
        }

    }
}

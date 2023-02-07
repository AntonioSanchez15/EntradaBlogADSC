/**
 * Clase para manejar las entradas de un blog.
 * La clase se creó el 21/3/1999 por Ana López.
 * Esta es la versión 2.3
 * Modificar.
 */

public class EntradaBlogADSC {


    public static char separador=':';
    private int id;
    private String texto;
    private String autor;

    /**
     * Constructor de la clase. recibe el número de entrada, el nombre del autor
     * de la entrada y el texto que contiene la entrada. Si el número de entrada
     * es negativo, lanza una excepción.
     */

    /**
     * @author Antonio David Sánchez Carrillo
     * @version 06/02/2023
     * @param id
     * @param autor
     * @param texto
     * @throws IllegalArgumentException
     */
    public EntradaBlogADSC(int id,String autor,String texto)throws IllegalArgumentException{
        if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
        this.id=id;
        this.autor=autor;
        this.texto=texto;
    }
    @Override
    public String toString(){
        String cad="";
        cad+="\nENTRADA DE"+separador+autor;
        cad+="\n "+texto;
        return cad;
    }

    /**
     * @return el número de la entrada
     */
    public int getId(){
        return this.id;
    }

    /**
     * @return el texto completo de la entrada
     */

    public String getTexto(){
        return this.texto;
    }

    /**
     * @return el nombre del autor de la entrada en mayúsculas
     */
    public String getAutor(){
        return this.autor.toUpperCase();
    }

    /**
     * @return el nombre del autor. Ya no se usa. Mejor ver getAutor
     */
    public String devuelveAutor(){
        return this.autor;
    }

    /**
     * @param args No tiene porqué tener argumentos.
     */
    public static void main(String[] args) {
        EntradaBlogADSC e1=new EntradaBlogADSC (3,"ana","Últimas noticias, está disponible BixBy 2.0");
        System.out.println(e1);
    }
}

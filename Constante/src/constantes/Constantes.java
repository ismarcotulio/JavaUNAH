package constantes;

public class Constantes {
    private static int DIAS_SEMANA;
    private static int DIAS_TRABAJADOS = 20;
    
    public static void main(String[] args){
        System.out.println(args[0]);
        if(args[0].charAt(0)=='0'){
            final int DIAS_SEMANA = 7;
        }else{   
            final int DIAS_SEMANA = 6;  
        }
        System.out.println("Dias de la Semana --> "+DIAS_SEMANA);
        System.out.println("Dias Trabajados por mes --> "+DIAS_TRABAJADOS);
    }
}

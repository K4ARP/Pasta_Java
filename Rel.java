package codigos;


public class Rel {
    public static void main(String[] args){
        int h = 0;
        int m = 0;
        int s = 0;
        while (true){
            System.out.printf("/%d/", s);
            try {
            // Pausa a execução por 3000 milissegundos (3 segundos)
            Thread.sleep(1000);
            } 
            catch (InterruptedException e) {
            System.out.println("A execução foi interrompida.");
            e.printStackTrace();
        }
            s++;
            if (s == 59){
                s = 0;
            }

    }    
    }
    
}

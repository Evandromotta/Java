public class Cronometro {
   
     int segundos = 0;
     int minutos = 0;
     int horas = 0;
     
    public void cronometrando(){
      if (segundos == 60 && minutos < 60){  
           
                for(int minutos = 0; minutos < 60; minutos++){
                         for ( int segundos = 0; segundos < 60; segundos++) {
                           System.out.printf(String.format("%02d : %02d : %02d\n", horas, minutos, segundos));
                            try{   
                                Thread.sleep(1000);
                    }catch (Exception e){
                }
            }
         
        
            
        
    }
}
}
}
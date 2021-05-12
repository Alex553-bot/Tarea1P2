public class Ejercicio2{

    public int generarSerie(int n){
        int num = 0;
        int numAnt1 = 1;
        int numAnt2 = 1;
        int numAnt3 = 1;
        //System.out.println(numAnt3);
        //System.out.println(numAnt2);
        //System.out.println(numAnt1);
        
        for(int i = 3; i < n; i++){
            num = numAnt2 + numAnt3;

            numAnt3 = numAnt2;
            numAnt2 = numAnt1;
            numAnt1 = num;
            
            //System.out.println(num);
        }
        return num;
    }
}

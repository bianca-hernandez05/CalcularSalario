import java.util.Scanner;

public class App {
    static Scanner lector = new Scanner (System.in);
    static final double tasaINSS = 0.07;
    static final double tasaINSSPatronal = 0.225;
    static final double tasaSindicato = 0.01;
    static final double tasaAntiguedad = 0.15;

    public static void main(String[] args) throws Exception {
     
        System.out.println("Ingrese el salario");
        double salario = lector.nextDouble();

        if (salario <= 0) {
            System.out.println("El salario no puede ser menor que 0 , ni 0 .");
        } else {
            System.out.println("::::::::::::::::::::::");
        }

      deducciones(salario);
    } 

        public static void deducciones(double salario) {
            double ir = 0;

            double deduccionInss;
            double deduccionIr;
            double deduccionSindicato;
            double salarioNeto;
            double impuestobase = 0;
            double sobreexceso = 0;
            double salarioBruto = 0;
            double insspatronal = 0 ;
            double antiguedad = 0;
    
            if (salario >= 100 && salario <= 8333.33) {
                
                antiguedad = salario*tasaAntiguedad;
                salarioBruto = salario + antiguedad;
                deduccionSindicato = salarioBruto * tasaSindicato;
                System.out.println("No se le cobra ir porque su salario es menor al estimado, ni inss");
                salarioNeto = salarioBruto - ( deduccionSindicato);
                insspatronal = salarioBruto * tasaINSSPatronal;

                System.out.println("La deducción por sindicato " + deduccionSindicato);
                System.out.println("El salario neto es: " + salarioNeto);
                System.out.println("El inss patronal es de :" + insspatronal);
    
            } else if (salario >= 8333.34 && salario <= 16666.66) {
                ir = 0.15;
                sobreexceso = 8333.33;

                antiguedad = salario*tasaAntiguedad;
                salarioBruto = salario + antiguedad;
                deduccionInss = salarioBruto * tasaINSS;
                deduccionIr = (salarioBruto-deduccionInss) * 12 -sobreexceso *ir /12 ; // tasa mensual se convierte por tanto por eso se multiplica y se divide x12
                deduccionSindicato = salarioBruto * tasaSindicato;
                salarioNeto = salarioBruto - (deduccionInss + deduccionIr + deduccionSindicato);
                insspatronal = salarioBruto * tasaINSSPatronal;

                System.out.println("La deducción por inss es: " + deduccionInss);
                System.out.println("Su ir es de : " + deduccionIr);
                System.out.println("La deducción por sindicato : " + deduccionSindicato);
                System.out.println("Su salario neto es de: " + salarioNeto);
                System.out.println("El inss patronal es de :" + insspatronal);

            } else if (salario >= 16666.67 && salario <= 291666.66) {
                ir = 0.20;
               sobreexceso = 16666.66;
               impuestobase = 1250;
               
                antiguedad = salario*tasaAntiguedad;
                salarioBruto = salario + antiguedad;
                deduccionInss = salarioBruto * tasaINSS;
                deduccionIr = (salarioBruto -deduccionInss) *12 -sobreexceso *ir + impuestobase /12 ;
                deduccionSindicato = salarioBruto * tasaSindicato;
                salarioNeto = salarioBruto - (deduccionInss + deduccionIr + deduccionSindicato);
                insspatronal = salarioBruto * tasaINSSPatronal;
            
                System.out.println("Su deduccion por inss es de: " + deduccionInss);
                System.out.println("La deducción por ir es de: " + deduccionIr);
                System.out.println("La deducción por sindicato " + deduccionSindicato);
                System.out.println("Su salario Neto es de : " + salarioNeto);
                System.out.println("El inss patronal es de :" + insspatronal);

            } else if (salario >= 29166.67 && salario <= 41666.66) {
                ir = 0.25;
                sobreexceso = 29166.66;
                impuestobase = 3750;

                antiguedad = salario*tasaAntiguedad;
                salarioBruto = salario + antiguedad;
                deduccionInss = salarioBruto * tasaINSS;
                deduccionIr = (salarioBruto -deduccionInss) *12 -sobreexceso *ir + impuestobase /12;
                deduccionSindicato = salarioBruto * tasaSindicato;
                salarioNeto = salarioBruto - (deduccionInss + deduccionIr + deduccionSindicato) ;
                insspatronal = salarioBruto * tasaINSSPatronal;

                System.out.println("La deducción por inss es de: " + deduccionInss);
                System.out.println("Su ir es de : " + deduccionIr);
                System.out.println("La deducción por sindicato " + deduccionSindicato);
                System.out.println("El salario neto es: " + salarioNeto);
                System.out.println("El inss patronal es de :" + insspatronal);

            } else if (salario >= 41666.67) {
                ir = 0.30;
                sobreexceso = 41666.66;
                impuestobase = 6875 ;
     
                antiguedad = salario*tasaAntiguedad;
                salarioBruto = salario + antiguedad;
                deduccionInss = salarioBruto * tasaINSS;
                deduccionIr = (salarioBruto -deduccionInss) *12 -sobreexceso *ir + impuestobase /12;
                deduccionSindicato= salarioBruto * tasaSindicato;
                salarioNeto = salarioBruto - (deduccionInss + deduccionIr + deduccionSindicato);
                insspatronal = salarioBruto * tasaINSSPatronal;

                System.out.println( "La deduccion del inss es de : " + deduccionInss);
                System.out.println("La deducción del ir es de: " + deduccionIr);
                System.out.println("La deducción del sindicato " + deduccionSindicato);
                System.out.println("El salario neto es de : " + salarioNeto);
                System.out.println("Su inss patronal es de : " + insspatronal);
            }
        }
        
 }
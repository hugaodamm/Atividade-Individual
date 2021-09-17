package com.task.exe3;

public class Retangulo {

        public static void main(String[] args) {

            double resultadoAreaTotal = calculaArea(8,8);
            System.out.println("Área de retangulo: " + resultadoAreaTotal);

            double resultadoPerimetro = calculaPerimetro(8,8);
            System.out.println("Área de Perímetro: " + resultadoPerimetro);

            double areaLaJota = 0.8 * 0.8;
            quantidadePiso(areaLaJota, resultadoAreaTotal);

            double comprimentoLaJota = 0.8;
            quatidadeRodape(comprimentoLaJota, resultadoPerimetro);

        }

        public static double calculaArea(double ladoA, double ladoB){

            double areaTotal = ladoA * ladoB;
            return areaTotal;
        }

        public static double calculaPerimetro(double ladoA, double ladoB){

            double areaPerimetro = (2*ladoA)+(2*ladoB);
            return areaPerimetro;
        }

        public static void quantidadePiso(double areaLajota, double areaTotal){

            double areaQuantidadePiso = areaTotal/areaLajota ;
            System.out.println("Quantidade de Pisos: " + areaQuantidadePiso);
        }

        public static void quatidadeRodape(double comprimentoLajota, double perimetro){

            double quantidadeRodape = perimetro/comprimentoLajota;
            System.out.println("Quantidade de lajotas: " + quantidadeRodape);
        }

}

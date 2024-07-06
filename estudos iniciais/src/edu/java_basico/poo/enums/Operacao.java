package edu.java_basico.poo.enums;

public enum Operacao {
    SOMA {
        @Override
        public double executar(double a, double b) {
            return a + b;
        }
    },
    SUBTRACAO {
        @Override
        public double executar(double a, double b) {
            return a - b;
        }
    };

    public abstract double executar(double a, double b);
}
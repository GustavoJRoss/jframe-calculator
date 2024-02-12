package Componentes;

public class Calculadora {
    private double valor1;
    private double valor2;
    private double valor1NovoDigito;
    private double valor2NovoDigito;
    private int operacao;
    private int qualDigito;
    private double resultado;
    
    
    public double getResultado(){
        return this.resultado;
    }
    public void setResultado(double valor){
        this.resultado = valor;
    }
    
    public int getOperacao(){
        return this.operacao;
    }
    public void setOperacao(int valor){
        this.operacao = valor;
    }
    
    public int getQualDigito(){
        return this.qualDigito;
    }
    public void setQualDigito(int valor){
        this.qualDigito = valor;
    }
    
    public double getValor1(){
        return this.valor1;
    }
    public void setValor1(double valor){
        this.valor1 = valor;
    }
    
    public double getValor2(){
        return this.valor2;
    }
    public void setValor2(double valor){
        this.valor2 = valor;
    }
    
    public double getValor1NovoDigito(){
        return this.valor1NovoDigito;
    }
    public void setValor1NovoDigito(double valor){
        if(this.valor1 == 0){
            this.valor1 = valor;
        }else {
            this.valor1 = (this.valor1*10)+valor;
        }
    }
    
    public double getValor2NovoDigito(){
        return this.valor2NovoDigito;
    }
    public void setValor2NovoDigito(double valor){
        if(this.valor2 == 0){
            this.valor2 = valor;
        }else {
            this.valor2 = (this.valor2*10)+valor;
        }
        
    }
    
    
    public double calcularSoma(){
        
        return this.valor1+this.valor2;
    }
    
    public double calcularSubtracao(){
        return this.valor1-this.valor2;
    }
    
    public double calcularMultiplicacao(){
        return this.valor1*this.valor2;
    }
    
    public double calcularDivisao(){
        return this.valor1/this.valor2;
    }
    
    public  double calcularExponenciacao(){
        return Math.pow(this.valor1, this.valor2);
    }
    
    public double calcularPorcentagem(){
        return (this.valor2/100)*this.valor1;
    } 
    
    
    public void realizarOperacao(){
        double valor;
        switch(this.getOperacao()){
            case 1 -> {
                valor = this.calcularMultiplicacao();
            }
            case 2 -> {
                valor = this.calcularDivisao();
            }
            case 3 -> {
                valor = this.calcularSubtracao();
            }
            case 4 -> {
                valor = this.calcularSoma();
            }
            case 5 -> {
                valor = this.calcularExponenciacao();
            }
            case 6 -> {
                valor = this.calcularPorcentagem();
            }           
            default -> {
                valor = 0;
            }           
        }
        
        this.setResultado(valor);
    }
    
    
}

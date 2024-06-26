//Crie uma classe ConversorMoeda que implementa uma interface ConversaoFinanceira com o método converterDolarParaReal() para converter um valor em dólar para reais. A classe deve receber o valor em dólar como parâmetro.
// Interface ConversaoFinanceira
public interface ConversaoFinanceira{
    void converterDolarParaReal(double valorDolar);
}

// Classe ConversorMoeda implementando ConversaoFinanceira
public class ConversorMoeda implements ConversaoFinanceira{
    @Override
    public void converterDolarParaReal(double valorDolar){
        double cotacaoDolar = 4.80;
        double valorReal = valorDolar * cotacaoDolar;
        System.out.println("O valor em reais é: R$" + valorReal);
    }
}

// Classe de Teste
public class TesteConversorMoeda{
    public static void main(String[] args){
        ConversorMoeda conversor = new ConversorMoeda();
        conversor.converterDolarParaReal(50); // Exemplo com o valor em dólar
    }
}


//Crie uma classe CalculadoraSalaRetangular que implementa uma interface CalculoGeometrico com os métodos calcularArea() e calcularPerimetro() para calcular a área e o perímetro de uma sala retangular. A classe deve receber altura e largura como parâmetros.
// Interface CalculoGeometrico
public interface CalculoGeometrico{
    void calcularArea(double altura, double largura);
    void calcularPerimetro(double altura, double largura);
}

// Classe CalculadoraSalaRetangular implementando CalculoGeometrico
public class CalculadoraSalaRetangular implements CalculoGeometrico{
    @Override
    public void calcularArea(double altura, double largura){
        double area = altura * largura;
        System.out.println("A área da sala retangular é: " + area);
    }

    @Override
    public void calcularPerimetro(double altura, double largura){
        double perimetro = 2 * (altura + largura);
        System.out.println("O perímetro da sala retangular é: " + perimetro);
    }
}

// Classe de Teste
public class TesteCalculadoraSalaRetangular{
    public static void main(String[] args){
        CalculadoraSalaRetangular calculadora = new CalculadoraSalaRetangular();
        calculadora.calcularArea(5, 8); // Exemplo com altura e largura
        calculadora.calcularPerimetro(5, 8);
    }
}


//Crie uma classe TabuadaMultiplicacao que implementa uma interface Tabuada com o método mostrarTabuada() para exibir a tabuada de um número. A classe deve receber o número como parâmetro.
// Interface Tabuada
public interface Tabuada{
    void mostrarTabuada(int numero);
}

// Classe TabuadaMultiplicacao implementando Tabuada
public class TabuadaMultiplicacao implements Tabuada{
    @Override
    public void mostrarTabuada(int numero){
        System.out.println("Tabuada de multiplicação do " + numero + ":");
        for(int i = 1; i <= 10; i++){
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}

// Classe de Teste
public class TesteTabuadaMultiplicacao{
    public static void main(String[] args){
        TabuadaMultiplicacao tabuada = new TabuadaMultiplicacao();
        tabuada.mostrarTabuada(7); // Exemplo com o número 7
    }
}


//Crie uma interface ConversorTemperatura com os métodos celsiusParaFahrenheit() e fahrenheitParaCelsius(). Implemente uma classe ConversorTemperaturaPadrao que implementa essa interface com as fórmulas de conversão e exibe os resultados.
// Interface ConversorTemperatura
public interface ConversorTemperatura{
    double celsiusParaFahrenheit(double temperaturaCelsius);

    double fahrenheitParaCelsius(double temperaturaFahrenheit);
}

// Classe ConversorTemperaturaPadrao implementando ConversorTemperatura
public class ConversorTemperaturaPadrao implements ConversorTemperatura{
    @Override
    public double celsiusParaFahrenheit(double temperaturaCelsius){
        return(temperaturaCelsius * 9 / 5) + 32;
    }

    @Override
    public double fahrenheitParaCelsius(double temperaturaFahrenheit){
        return(temperaturaFahrenheit - 32) * 5 / 9;
    }
}

// Classe de Teste
public class TesteConversorTemperatura{
    public static void main(String[] args){
        ConversorTemperatura conversor = new ConversorTemperaturaPadrao();

        double temperaturaCelsius = 25;
        double temperaturaFahrenheit = conversor.celsiusParaFahrenheit(temperaturaCelsius);
        System.out.println(temperaturaCelsius + " Celsius é igual a " + temperaturaFahrenheit + " Fahrenheit.");

        temperaturaFahrenheit = 77;
        temperaturaCelsius = conversor.fahrenheitParaCelsius(temperaturaFahrenheit);
        System.out.println(temperaturaFahrenheit + " Fahrenheit é igual a " + temperaturaCelsius + " Celsius.");
    }
}


//Crie uma interface Calculavel com um método double calcularPrecoFinal(). Implemente essa interface nas classes Livro e ProdutoFisico, cada uma retornando o preço final considerando descontos ou taxas adicionais.
public interface Calculavel{
    double calcularPrecoFinal();
}

public class Livro extends Produto implements Calculavel{
    private String autor;

    public double calcularPrecoFinal() {
        return preco * 0.9; 
    }
}

public class ProdutoFisico extends Produto implements Calculavel{
    public double calcularPrecoFinal(){
        // Implementação com taxas adicionais para produtos físicos
        return preco * 1.05; 
    }
}


//Crie uma interface Vendavel com métodos para calcular o preço total de um produto com base na quantidade comprada e aplicar descontos. Implemente essa interface nas classes Produto e Servico, cada uma fornecendo a sua própria lógica de cálculo de preço.
// Interface Vendavel
public interface Vendavel{
    double calcularPrecoTotal(int quantidade);
    void aplicarDesconto(double percentualDesconto);
}

// Classe Produto
public class Produto implements Vendavel{
    private String nome;
    private double precoUnitario;

    // Construtor e outros métodos

    @Override
    public double calcularPrecoTotal(int quantidade){
        return precoUnitario * quantidade;
    }

    @Override
    public void aplicarDesconto(double percentualDesconto){
        precoUnitario -= precoUnitario * (percentualDesconto / 100.0);
    }
}

// Classe Servico
public class Servico implements Vendavel{
    private String descricao;
    private double precoHora;

    // Construtor e outros métodos

    @Override
    public double calcularPrecoTotal(int quantidade){
        return precoHora * quantidade;
    }

    @Override
    public void aplicarDesconto(double percentualDesconto){
        precoHora -= precoHora * (percentualDesconto / 100.0);
    }
}
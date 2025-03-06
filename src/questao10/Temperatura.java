
package questao10;


public class Temperatura {
    
    private double celsius;
    private double fahrenheit;
    private double kelvin;

    public Temperatura (double celsius) {
        this.celsius = celsius;
    }

    public Temperatura () {
        this.celsius= 23;
    }

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public double converterFahrenheit (){
        fahrenheit= celsius*9/5+32;
        return fahrenheit;
    }
    
    public double converterKelvin (){
        kelvin= celsius+273.15;
        return kelvin;
    }
    
    public void mostrarDados(){
        System.out.println("Celsius: "+celsius);
        System.out.println("Fahrenheit: "+fahrenheit);
        System.out.println("Kelvin: "+kelvin);
    }
}

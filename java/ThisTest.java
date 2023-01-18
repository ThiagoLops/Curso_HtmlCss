public class ThisTest
{

public static void main(String[] args) {
    
Simpletime time = new Simpletime(15, 30, 19);
System.out.println(time.buildString());
}
}

class SimpleTime
{
    private int hora;
    private int minuto;
    private int segundos;

    public SimpleTime(int hora, int minuto, int segundos)
    {
        this.hora = hora;
        this.minuto = minuto;
        this.segundos = segundos;
    }

    public String buildString()
    {
        return String.format("%24s: %s%n%24s: %s", "this.toUniversalString()", this.toUniversalString(), "toUniversalString()", toUniversalString());
    }

    public String toUniversalString()
    {
        return String.format("%02d:%02d:%02d", this.hora, this.minuto, this.segundos );
    }
}
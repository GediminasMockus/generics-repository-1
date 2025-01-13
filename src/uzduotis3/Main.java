package uzduotis3;

public class Main {
    public static void main(String[] args) {

        Mapas<DnsProvider, DnsServer> dnsMapas = new Mapas<>();

        dnsMapas.ideti(DnsProvider.GOOGLE, new DnsServer("8.8.8.8", "8.8.4.4"));
        dnsMapas.ideti(DnsProvider.CLOUDFLARE, new DnsServer("1.1.1.1", "1.0.0.1"));
        dnsMapas.ideti(DnsProvider.OPENDNS, new DnsServer("208.67.222.222", "208.67.220.220"));

        System.out.println("GOOGLE DNS: " + dnsMapas.gauti(DnsProvider.GOOGLE));
        System.out.println("CLOUDFLARE DNS: " + dnsMapas.gauti(DnsProvider.CLOUDFLARE));
        System.out.println("OPENDNS DNS: " + dnsMapas.gauti(DnsProvider.OPENDNS));

        Mapas<String, String> stringMapas = new Mapas<>();

        stringMapas.ideti("Java", "Kiečiausia programavimo kalba");
        stringMapas.ideti("Python", "Lengviausiai išmokstama kalba");
        stringMapas.ideti("C++", "Žemo lygio programavimo kalba");

        System.out.println("Java: " + stringMapas.gauti("Java"));
        System.out.println("Python: " + stringMapas.gauti("Python"));
        System.out.println("C: " + stringMapas.gauti("C++"));
    }
}

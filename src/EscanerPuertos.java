import java.net.Socket;
import java.util.Scanner;

public class EscanerPuertos {

        public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                System.out.print("scanner IP: ");
                //IP de entrada
                String address = in.nextLine();
                for(int i = 0; i < 65535 ; i++) {
                    try {
                        //intentamos crear la conexión con el cliente
                        Socket cliente = new Socket(address, i);
                        //si falla saltará al catch
                        System.out.println("port: " + i + " is open");
                        cliente.close();
                    } catch (Exception e) {
                        //puerto no abierto
                    }
                }
                System.out.println("Terminado");
        }
    }

package Java;
import java.io.*;
import java.nio.*;
import Java.ProductOnline;

public class Serializa2 {
       
    public static void main(String[] args) throws IOException, ClassNotFoundException {

    ProductOnline productOn = new ProductOnline("Nicolly", "Camiseta", 20);

        try {
            /* GRAVA NO ARQUIVO */
            ObjectOutputStream objOutput = new ObjectOutputStream(new FileOutputStream("product.byte"));
            //Importa classe de gravação de objetos e instancia como "objOutput"
            //Importa classe de criação do arquivo, como parametro, e o salvamos como "product.byte"
            objOutput.writeObject(productOn);
            //Grava os atributos do objeto "productOn" (ln11-12) no objeto "objOutput" (que está fazendo a gravação no arq)
            objOutput.close();
            //Fecha a conexão com o arquivo / disco rígido.


            /* LEITURA DO ARQUIVO */
            ObjectInputStream objInput = new ObjectInputStream(new FileInputStream("product.byte"));
            //Importa classe de gravação de objetos e instancia como "objOutput"
            //Importa classe de criação do arquivo, como parametro, e o salvamos como "product.byte"
            ProductOnline productFromFile = (ProductOnline) objInput.readObject();
            //Grava os atributos do objeto "productOn" (ln11-12) no objeto "objOutput" (que está fazendo a gravação no arq)
            objInput.close();
            //Fecha a conexão com o arquivo / disco rígido.
            System.out.println("Cliente: " + productFromFile.clienteNome + ".");
            System.out.println("Produto: " + productOn.nameProduct + ".");
            System.out.println("Valor: " + productOn.price + ".");
        } 
        catch (IOException | ClassNotFoundException erros) {
            erros.printStackTrace();
        }

    
    }
}

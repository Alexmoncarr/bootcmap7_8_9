import java.io.*;

public class FileCopy {
    public static void copy(String fileIn, String fileOut) throws IOException {
        // Se abren los streams de entrada y salida
        InputStream in = new FileInputStream(fileIn);
        PrintStream out = new PrintStream(new FileOutputStream(fileOut));

        // Se crea un buffer para ir leyendo y escribiendo el contenido del archivo
        byte[] buffer = new byte[1024];
        int bytesRead;

        // Se lee el archivo de entrada y se escribe en el archivo de salida
        while ((bytesRead = in.read(buffer)) != -1) {
            out.write(buffer, 0, bytesRead);
        }

        // Se cierran los streams
        in.close();
        out.close();
    }

    public static void main(String[] args) {
        try {
            copy("input.txt", "output.txt");
            System.out.println("El archivo se ha copiado correctamente");
        } catch (IOException e) {
            System.out.println("Error al copiar el archivo: " + e.getMessage());
        }
    }
}

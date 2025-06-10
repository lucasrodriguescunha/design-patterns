package composite;

public class Program {

    public static void main(String[] args) {

        // Arquivos
        File file1 = new File("Documento.txt");
        File file2 = new File("Foto.png");
        File file3 = new File("Planilha.xlsx");

        // Pastas
        Folder root = new Folder("Root");
        Folder docs = new Folder("Documentos");
        Folder images = new Folder("Imagens");

        // Montando estrutura
        docs.add(file1);
        images.add(file2);
        root.add(docs);
        root.add(images);
        root.add(file3);

        // Mostrar estrutura
        root.show("");
    }
}

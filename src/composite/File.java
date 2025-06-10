package composite;

public class File implements FileSystemComponent {

    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void show(String indent) {
        System.out.println(indent + "- " + name);
    }
}

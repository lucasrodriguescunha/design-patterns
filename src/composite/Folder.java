package composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemComponent {

    private String name;
    private List<FileSystemComponent> children = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void add(FileSystemComponent component) {
        children.add(component);
    }

    public void remove(FileSystemComponent component) {
        children.remove(component);
    }

    @Override
    public void show(String indent) {
        System.out.println(indent + "+ " + name);
        for (FileSystemComponent component : children) {
            component.show(indent + "  ");
        }
    }
}

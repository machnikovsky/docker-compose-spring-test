package pl.machnikovsky.dockercomposespringclinet;



public class Animal {


    private Long id;

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public Animal() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

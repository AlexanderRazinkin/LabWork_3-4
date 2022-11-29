package Obj.Nature;



public enum BirdCharecter {
    RED("красного"),
    GREEN("зеленого"),
    BLUE("голубого"),
    BLACK("темного"),
    WHITE("светлого");

    private String name;
    BirdCharecter(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

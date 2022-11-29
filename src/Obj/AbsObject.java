
package Obj;

public abstract class AbsObject extends Status implements AbsClassInterface {

    private final String name;
    Status status = new Status();
    private boolean isAlive;

    public AbsObject(String name, boolean isAlive) {
        this.name = name;
        this.isAlive = isAlive;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        int buff = 0;

        for (byte i=0; i<getName().length(); i++) buff += getName().charAt(i);
        for (byte i=0; i<getStatus().toString().length(); i++) buff += getStatus().toString().charAt(i);

        return buff;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AbsObject check = (AbsObject) o;
        return hashCode() == check.hashCode();
    }

    @Override
    public String toString(){
        return getName() + " " + getStatus();
    }
}

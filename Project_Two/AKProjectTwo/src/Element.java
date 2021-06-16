public class Element {

    private String name;  // The name of the chemical element
    private int atomicNumber;  // The atomic number of the element
    private double atomicWeight;  // The atomic weight of the element

    public Element(String name, int atomicNumber, double atomicWeight) {
        this.name = name;
        this.atomicNumber = atomicNumber;
        this.atomicWeight = atomicWeight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAtomicNumber() {
        return atomicNumber;
    }

    public void setAtomicNumber(int atomicNumber) {
        this.atomicNumber = atomicNumber;
    }

    public double getAtomicWeight() {
        return atomicWeight;
    }

    public void setAtomicWeight(double atomicWeight) {
        this.atomicWeight = atomicWeight;
    }

    @Override
    public String toString() {
        return "Element{" +
                "'" + name + '\'' +
                ", atomicNumber = " + atomicNumber +
                ", atomicWeight = " + atomicWeight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        //Check if o is an instance of Complex or not "null instanceof [type]" also returns false
        if (!(o instanceof Element)) return false;
        // typecast o to Element so that we can compare data members
        Element element = (Element) o;
        return getName().equals(element.getName());
    }

}

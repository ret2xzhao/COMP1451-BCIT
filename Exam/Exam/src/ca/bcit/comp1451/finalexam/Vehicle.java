package ca.bcit.comp1451.finalexam;

abstract public class Vehicle implements Comparable<Vehicle>{
    private int weightPounds;

    public Vehicle(int weightPounds) {
        setWeightPounds(weightPounds);
    }

    public void setWeightPounds(int weightPounds) {
        if(weightPounds >= 0) {
            this.weightPounds = weightPounds;
        }
        else {
            throw new IllegalArgumentException("Invalid input.");
        }
    }

    public int getWeightPounds() {
        return this.weightPounds;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (this.getClass() != obj.getClass())
            return false;
        Vehicle other = (Vehicle) obj;
        if (this.getWeightPounds() == other.getWeightPounds()) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " weighing " + this.getWeightPounds() + " pounds";
    }

    @Override
    public int compareTo(Vehicle other) {
        return (int)(this.getWeightPounds() - other.getWeightPounds());
    }
}
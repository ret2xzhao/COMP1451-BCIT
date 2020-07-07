package six;

public class Chihuahua extends Dog
{
    private String name;

    /**
     * @param name
     */
    public Chihuahua(String name) {
        this.name = name;
    }

    /**
     *
     */
    @Override
    public int hashCode()
    {
        // equal objects must return equal hashcodes
        // return 44;
        // let eclipse do it
        // return int based on the Chihuahua's name
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Chihuahua other = (Chihuahua) obj;
        if (this.name == null) {
            if (other.name != null) {
                return false;
            }
        }
        else if (!this.name.equals(other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public void speak()
    {
        super.speak();
        System.out.println("arf arf yip yip");
    }
}
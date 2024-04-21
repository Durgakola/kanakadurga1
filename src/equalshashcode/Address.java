package equalshashcode;

import java.util.Objects;

public class Address {
    public String area;
    public String street;
    public String pincode;
    public String flatNo;
    public String state;

    @Override
    public boolean equals(Object obj) {
        if(this==obj) {
            return true;
        }

        if(this.getClass()!=obj.getClass()) {
            return false;
        }

        Address otheraddress=(Address) obj;
//Type cast
        return this.area.equals(otheraddress.area) && this.pincode.equals(otheraddress.pincode) && this.street.equals(otheraddress.street)
               && this.state.equals(otheraddress.state) && this.flatNo.equals(otheraddress.flatNo);
    }

    @Override
   public int hashCode() {
//      return Objects.hash(area, street, pincode, flatNo, state);
         return this.area.hashCode()+
                this.state.hashCode()+
                this.flatNo.hashCode()+
                this.street.hashCode()+
                this.pincode.hashCode();
    }

    @Override
    public String toString() {
        return "Address{" +
                "area='" + area + '\'' +
                ", street='" + street + '\'' +
                ", pincode='" + pincode + '\'' +
                ", flatNo='" + flatNo + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}

package equalshashcode;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer,Address> addressMap=new HashMap<>();

        List<Address> addressList=new ArrayList<>();
      for(int i=0;i<10000;i++) {
          Address address1 = new Address();
          address1.area = "KPHB";
          address1.flatNo = "123-123";
          address1.pincode = "522790" + i;
          address1.street = "kphb 5th phase";
          address1.state = "Andhra";

//          Address address2 = new Address();
//          address2.area = "KPHB";
//          address2.flatNo = "123-123";
//          address2.pincode = "522790" + (i + 1);
//          address2.street = "kphb 5th phase";
//          address2.state = "Andhra";

          addressList.add(address1);
//          addressList.add(address2);

          addressMap.put(address1.hashCode(), address1);
//          addressMap.put(address2.hashCode(), address2);

      }

     Set<Map.Entry<Integer,Address>> entrySetOfAddress= addressMap.entrySet();

      Iterator<Map.Entry<Integer,Address>> iterator=entrySetOfAddress.iterator();
      for(; iterator.hasNext();){
          Map.Entry<Integer,Address>entry=iterator.next();
          System.out.println("Key "+entry.getKey()+" Value "+entry.getKey());

      }

        addressMap.forEach( (k,v) -> {
           System.out.println("Key from ForEach  "+k+ "Value "+v);

       });

        System.out.println("Getting Address from list");

      long liststartTime=System.currentTimeMillis();


        Address findAddress = new Address();
        findAddress .area = "KPHB";
        findAddress .flatNo = "123-123";
        findAddress .pincode = "522790";
        findAddress .street = "kphb 5th phase";
        findAddress .state = "Andhra";

       Iterator<Address> iteratorListAddress= addressList.iterator();

       for(; iteratorListAddress.hasNext();){
           Address add=iteratorListAddress.next();
           if(add.equals(findAddress)){
               System.out.println("Find the Address "+add.pincode);
               break;
           }
       }
       long listEndTime =System.currentTimeMillis();
        System.out.println("Time taken "+(listEndTime-liststartTime));
        System.out.println("Getting Address from Map");

        long mapListStartTime=System.currentTimeMillis();
        Address mapAddress=addressMap.get(findAddress.hashCode());
        System.out.println("find Address from map "+mapAddress.pincode);

        long mapListEndTime=System.currentTimeMillis();
        System.out.println("Time taken Map "+(mapListEndTime-mapListEndTime));



    }
}

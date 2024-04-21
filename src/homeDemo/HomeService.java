package homeDemo;

import java.util.ArrayList;
import java.util.List;

public class HomeService {
    public Home getHome(){
        Home home=new Home();

        Light light=new Light();
        light.type="60 Watts";
        light.noOfLights=20;
        light.brand="Philips";


        Fan fan=new Fan();
        fan.type="celeingFan";
        fan.noOfFans=6;
        fan.brand="USHA";

        Room room=new Room();

        Gas gas =new Gas();
        gas.type="HP";

        Kitchen kitchen=new Kitchen();
        kitchen.gas=gas;

        Tv tv=new Tv();
        tv.typeOfTv="LG";

        Sofa sofa=new Sofa();
        sofa.type="CamelBack";
        sofa.brand="Chelsea";

        Table table=new Table();
        table.type="Squre";
        table.brand="Augusta";


        Chair chair=new Chair();
        chair.noOfChairs=10;
        chair.brand="Vedbo";

        Furniture furniture=new Furniture();
        furniture.sofa=sofa;
        furniture.table=table;


        Hall hall=new Hall();
        hall.tv=tv;
        hall.furniture=furniture;

        BedRoom bedRoom=new BedRoom();
        bedRoom.furniture=furniture;


        List<Room> roomList=new ArrayList<>();
        List<Light> lightList=new ArrayList<>();
        List<Fan> fanList=new ArrayList<>();
        List<Chair> chairList=new ArrayList<>();

        roomList.add(room);
        lightList.add(light);
        fanList.add(fan);
        chairList.add(chair);

        home.rooms=roomList;
        room.fans=fanList;
        room.lights=lightList;
        furniture.chair=chairList;
            return home;
    }
}

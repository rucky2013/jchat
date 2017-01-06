package me.jcala.jchat.mock;

import me.jcala.jchat.domain.Message;
import me.jcala.jchat.domain.Session;
import me.jcala.jchat.domain.User;
import me.jcala.jchat.domain.WsData;

import java.util.Arrays;

public class InitData {
    public static WsData woodData;
    public static WsData fireData;
    public static WsData goldData;
    static{
        User woodUser=new User("wood","/img/wood.jpg");
        User fireUser=new User("fire","/img/fire.jpg");
        User goldUser=new User("gold","/img/gold.jpg");
        Message woodMsg=new Message("Hello,好久不见");
        Message fireMsg=new Message("hi,最近过得咋样？");
        Message goldMsg=new Message("Are you OK?");
        Session woodSession1=new Session(1,fireUser, Arrays.asList(fireMsg));
        Session woodSession2=new Session(2,goldUser,Arrays.asList(goldMsg));

        Session fireSession1=new Session(1,woodUser, Arrays.asList(woodMsg));
        Session fireSession2=new Session(2,goldUser, Arrays.asList(goldMsg));

        Session goldSession1=new Session(1,woodUser,Arrays.asList(woodMsg));
        Session goldSession2=new Session(2, fireUser,Arrays.asList(fireMsg));


        woodData=new WsData(woodUser,Arrays.asList(woodSession1,woodSession2));
        fireData=new WsData(fireUser,Arrays.asList(fireSession1,fireSession2));
        goldData=new WsData(fireUser,Arrays.asList(goldSession1,goldSession2));
    }

}

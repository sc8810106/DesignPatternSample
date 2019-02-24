package BehavioralPattern.MediatorPattern;

import java.util.Date;

/**
 * Created by Administrator on 2019/2/24.
 */
public class ChatRoom {

    public static void showMessage(User user, String message){
        System.out.println(new Date().toString()
                + " [" + user.getName() +"] : " + message);
    }
}

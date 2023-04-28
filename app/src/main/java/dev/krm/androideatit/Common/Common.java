package dev.krm.androideatit.Common;

import dev.krm.androideatit.Model.User;

public class Common {
    public static User currentUser;

    public static String convertCodeToStatus(String status) {
        if(status.equals("0"))
            return "placed";
        else if(status.equals("1"))
            return "On my way";
        else
            return "Shipped";
    }

}

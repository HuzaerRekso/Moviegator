package id.sch.smktelkom_mlg.privateassignment.xirpl318.moviegator;

/**
 * Created by MHRJ on 5/19/2017.
 */

import android.graphics.Color;

import java.util.Random;


public class ColorUtil {
    public static int getRandomColor() {
        Random rnd = new Random();
        //return Color.rgb(rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
        return Color.rgb(rnd.nextInt(192), rnd.nextInt(192), rnd.nextInt(192));
    }
}


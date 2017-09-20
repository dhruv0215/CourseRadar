package cse442.courseradar;

import android.util.Log;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Objects;

/**
 * Created by chandx on 9/18/17.
 */

public class instructorData {
    public HashMap<String, HashMap<String, String>> courses;
    public String email;
    public HashMap<String, HashMap<String, String>> reviews;

    public instructorData(){}

    public instructorData(HashMap<String, HashMap<String, String>> inputData1, String inputData2, HashMap<String, HashMap<String, String>> inputData3){
        courses= inputData1;
        email= inputData2;
        reviews= inputData3;
    }

    @Override
    public String toString() {
        StringBuilder courseinfo= new StringBuilder();
        courseinfo.append("email: ").append(email).append("\n").append("course info").append("\n");
        /*for (String ckey: courses.keySet()){
            courseinfo.append("\t").append(ckey).append('\n');
            HashMap<String, String> temp= courses.get(ckey);
            for(String nkey: temp.keySet()){
                courseinfo.append("\t\t").append(nkey).append(":\t").append(temp.get(nkey)).append("\n");
            }
        }
        courseinfo.append("reviews").append("\n");
        for (String ckey: reviews.keySet()){
            courseinfo.append("\t").append(ckey).append('\n');
            HashMap<String, String> temp= reviews.get(ckey);
            for(String nkey: temp.keySet()){
                courseinfo.append("\t\t").append(nkey).append(":\t").append(temp.get(nkey)).append("\n");
            }
        }*/
        return courseinfo.toString();
    }
}

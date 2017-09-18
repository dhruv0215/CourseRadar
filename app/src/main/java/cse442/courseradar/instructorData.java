package cse442.courseradar;

import android.util.Log;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Objects;

/**
 * Created by chandx on 9/18/17.
 */

public class instructorData {
    public HashMap<String, Object> courses;
    public String email;
    public HashMap<String, Object> reviews;

    public instructorData(){}

    public instructorData(HashMap<String, Object> inputData1, String inputData2, HashMap<String, Object> inputData3){
        courses= inputData1;
        email= inputData2;
        reviews= inputData3;
    }

    @Override
    public String toString() {
        Log.d("cor: ", String.valueOf(courses == null));
        Log.d("rvw: ", String.valueOf(reviews== null));
        return "email";
    }
}

package cse442.courseradar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView tvInfo;
    private EditText etInput;
    private Button btnSearch;
    private DatabaseReference firebaseDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvInfo = (TextView) findViewById(R.id.tv_info);
        etInput = (EditText) findViewById(R.id.et_input);
        btnSearch = (Button) findViewById(R.id.btn_search);
        btnSearch.setOnClickListener(this);
        firebaseDB = FirebaseDatabase.getInstance().getReference("instructors");
    }

    @Override
    public void onClick(View view) {
        if(view == btnSearch){
            String input = etInput.getText().toString();
            if(input != null && !input.isEmpty()){
                input = input.toUpperCase();
                Log.d("onClick", "the instructor is: "+ input);
                Log.d("to search", firebaseDB.child(input).getKey());
                Log.d("to search", firebaseDB.child(input).toString());
                firebaseDB.child(input).addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        instructorData data = dataSnapshot.getValue(instructorData.class);
                        tvInfo.setText(data.toString());
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {
                        Log.d("onCancelled: ", "activated");
                    }
                });
            }
        }
    }
}

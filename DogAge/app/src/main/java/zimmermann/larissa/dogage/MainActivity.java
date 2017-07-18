package zimmermann.larissa.dogage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText dogAge;
    private Button discoveryButton;
    private TextView realAge;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dogAge = (EditText) findViewById(R.id.ageEnterId);
        discoveryButton = (Button) findViewById(R.id.buttonAgeId);
        realAge = (TextView) findViewById(R.id.answerTextId);

        discoveryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String age = dogAge.getText().toString();

                if(age.isEmpty()) {
                    //Empty String -> show error message
                    realAge.setText("Please, enter the age of your dog.");
                }
                else {
                    int ageValue = Integer.parseInt(age);
                    int result = ageValue*7;
                    realAge.setText("Dog's age in human years is: " + result + " years old.");
                }
            }
        });
    }
}

package briansapps.com.statecapitals;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    int mAnswer, intA, intB, intC, intD, intE, mFinal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String Capital[] = {

                "Montgomery",
                "Juneau",
                "Phoenix",
                "Little Rock",
                "Sacramento",
                "Denver",
                "Hartford",
                "Dover",
                "Tallahassee",
                "Atlanta",
                "Honolulu",
                "Boise",
                "Springfield",
                "Indianapolis",
                "Des Moines",
                "Topeka",
                "Frankfort",
                "Baton Rouge",
                "Augusta",
                "Annapolis",
                "Boston",
                "Lansing",
                "Saint Paul",
                "Jackson",
                "Jefferson City",
                "Helena",
                "Lincoln",
                "Carson City",
                "Concord",
                "Trenton",
                "Santa Fe",
                "Albany",
                "Raleigh",
                "Bismarck",
                "Columbus",
                "Oklahoma City",
                "Salem",
                "Harrisburg",
                "Providence",
                "Columbia",
                "Pierre",
                "Nashville",
                "Austin",
                "Salt Lake City",
                "Montpelier",
                "Richmond",
                "Olympia",
                "Charleston",
                "Madison",
                "Cheyenne"

        };

        String State[] = {

                "Alabama",
                "Alaska",
                "Arizona",
                "Arkansas",
                "California",
                "Colorado",
                "Connecticut",
                "Delaware",
                "Florida",
                "Georgia",
                "Hawaii",
                "Idaho",
                "Illinois",
                "Indiana",
                "Iowa",
                "Kansas",
                "Kentucky",
                "Louisiana",
                "Maine",
                "Maryland",
                "Massachusetts",
                "Michigan",
                "Minnesota",
                "Mississippi",
                "Missouri",
                "Montana",
                "Nebraska",
                "Nevada",
                "New Hampshire",
                "New Jersey",
                "New Mexico",
                "New York",
                "North Carolina",
                "North Dakota",
                "Ohio",
                "Oklahoma",
                "Oregon",
                "Pennsylvania",
                "Rhode Island",
                "South Carolina",
                "South Dakota",
                "Tennessee",
                "Texas",
                "Utah",
                "Vermont",
                "Virginia",
                "Washington",
                "West Virginia",
                "Wisconsin",
                "Wyoming"


        };


        final int RandomState = new Random().nextInt(50);
        final int RandomCapital1 = new Random().nextInt(50);
        final int RandomCapital2 = new Random().nextInt(50);
        final int RandomCapital3 = new Random().nextInt(50);
        final int RandomCapital4 = new Random().nextInt(50);
        final int RandomCapital5 = new Random().nextInt(50);

        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);

        int[] intArray = {RandomCapital1, RandomCapital2, RandomCapital3, RandomCapital4, RandomCapital5};
        int idx = new Random().nextInt(intArray.length);
        intArray[idx] = RandomState;

        button1.setText(Capital[intArray[0]]);
        button2.setText(Capital[intArray[1]]);
        button3.setText(Capital[intArray[2]]);
        button4.setText(Capital[intArray[3]]);
        button5.setText(Capital[intArray[4]]);
        button6.setText(State[RandomState]);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);

        intA = intArray[0];
        intB = intArray[1];
        intC = intArray[2];
        intD = intArray[3];
        intE = intArray[4];
        mFinal = RandomState;

    }

   @Override
    public void onClick(View v) {
       switch (v.getId()) {
           case R.id.button1:
               //Toast.makeText(this, "Button 1 clicked", Toast.LENGTH_SHORT).show();
               if (intA == mFinal) {
                   Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show();

               } else {
                   Toast.makeText(this, "Incorrect!", Toast.LENGTH_SHORT).show();
                   //Toast.makeText(this, "Result="+intA, Toast.LENGTH_SHORT).show();
                   //Toast.makeText(this, "Result="+mFinal, Toast.LENGTH_SHORT).show();
                   break;
               }
               finish();
               startActivity(getIntent());
               break;
           case R.id.button2:
               if (intB == mFinal) {
                   Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show();
               } else {
                   Toast.makeText(this, "Incorrect!", Toast.LENGTH_SHORT).show();
                   break;
               }
               finish();
               startActivity(getIntent());
               break;
           case R.id.button3:
               if (intC == mFinal) {
                   Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show();
               } else {
                   Toast.makeText(this, "Incorrect!", Toast.LENGTH_SHORT).show();
                   break;
               }
               finish();
               startActivity(getIntent());
               break;
           case R.id.button4:
               if (intD == mFinal) {
                   Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show();
               } else {
                   Toast.makeText(this, "Incorrect!", Toast.LENGTH_SHORT).show();
                   break;
               }
               finish();
               startActivity(getIntent());
               break;
           case R.id.button5:
               if (intE == mFinal) {
                   Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show();
               } else {
                   Toast.makeText(this, "Incorrect!", Toast.LENGTH_SHORT).show();
                   break;
               }
               finish();
               startActivity(getIntent());
               break;
       }
    }
}

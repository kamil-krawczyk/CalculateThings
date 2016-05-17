package ca.kamilkrawczyk.calculatethings;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Creating variables for the two input fields.
    private EditText input1;
    private EditText input2;

    // Creating variables for the operation buttons.
    private Button button_Add;
    private Button button_Div;
    private Button button_Sub;
    private Button button_Mult;
    private Button button_Clear;

    // Lastly, create a variable for the resulting value.
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input1 = (EditText) findViewById(R.id.val_input1);
        input2 = (EditText) findViewById(R.id.val_input2);
        button_Add = (Button) findViewById(R.id.btnAdd);
        button_Div = (Button) findViewById(R.id.btnDiv);
        button_Sub = (Button) findViewById(R.id.btnSub);
        button_Mult = (Button) findViewById(R.id.btnMult);
        button_Clear = (Button) findViewById(R.id.btnClr);
        result = (TextView) findViewById(R.id.val_result);

        // The operational functions are shown here.
        // Button for addition; performs the self-explanatory action!
        button_Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((input1.getText().length() > 0) && (input2.getText().length() > 0)) {
                    double val1 = Double.parseDouble(input1.getText().toString());
                    double val2 = Double.parseDouble(input2.getText().toString());

                    double res = val1 + val2;

                    result.setText(Double.toString(res));

                } else {
                    Toast.makeText(MainActivity.this, "Please enter a number!", Toast.LENGTH_LONG).show();
                }
            }
        });

        // Button for subtraction.
        button_Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((input1.getText().length() > 0)&&(input2.getText().length() > 0)) {
                    double val1 = Double.parseDouble(input1.getText().toString());
                    double val2 = Double.parseDouble(input2.getText().toString());

                    double res = val1 - val2;

                    result.setText(Double.toString(res));

                } else {
                    Toast.makeText(MainActivity.this, "Please enter a number!", Toast.LENGTH_LONG).show();
                }
            }
        });

        // Button for divison.
        button_Div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((input1.getText().length() > 0) && (input2.getText().length() > 0)) {
                    double val1 = Double.parseDouble(input1.getText().toString());
                    double val2 = Double.parseDouble(input2.getText().toString());

                    double res = val1 / val2;

                    result.setText(Double.toString(res));

                } else {
                    Toast.makeText(MainActivity.this, "Please enter a number!", Toast.LENGTH_LONG).show();
                }
            }
        });

        // Button for multiplication.
        button_Mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((input1.getText().length() > 0) && (input2.getText().length() > 0)) {
                    double val1 = Double.parseDouble(input1.getText().toString());
                    double val2 = Double.parseDouble(input2.getText().toString());

                    double res = val1 * val2;

                    result.setText(Double.toString(res));

                } else {
                    Toast.makeText(MainActivity.this, "Please enter a number!", Toast.LENGTH_LONG).show();
                }
            }
        });

        // This is our clear button, which will remove the values in the given fields.
        button_Clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Clears input and output fields.
                input1.setText("");
                input2.setText("");
                result.setText("0.00");

                // Resets to first input.
                input1.requestFocus();

            }
        });
    }
}

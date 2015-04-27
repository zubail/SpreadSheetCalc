package id.ac.unsyiah.jte.mobile.spreadsheetcalc;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void onClickBtnHitung(View view){

        int noinput = 0;

        EditText editTextcel1_1 = (EditText) findViewById(R.id.cel1_1);
        String num_cel1_1Str = String.valueOf(editTextcel1_1.getText());
        int num_cel1_1;
        if (num_cel1_1Str.length() == noinput){
            num_cel1_1 = 0;
            editTextcel1_1.setText("0");
        }else{
            num_cel1_1 = Integer.valueOf(num_cel1_1Str);
        }

        EditText editTextcel1_2 = (EditText) findViewById(R.id.cel1_2);
        String num_cel1_2Str = String.valueOf(editTextcel1_2.getText());
        int num_cel1_2;
        if (num_cel1_2Str.length() == noinput){
            num_cel1_2 = 0;
            editTextcel1_2.setText("0");
        }else{
            num_cel1_2 = Integer.valueOf(num_cel1_2Str);
        }

        EditText editTextcel1_3 = (EditText) findViewById(R.id.cel1_3);
        int num_cel1_3 = num_cel1_1+num_cel1_2;
        editTextcel1_3.setText(String.valueOf(num_cel1_3));

        EditText editTextcel2_1 = (EditText) findViewById(R.id.cel2_1);
        String num_cel2_1Str = String.valueOf(editTextcel2_1.getText());
        int num_cel2_1;
        if (num_cel2_1Str.length() == noinput){
            num_cel2_1 = 0;
            editTextcel2_1.setText("0");
        }else {
            num_cel2_1 = Integer.valueOf(num_cel2_1Str);
        }

        EditText editTextcel2_2 = (EditText) findViewById(R.id.cel2_2);
        String num_cel2_2Str = String.valueOf(editTextcel2_2.getText());
        int num_cel2_2;
        if (num_cel2_2Str.length() == noinput){
            num_cel2_2 = 0;
            editTextcel2_2.setText("0");
        }else{
            num_cel2_2 = Integer.valueOf(num_cel2_2Str);
        }

        EditText editTextcel2_3 = (EditText) findViewById(R.id.cel2_3);
        int num_cel2_3 = num_cel2_1+num_cel2_2;

        editTextcel2_3.setText(String.valueOf(num_cel2_3));

        EditText editTextcel3_1 = (EditText) findViewById(R.id.cel3_1);
        int num_cel3_1 = num_cel1_1+num_cel2_1;

        editTextcel3_1.setText(String.valueOf(num_cel3_1));

        EditText editTextcel3_2 = (EditText) findViewById(R.id.cel3_2);
        int num_cel3_2 = num_cel1_2+num_cel2_2;
        editTextcel3_2.setText(String.valueOf(num_cel3_2));

        EditText editTextcel3_3 = (EditText) findViewById(R.id.cel3_3);
        int num_cel3_3 = num_cel1_3+num_cel2_3;
        editTextcel3_3.setText(String.valueOf(num_cel3_3));

    }
}
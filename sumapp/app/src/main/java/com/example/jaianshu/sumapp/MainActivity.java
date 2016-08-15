package com.example.jaianshu.sumapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
        addListenerToCheckBox();
    }

    public  void onButtonClick(View V){
        EditText e1 = (EditText)findViewById(R.id.editText);
        EditText e2 = (EditText)findViewById(R.id.editText2);
        TextView t1 = (TextView)findViewById(R.id.textView2);
        int num1 = Integer.parseInt(e1.getText().toString());
        int num2 = Integer.parseInt(e2.getText().toString());
        int sum = num1 + num2;
        t1.setText(Integer.toString(sum));
    }

    private CheckBox check1, check2, check3;
    private Button button_sel;

    public void addListenerToCheckBox(){
        check1 = (CheckBox)findViewById(R.id.checkBox1);
        check1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v){
                        if(((CheckBox)v).isChecked()){
                            Toast.makeText(MainActivity.this,
                                    "dog is selected", Toast.LENGTH_LONG).show();
                        }
                    }
                }
        );
    }

    public void addListenerOnButton(){
        check1 = (CheckBox)findViewById(R.id.checkBox1);
        check2 = (CheckBox)findViewById(R.id.checkBox2);
        check3 = (CheckBox)findViewById(R.id.checkBox3);
        button_sel = (Button)findViewById(R.id.button2);

        button_sel.setOnClickListener( new View.OnClickListener(){
                                   @Override
                                   public void onClick(View v){
                                       StringBuffer result = new StringBuffer();
                                       result.append("Dog : ").append(check1.isChecked());
                                       result.append("Cat : ").append(check2.isChecked());
                                       result.append("Cow : ").append(check3.isChecked());
                                       Toast.makeText(MainActivity.this,result.toString(),
                                               Toast.LENGTH_LONG).show();
                                   }
                               }

        );
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
}

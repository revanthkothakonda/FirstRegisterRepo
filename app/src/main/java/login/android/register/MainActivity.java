package login.android.register;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
CheckBox cricket,cooking,music,dance;
    RadioGroup rg;
    RadioButton rb;
    EditText username,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void main2(View view)
    {
        username=(EditText) findViewById(R.id.id_name);
        password=(EditText) findViewById(R.id.id_pwd);

        cricket=(CheckBox) findViewById(R.id.id_cricket);
        cooking=(CheckBox) findViewById(R.id.id_cooking);
        music=(CheckBox) findViewById(R.id.id_music);
        dance=(CheckBox) findViewById(R.id.id_dance);

        rg=(RadioGroup) findViewById(R.id.group);

        StringBuilder details=new StringBuilder();
        details.append("Details u have entered:\n ");

        StringBuilder name=new StringBuilder();
        name.append("Your name is : ");

        StringBuilder pwd=new StringBuilder();
        pwd.append("Your Password is : ");

        StringBuilder idgen=new StringBuilder();
        idgen.append("Your gender is : ");

        int id=rg.getCheckedRadioButtonId();
        rb=(RadioButton) findViewById(id);
        String gen=rb.getText().toString();



        StringBuilder hobbies=new StringBuilder();
        hobbies.append("Your hobbies are: ");


        if(cricket.isChecked())
        {
            hobbies.append(cricket.getText()+" ");
        }
        if(cooking.isChecked())
        {
            hobbies.append(cooking.getText()+" ");
        }
        if(music.isChecked())
        {
            hobbies.append(music.getText()+" ");
        }
        if(dance.isChecked())
        {
            hobbies.append(dance.getText()+" ");
        }

        Toast.makeText(this,details,Toast.LENGTH_LONG).show();
        Toast.makeText(this,name,Toast.LENGTH_SHORT).show();
        Toast.makeText(this,username.getText().toString(),Toast.LENGTH_LONG).show();
        username.setText(null);
        Toast.makeText(this,pwd,Toast.LENGTH_SHORT).show();
        Toast.makeText(this,password.getText().toString(),Toast.LENGTH_LONG).show();
        password.setText(null);
        Toast.makeText(this,idgen,Toast.LENGTH_SHORT).show();
        Toast.makeText(this,rb.getText(),Toast.LENGTH_LONG).show();
        Toast.makeText(this,hobbies,Toast.LENGTH_LONG).show();
        cricket.setChecked(false);
        cooking.setChecked(false);
        music.setChecked(false);
        dance.setChecked(false);

    }
}

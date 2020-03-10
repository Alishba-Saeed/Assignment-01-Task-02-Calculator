package pk.edu.pucit.calculator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import bsh.*;
public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView tv_result;
    private TextView tv_equation;
//    private TextView tv_calculate;
    private TextView tv_add;
    private TextView tv_sub;
    private TextView tv_ac;
    private TextView tv_div;
    private TextView tv_mult;
    private TextView tv_1;
    private TextView tv_2;
    private TextView tv_3;
    private TextView tv_4;
    private TextView tv_5;
    private TextView tv_6;
    private TextView tv_7;
    private TextView tv_8;
    private TextView tv_9;
    private TextView tv_0;
    private TextView tv_00;
    private TextView tv_del;
    private TextView tv_mod;
    private TextView tv_dec;
    private TextView tv_equals;
    private String output=new String();
    double result=0.0;
    String msg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_result=(TextView) findViewById(R.id.tv_result);
        tv_equation=(TextView) findViewById(R.id.tv_equation);
//        tv_calculate=(TextView) findViewById(R.id.);
        tv_add=(TextView) findViewById(R.id.tv_add);
        tv_sub=(TextView) findViewById(R.id.tv_sub);
        tv_mult=(TextView) findViewById(R.id.tv_mult);
        tv_div=(TextView) findViewById(R.id.tv_div);
        tv_mod=(TextView) findViewById(R.id.tv_mod);
        tv_del=(TextView) findViewById(R.id.tv_del);
        tv_dec=(TextView) findViewById(R.id.tv_dec);
        tv_ac=(TextView) findViewById(R.id.tv_ac);
        tv_equals=(TextView) findViewById(R.id.tv_equals);
        tv_0=(TextView) findViewById(R.id.tv_0);
        tv_1=(TextView)findViewById(R.id.tv_1);
        tv_2=(TextView) findViewById(R.id.tv_2);
        tv_3=(TextView)findViewById(R.id.tv_3);
        tv_4=(TextView) findViewById(R.id.tv_4);
        tv_5=(TextView)findViewById(R.id.tv_5);
        tv_6=(TextView) findViewById(R.id.tv_6);
        tv_7=(TextView)findViewById(R.id.tv_7);
        tv_8=(TextView) findViewById(R.id.tv_8);
        tv_9=(TextView)findViewById(R.id.tv_9);
        tv_00=(TextView) findViewById(R.id.tv_00);
        tv_result.setOnClickListener(this);
        tv_equation.setOnClickListener(this);
        tv_add.setOnClickListener(this);
        tv_sub.setOnClickListener(this);
        tv_mult.setOnClickListener(this);
        tv_div.setOnClickListener(this);
        tv_mod.setOnClickListener(this);
        tv_equals.setOnClickListener(this);
        tv_dec.setOnClickListener(this);
        tv_00.setOnClickListener(this);
        tv_0.setOnClickListener(this);
        tv_1.setOnClickListener(this);
        tv_2.setOnClickListener(this);
        tv_3.setOnClickListener(this);
        tv_4.setOnClickListener(this);
        tv_5.setOnClickListener(this);
        tv_6.setOnClickListener(this);
        tv_7.setOnClickListener(this);
        tv_8.setOnClickListener(this);
        tv_9.setOnClickListener(this);
        tv_ac.setOnClickListener(this);
        tv_del.setOnClickListener(this);


    }
    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.tv_0:{
                String eq=tv_equation.getText().toString();
               // boolean flag=false;
                if(eq.length()>0) {
                int len = eq.length() - 1;
                char last = eq.charAt(len);
                if (last != '/') {
                    tv_equation.setText(tv_equation.getText().toString()+'0');

                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Cannot be divided by zero",Toast.LENGTH_SHORT).show();
                }
                output = tv_equation.getText().toString();
//                result=Double.parseDouble(output);
//                tv_result.setText(Double.toString(result));
                try {
                    Interpreter interpreter = new Interpreter();
                    interpreter.eval("result =" + output);
                    tv_result.setText(interpreter.get("result").toString());
                } catch (Exception e) {

                }
            }
                break;
            }
            case R.id.tv_1:{
                tv_equation.setText(tv_equation.getText().toString()+'1');
                output=tv_equation.getText().toString();
                try {
                    Interpreter interpreter = new Interpreter();
                    interpreter.eval("result ="+output );
                    tv_result.setText(interpreter.get("result").toString());
                }catch (Exception e)
                {

                }
                break;
            }
            case R.id.tv_2:{
                tv_equation.setText(tv_equation.getText().toString()+'2');
                output=tv_equation.getText().toString();
                try {
                    Interpreter interpreter = new Interpreter();
                    interpreter.eval("result ="+output );
                    tv_result.setText(interpreter.get("result").toString());
                }catch (Exception e)
                {

                }
                break;
            }
            case R.id.tv_3:{
                tv_equation.setText(tv_equation.getText().toString()+'3');
                output=tv_equation.getText().toString();
                try {
                    Interpreter interpreter = new Interpreter();
                    interpreter.eval("result ="+output );
                    tv_result.setText(interpreter.get("result").toString());
                }catch (Exception e)
                {

                }
                break;
            }
            case R.id.tv_4:{
                tv_equation.setText(tv_equation.getText().toString()+'4');
                output=tv_equation.getText().toString();
                try {
                    Interpreter interpreter = new Interpreter();
                    interpreter.eval("result ="+output );
                    tv_result.setText(interpreter.get("result").toString());
                }catch (Exception e)
                {

                }
                break;
            }
            case R.id.tv_5:{
                tv_equation.setText(tv_equation.getText().toString()+'5');
                output=tv_equation.getText().toString();
                try {
                    Interpreter interpreter = new Interpreter();
                    interpreter.eval("result ="+output );
                    tv_result.setText(interpreter.get("result").toString());
                }catch (Exception e)
                {

                }
                break;
            }
            case R.id.tv_6:{
                tv_equation.setText(tv_equation.getText().toString()+'6');
                output=tv_equation.getText().toString();
                try {
                    Interpreter interpreter = new Interpreter();
                    interpreter.eval("result ="+output );
                    tv_result.setText(interpreter.get("result").toString());
                }catch (Exception e)
                {

                }
                break;
            }
            case R.id.tv_7:{
                tv_equation.setText(tv_equation.getText().toString()+'7');
                output=tv_equation.getText().toString();
                try {
                    Interpreter interpreter = new Interpreter();
                    interpreter.eval("result ="+output );
                    tv_result.setText(interpreter.get("result").toString());
                }catch (Exception e)
                {

                }
                break;
            }
            case R.id.tv_8:{
                tv_equation.setText(tv_equation.getText().toString()+'8');
                output=tv_equation.getText().toString();
                try {
                    Interpreter interpreter = new Interpreter();
                    interpreter.eval("result ="+output );
                    tv_result.setText(interpreter.get("result").toString());
                }catch (Exception e)
                {

                }
                break;
            }
            case R.id.tv_9:{
                tv_equation.setText(tv_equation.getText().toString()+'9');
                output=tv_equation.getText().toString();
                try {
                    Interpreter interpreter = new Interpreter();
                    interpreter.eval("result ="+output );
                    tv_result.setText(interpreter.get("result").toString());
                }catch (Exception e)
                {

                }
                break;
            }
            case R.id.tv_00:{
                String eq=tv_equation.getText().toString();
                // boolean flag=false;
                if(eq.length()>0) {
                    int len = eq.length() - 1;
                    char last = eq.charAt(len);
                    if (last != '/') {
                        tv_equation.setText(tv_equation.getText().toString()+"00");

                    } else {
                        Toast.makeText(getApplicationContext(), "Cannot be divided by zero", Toast.LENGTH_SHORT).show();
                    }
                    output = tv_equation.getText().toString();
                    try {
                        Interpreter interpreter = new Interpreter();
                        interpreter.eval("result =" + output);
                        tv_result.setText(interpreter.get("result").toString());
                    } catch (Exception e) {

                    }
                }
                break;
            }
            case R.id.tv_add:{
                String eq=tv_equation.getText().toString();
                if(eq.length()>0) {
                    int len=eq.length()-1;
                    char last = eq.charAt(len);
                    if(last=='+' || last=='-' || last =='%' || last=='*'||last=='/')
                    {
                        char ch='+';
                        eq=eq.substring(0,len)+ch;
                        tv_equation.setText(eq);
                    }
                    else {
                        tv_equation.setText(tv_equation.getText().toString() + '+');
                    }
                    output = tv_equation.getText().toString();
                    try {
                        Interpreter interpreter = new Interpreter();
                        interpreter.eval("result =" + output);
                        tv_result.setText(interpreter.get("result").toString());
                    } catch (Exception e) {

                    }
                }
                break;
            }
            case R.id.tv_sub:{
                String eq=tv_equation.getText().toString();
                if(eq.length()>0) {
                    int len = eq.length() - 1;
                    char last = eq.charAt(len);
                    if (last == '+' || last == '-' || last == '%' || last == '*'||last=='/') {
                        char ch = '-';
                        eq = eq.substring(0, len) + ch;
                        tv_equation.setText(eq);
                    } else {
                        tv_equation.setText(tv_equation.getText().toString() + '-');
                    }
                    output = tv_equation.getText().toString();
                    try {
                        Interpreter interpreter = new Interpreter();
                        interpreter.eval("result =" + output);
                        tv_result.setText(interpreter.get("result").toString());
                    } catch (Exception e) {

                    }
                }
                break;
            }
            case R.id.tv_mult:{
                String eq=tv_equation.getText().toString();
                if(eq.length()>0) {
                    int len = eq.length() - 1;
                    char last = eq.charAt(len);
                    if (last == '+' || last == '-' || last == '%' || last == '*'||last=='/') {
                        char ch = '*';
                        eq = eq.substring(0, len) + ch;
                        tv_equation.setText(eq);
                    } else {
                        tv_equation.setText(tv_equation.getText().toString() + '*');
                    }
                    output = tv_equation.getText().toString();
                    try {
                        Interpreter interpreter = new Interpreter();
                        interpreter.eval("result =" + output);
                        tv_result.setText(interpreter.get("result").toString());
                    } catch (Exception e) {

                    }
                }
                break;
            }
            case R.id.tv_div:{
                Double res=0.0;
                String eq=tv_equation.getText().toString();
                if(eq.length()>0) {
                    int len = eq.length() - 1;
                    char last = eq.charAt(len);
                    if (last == '+' || last == '-' || last == '%' || last == '*'||last=='/') {
                        char ch = '/';
                        eq = eq.substring(0, len) + ch;
                        tv_equation.setText(eq);
                    } else {
                        tv_equation.setText(tv_equation.getText().toString() + '/');
                    }
                }
                output=tv_equation.getText().toString();
                try {
                    Interpreter interpreter = new Interpreter();
                    res= Double.parseDouble(interpreter.eval(output ).toString());
                    output=String.valueOf(res);
                    tv_result.setText(output);
                }catch (Exception e)
                {

                }
                break;
            }
            case R.id.tv_mod:{
                String eq=tv_equation.getText().toString();
                if(eq.length()>0) {
                    int len = eq.length() - 1;
                    char last = eq.charAt(len);
                    if (last == '+' || last == '-' || last == '%' || last == '*'||last=='/') {
                        char ch = '%';
                        eq = eq.substring(0, len) + ch;
                        tv_equation.setText(eq);
                    } else {
                        tv_equation.setText(tv_equation.getText().toString() + '%');
                    }
                    output = tv_equation.getText().toString();
                    try {
                        Interpreter interpreter = new Interpreter();
                        interpreter.eval("result =" + output);
                        tv_result.setText(interpreter.get("result").toString());
                    } catch (Exception e) {

                    }
                }
                break;
            }
            case R.id.tv_dec:{
                 tv_equation.setText(tv_equation.getText().toString() + '.');

//                String eq=tv_equation.getText().toString();
//                if(!eq.contains(".")) {
//                    tv_equation.setText(tv_equation.getText().toString() + '.');
//                }
                output=tv_equation.getText().toString();
                try {
                    Interpreter interpreter = new Interpreter();
                    interpreter.eval("result ="+output );
                    tv_result.setText(interpreter.get("result").toString());
                }catch (Exception e)
                {

                }
                break;
            }
            case R.id.tv_del:{
             String eq=tv_equation.getText().toString();
             if(eq.length()>0)
             {
                 eq=eq.substring(0,eq.length()-1);
                 tv_equation.setText(eq);
                 output=tv_equation.getText().toString();
                 eq=tv_equation.getText().toString();
                 if(eq.length()==0)
                 {
                     tv_result.setText(null);
                     break;
                 }
                 try {
                     Interpreter interpreter = new Interpreter();
                     interpreter.eval("result ="+output );
                     tv_result.setText(interpreter.get("result").toString());
                 }catch (Exception e)
                 {

                 }
             }
             break;
            }
            case R.id.tv_ac:{
                tv_equation.setText(null);
                tv_result.setText(null);
                break;
            }
            case R.id.tv_equals:{
                tv_equation.setText(tv_result.getText().toString());
                tv_result.setText(null);
            }

        }
    }
}

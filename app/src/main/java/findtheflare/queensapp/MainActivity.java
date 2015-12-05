package findtheflare.queensapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    boolean login = false; //Variable used to check if the phone has already logged into an account
    static final int LOGINCODE = 1; //Request code for the login activity

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(login == false){//Checks if the phone is already logged in. Should be changed to check if a username and password is stored in local storage on the phone.
            checkLogin();
        }
    }

    public void checkLogin(){
        Intent openLoginActivity = new Intent(getApplicationContext(),LoginActivity.class);//Intent for opening the login activity
        startActivityForResult(openLoginActivity,LOGINCODE); //Start the activity to check if the person is logged in through facebook
    }

    public void onActivityResult(int requestCode,int resultCode,Intent data){ //Function for recieving data from other activities

        if(requestCode == LOGINCODE){ //Login activity data
            if(resultCode == RESULT_OK){

            }
            if(resultCode == RESULT_CANCELED){

            }
        }
    }
}

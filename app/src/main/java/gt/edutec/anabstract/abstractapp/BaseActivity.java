package gt.edutec.anabstract.abstractapp;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.header, menu);
        return true;
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("Base", "OnStart BaseActivity");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("Base", "OnPause BaseActivity");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("Base", "OnResume BaseActivity");
    }
}

package pe.edu.upc.b2capp;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

/**
 * Created by Renato on 6/8/2015.
 */
public class Conectate extends Activity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conectate);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        switch (id) {
            case R.id.menu_creados:
                //menu creados
                return true;
            case R.id.menu_favoritos:
                //menu favoritos
                return true;
            case R.id.menu_perfil:
                //menu favoritos
                return true;
            case R.id.menu_configuracion:
                //menu favoritos
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}

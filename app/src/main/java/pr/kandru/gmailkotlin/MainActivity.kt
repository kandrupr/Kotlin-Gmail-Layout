package pr.kandru.gmailkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.Toolbar
import android.util.Log
import android.view.View

class MainActivity : AppCompatActivity() {
    private lateinit var toolbar: Toolbar;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fab = findViewById<android.support.design.widget.FloatingActionButton>(R.id.fab)
        toolbar = findViewById<Toolbar>(R.id.toolbar)
        toolbar.setTitle("Primary")
        toolbar.setNavigationIcon(R.drawable.baseline_menu_white_24);
        toolbar.inflateMenu(R.menu.menu_main);
        setSupportActionBar(toolbar)
        toolbar.setNavigationOnClickListener(View.OnClickListener {
            // WORKS
            Log.d("Click", "Navigation Drawer");
        });

        fab.setOnClickListener(View.OnClickListener {
           Log.d("Click", "FAB")
        });
    }
}

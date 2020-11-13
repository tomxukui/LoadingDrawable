package app.dinus.com.example;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.goods).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, GoodsActivity.class);
                startActivity(intent);
            }

        });

        findViewById(R.id.animal).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AnimalActivity.class);
                startActivity(intent);
            }

        });

        findViewById(R.id.scenery).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SceneryActivity.class);
                startActivity(intent);
            }

        });

        findViewById(R.id.circle_jump).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CircleJumpActivity.class);
                startActivity(intent);
            }

        });

        findViewById(R.id.shape_change).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ShapeChangeActivity.class);
                startActivity(intent);
            }

        });

        findViewById(R.id.circle_rotate).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CircleRotateActivity.class);
                startActivity(intent);
            }

        });
    }

}
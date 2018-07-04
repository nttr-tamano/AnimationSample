package com.example.nttr.animationsample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                ViewPropertyAnimator animator = imageView.animate();
//                // 3秒かけて5回転
//                animator.setDuration(3000); // ms
//                animator.rotation(360.0f * 5.0f); // 360度×5回転

//                imageView.animate().setDuration(3000).rotation(360.0f * 5.0f);

//                // . で繋いで色々指定できる
//                imageView.animate().setDuration(3000).rotation(360.0f * 5.0f)
//                        .scaleX(3.0f).scaleY(3.0f).xBy(200).yBy(300);

                // imageView.animate().setDuration(3000).y(400);

//                // アニメーション効果、地面で跳ねる
//                imageView.animate().setInterpolator(new BounceInterpolator()).y(1000)
//                        .setDuration(1000);

                // アニメーション効果、行き過ぎて少し戻る
                imageView.animate().setInterpolator(new OvershootInterpolator()).y(1000)
                        .setDuration(1000);

            }
        });
    }
}

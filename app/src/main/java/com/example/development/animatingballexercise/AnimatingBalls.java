package com.example.development.animatingballexercise;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
/**
 * Created by Avijeet Kumar on 7/9/15.
 */
public class AnimatingBalls extends Activity {
    private AnimatingBallsView mAnimatingBallsView;
    private boolean mIsAnimResume=true;
    private Button mState;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        mAnimatingBallsView =new AnimatingBallsView(this);
        LinearLayout container = (LinearLayout) findViewById(R.id.container);
        container.addView(mAnimatingBallsView);
        mState=(Button)findViewById(R.id.state_btn);
        mState .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mIsAnimResume) {
                    mIsAnimResume = false;
                    mAnimatingBallsView.pasue();
                    mState.setText(R.string.txt_resume);
                } else {
                    mIsAnimResume = true;
                    mAnimatingBallsView.resume();
                    mState.setText(R.string.txt_pause);
                }
            }
        });

    }
}

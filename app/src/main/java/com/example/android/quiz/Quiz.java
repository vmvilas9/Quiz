package com.example.android.quiz;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Admin on 17-03-2018.
 */

public class Quiz extends AppCompatActivity {
    final String[] ques = {"1. India has ____ states.", "2. India has ____ union terrotries", "3. ____ is capital of India",
            "4. Indian National Flag has which of the following color(s).",
            "5. ____ is current Prime Minister of India", "6. ____ is Chief Minister of Delhi.", "7. ____ is Finance Minister of India.",
            "8. ____ is the highest peak of India.", "9. ____ is the captain of Indian Cricket Team.", "10. ____ is the national game of India.",};
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz);
        TextView ques1 = (TextView)findViewById(R.id.ques1);
        ques1.setText(ques[0]);
        ques1 = (TextView)findViewById(R.id.ques2);
        ques1.setText(ques[1]);
        ques1 = (TextView)findViewById(R.id.ques3);
        ques1.setText(ques[2]);
        ques1 = (TextView)findViewById(R.id.ques4);
        ques1.setText(ques[3]);
        ques1 = (TextView)findViewById(R.id.ques5);
        ques1.setText(ques[4]);
        ques1 = (TextView)findViewById(R.id.ques6);
        ques1.setText(ques[5]);
        ques1 = (TextView)findViewById(R.id.ques7);
        ques1.setText(ques[6]);
        ques1 = (TextView)findViewById(R.id.ques8);
        ques1.setText(ques[7]);
        ques1 = (TextView)findViewById(R.id.ques9);
        ques1.setText(ques[8]);
        ques1 = (TextView)findViewById(R.id.ques10);
        ques1.setText(ques[9]);
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
    }
    public void submitAns(View view){
        int[] ans = new int[ques.length];
        int score=0;
        RadioButton ans1 = (RadioButton)findViewById(R.id.ques1_choice3);
        if(ans1.isChecked()){
            ans[0] = 1;
        }
        else {
            ans[0] = 0;
        }
        EditText ans2 = (EditText)findViewById(R.id.ques2_edit);
        if(ans2.getText().toString().equals("7")){
            ans[1] = 1;
        }
        else{
            ans[1] = 0;
        }
        RadioButton ans3 = (RadioButton)findViewById(R.id.ques3_choice1);
        if(ans3.isChecked()){
            ans[2] = 1;
        }
        else {
            ans[2] = 0;
        }
        CheckBox ans4ch1 = (CheckBox)findViewById(R.id.ques4_choice1);
        CheckBox ans4ch2 = (CheckBox)findViewById(R.id.ques4_choice2);
        CheckBox ans4ch4 = (CheckBox)findViewById(R.id.ques4_choice4);
        if(ans4ch1.isChecked()&&ans4ch2.isChecked()&&ans4ch4.isChecked())
            ans[3] = 1;
        else
            ans[3] = 0;
        RadioButton ans5 = (RadioButton)findViewById(R.id.ques5_choice4);
        if(ans5.isChecked()){
            ans[4] = 1;
        }
        else {
            ans[4] = 0;
        }
        RadioButton ans6 = (RadioButton)findViewById(R.id.ques6_choice2);
        if(ans6.isChecked()){
            ans[5] = 1;
        }
        else {
            ans[5] = 0;
        }
        RadioButton ans7 = (RadioButton)findViewById(R.id.ques7_choice1);
        if(ans7.isChecked()){
            ans[6] = 1;
        }
        else {
            ans[6] = 0;
        }
        RadioButton ans8 = (RadioButton)findViewById(R.id.ques8_choice3);
        if(ans8.isChecked()){
            ans[7] = 1;
        }
        else {
            ans[7] = 0;
        }
        RadioButton ans9 = (RadioButton)findViewById(R.id.ques9_choice4);
        if(ans9.isChecked()){
            ans[8] = 1;
        }
        else {
            ans[8] = 0;
        }
        RadioButton ans10 = (RadioButton)findViewById(R.id.ques10_choice2);
        if(ans10.isChecked()){
            ans[9] = 1;
        }
        else {
            ans[9] = 0;
        }
        for(int i=0;i<ans.length;i++)
            score+=ans[i];
        String result;
        if(score==0){
            result="Poor!You scored:";
            result= result + score + "Points";
        }
        else if(score>0&&score<5){
            result="Good!You scored:";
            result= result + score + "Points";
        }
        else if (score>=5&&score<=9){
            result="Excellent!You scored:";
            result= result + score + "Points";
        }
        else
            result="Awesome!You know everything about India";
        Toast.makeText(this,result,Toast.LENGTH_SHORT).show();
        score=0;
    }
}

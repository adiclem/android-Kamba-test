package com.acelabs.kambaapi.controller;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.acelabs.kambaapi.R;

public class DetailActivity extends AppCompatActivity {

    TextView mToTv, mAmountTV, mDescriptionTv, mDateTv;
    TextView mBankTv, mStatusTv;
    TextView mPaymentMethod, mAccountType;
    ConstraintLayout constraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        String transaction_type = getIntent().getExtras().getString("transaction_type");

        if(transaction_type.equals("DEPOSIT")){

            getSupportActionBar().setTitle("Deposit details");
            String to = getIntent().getExtras().getString("to");
            String amount = getIntent().getExtras().getString("amount");
            String paymentMethod = getIntent().getExtras().getString("paymentMethod");
            String accountType = getIntent().getExtras().getString("accountType");
            String bank = getIntent().getExtras().getString("bank");
            String status = getIntent().getExtras().getString("status");
            String date = getIntent().getExtras().getString("date");

            hidePaymentLayout();
            hideWithdrawalLayout();
            initDepositViews();
            setDataToDepositViews(to, amount, paymentMethod, accountType, bank, status, date);

        }else if(transaction_type.equals("PAYMENT")){

            getSupportActionBar().setTitle("Payment details");
            String to = getIntent().getExtras().getString("to");
            String amount = getIntent().getExtras().getString("amount");
            String description = getIntent().getExtras().getString("description");
            String date = getIntent().getExtras().getString("date");

            hideWithdrawalLayout();
            initPaymentViews();
            setDataToPaymentViews(to, amount, description, date);

        }else if(transaction_type.equals("RECHARGE")){


        }else if(transaction_type.equals("WITHDRAWAL")){

            getSupportActionBar().setTitle("Withdrawal details");
            String amount = getIntent().getExtras().getString("amount");
            String bank = getIntent().getExtras().getString("bank");
            String status = getIntent().getExtras().getString("status");
            String data = getIntent().getExtras().getString("date");

            hidePaymentLayout();
            hideDepositLayout();
            initWithdrawalViews();
            setDataToWithdrawalViews(amount, bank, status, data);
        }

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case android.R.id.home:
                this.finish();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void initPaymentViews(){
        constraintLayout = (ConstraintLayout) findViewById(R.id.payment_layout);
        constraintLayout.setVisibility(View.VISIBLE);
        mToTv = (TextView) findViewById(R.id.to_txt);
        mAmountTV = (TextView) findViewById(R.id.amount_txt);
        mDescriptionTv = (TextView) findViewById(R.id.description_txt);
        mDateTv = (TextView) findViewById(R.id.date_txt);
    }

    public void hidePaymentLayout(){
        constraintLayout = (ConstraintLayout) findViewById(R.id.payment_layout);
        constraintLayout.setVisibility(View.INVISIBLE);
    }

    public void setDataToPaymentViews(String to, String amount, String description, String date){
        mToTv.setText(to);
        mAmountTV.setText(amount + " Kz");
        mDescriptionTv.setText(description);
        mDateTv.setText(date);
    }

    public void initWithdrawalViews(){
        constraintLayout = (ConstraintLayout) findViewById(R.id.withdrawal_layout);
        constraintLayout.setVisibility(View.VISIBLE);
        mAmountTV = (TextView) findViewById(R.id.withdrawal_amount_txt);
        mBankTv = (TextView) findViewById(R.id.withdrawal_bank_txt);
        mStatusTv = (TextView) findViewById(R.id.withdrawal_status_txt);
        mDateTv = (TextView) findViewById(R.id.withdrawal_date_txt);
    }

    public void hideWithdrawalLayout(){
        constraintLayout = (ConstraintLayout) findViewById(R.id.withdrawal_layout);
        constraintLayout.setVisibility(View.INVISIBLE);
    }

    public void setDataToWithdrawalViews(String amount, String bank, String status, String date){
        mAmountTV.setText(amount + " Kz");
        mBankTv.setText(bank);
        mStatusTv.setText(status);
        mDateTv.setText(date);
    }

    public void initDepositViews(){
        constraintLayout = (ConstraintLayout) findViewById(R.id.deposit_layout);
        constraintLayout.setVisibility(View.VISIBLE);
        mToTv = (TextView) findViewById(R.id.deposit_to_txt);
        mAmountTV = (TextView) findViewById(R.id.deposit_amount_txt);
        mPaymentMethod = (TextView) findViewById(R.id.deposit_payment_method_txt);
        mAccountType = (TextView) findViewById(R.id.deposit_account_type_txt);
        mBankTv = (TextView) findViewById(R.id.deposit_bank_txt);
        mStatusTv = (TextView) findViewById(R.id.deposit_status_txt);
        mDateTv = (TextView) findViewById(R.id.deposit_date_txt);
    }

    public void hideDepositLayout(){
        constraintLayout = (ConstraintLayout) findViewById(R.id.deposit_layout);
        constraintLayout.setVisibility(View.INVISIBLE);
    }

    public void setDataToDepositViews(String to, String amount, String paymentMethod, String accountType, String bank, String status, String date){
        mToTv.setText(to);
        mAmountTV.setText(amount + " Kz");
        mPaymentMethod.setText(paymentMethod);
        mAccountType.setText(accountType);
        mBankTv.setText(bank);
        mStatusTv.setText(status);
        mDateTv.setText(date);
    }

}

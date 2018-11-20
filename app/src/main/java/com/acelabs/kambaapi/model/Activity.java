package com.acelabs.kambaapi.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Activity {

    @Expose
    @SerializedName("created_at")
    private String created_at;
    @Expose
    @SerializedName("status")
    private String status;
    @Expose
    @SerializedName("transaction_type")
    private String transaction_type;
    @Expose
    @SerializedName("description")
    private String description;
    @Expose
    @SerializedName("to")
    private To to;
    @Expose
    @SerializedName("from")
    private From from;
    @Expose
    @SerializedName("fee")
    private int fee;
    @Expose
    @SerializedName("subtotal")
    private int subtotal;
    @Expose
    @SerializedName("amount")
    private int amount;
    @Expose
    @SerializedName("intent")
    private String intent;
    @Expose
    @SerializedName("id")
    private String id;

    //Deposit Attributes
    @Expose
    @SerializedName("payment_method")
    private PaymentMethod payment_method;
    @Expose
    @SerializedName("company_bank_account")
    private CompanyBankAccount company_bank_account;

    //WithDrawal Attributes
    @Expose
    @SerializedName("bank_account")
    private BankAccount bank_account;
    @Expose
    @SerializedName("paid")
    private boolean paid;
    @Expose
    @SerializedName("committed")
    private boolean committed;
    @Expose
    @SerializedName("updated_at")
    private String updated_at;

    //Recharge Attributes
    @Expose
    @SerializedName("amount_paid")
    private int amount_paid;
    @Expose
    @SerializedName("mobile_operator_type")
    private String mobile_operator_type;
    @Expose
    @SerializedName("mobile_operator_name")
    private String mobile_operator_name;
    @Expose
    @SerializedName("validity_days")
    private int validity_days;
    @Expose
    @SerializedName("amount_of_utts")
    private int amount_of_utts;
    @Expose
    @SerializedName("recharge_price")
    private int recharge_price;
    @Expose
    @SerializedName("recharge_code")
    private String recharge_code;
    @Expose
    @SerializedName("mobile_recharge_card_id")
    private String mobile_recharge_card_id;
    @Expose
    @SerializedName("phone_number")
    private String phone_number;
    @Expose
    @SerializedName("transaction_id")
    private String transaction_id;


    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTransaction_type() {
        return transaction_type;
    }

    public void setTransaction_type(String transaction_type) {
        this.transaction_type = transaction_type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public To getTo() {
        return to;
    }

    public void setTo(To to) {
        this.to = to;
    }

    public From getFrom() {
        return from;
    }

    public void setFrom(From from) {
        this.from = from;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public int getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(int subtotal) {
        this.subtotal = subtotal;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getIntent() {
        return intent;
    }

    public void setIntent(String intent) {
        this.intent = intent;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PaymentMethod getPayment_method() {
        return payment_method;
    }

    public void setPayment_method(PaymentMethod payment_method) {
        this.payment_method = payment_method;
    }

    public CompanyBankAccount getCompany_bank_account() {
        return company_bank_account;
    }

    public void setCompany_bank_account(CompanyBankAccount company_bank_account) {
        this.company_bank_account = company_bank_account;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public boolean isCommitted() {
        return committed;
    }

    public void setCommitted(boolean committed) {
        this.committed = committed;
    }


    public BankAccount getBank_account() {
        return bank_account;
    }

    public void setBank_account(BankAccount bank_account) {
        this.bank_account = bank_account;
    }
}

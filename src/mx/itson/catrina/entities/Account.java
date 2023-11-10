/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.catrina.entities;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import java.util.List;
import mx.itson.catrina.enums.Type;

/**
 *
 * @author Luis Guerrero, Marco Lopez, Adlemi Duarte, Jonathan Felix.
 */
public class Account {
    //Define las variables utilizadas para la clase account.
     private String account; //Define la cuenta.
     private String clabe; //Define la clabe.
     private String currency; //Define el valor de la moneda.
    private Customer customer; //Define el usuario de la clase customer.
     private List <Transactions> transactions; //Define transactions como lista.
     
     //Deserealización json.
      public Account deserealize (String json){
        
          Account account = new Account();
        try{
          account = new Gson().fromJson(json, Account.class);
        } catch(JsonSyntaxException  ex){
            System.err.print("Ocurrio un error: "+ ex.getMessage());
            
        }
            return account;
            
        }
    /**
     * @return the account
     */
    public String getAccount() {
        return account;
    }

    /**
     * @param account the account to set
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * @return the clabe
     */
    public String getClabe() {
        return clabe;
    }

    /**
     * @param clabe the clabe to set
     */
    public void setClabe(String clabe) {
        this.clabe = clabe;
    }

    /**
     * @return the currency
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * @param currency the currency to set
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }
    
    /**
     * @return the customer
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * @param customer the customer to set
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /**
     * @return the transaction
     */
    public List <Transactions> getTransactions() {
        return transactions;
    }

    /**
     * @param transactions the transaction to set
     */
    public void setTransactions(List <Transactions> transactions) {
        this.transactions = transactions;
    }
    
     
}

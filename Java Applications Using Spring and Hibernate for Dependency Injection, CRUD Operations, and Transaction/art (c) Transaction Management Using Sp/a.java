package com.example.bankapp.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private double balance;

    public int getId() { return id; }
    public String getName() { return name; }
    public double getBalance() { return balance; }

    public void setName(String name) { this.name = name; }
    public void setBalance(double balance) { this.balance = balance; }
}

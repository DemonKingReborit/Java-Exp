package com.example.bankapp;

import com.example.bankapp.config.AppConfig;
import com.example.bankapp.service.BankService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        BankService bankService = context.getBean(BankService.class);
        bankService.transferMoney(1, 2, 500.0);

        System.out.println("Transaction completed successfully!");

        context.close();
    }
}

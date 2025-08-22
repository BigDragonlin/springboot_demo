package com.example.demo;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Value;
import java.util.List;

@Service("stripePaymentService")
public class StripePaymentService implements PaymentService {
    @Value("${stripe.api.url}")
    private String apiUrl;

    @Value("${stripe.enabled}")
    private boolean enabled;

    @Value("${stripe.timeout}")
    private int timeout;

    @Value("${stripe.supportedCurrencies}")
    private List<String> supportedCurrencies;

    @Override
    public void processPayment(int amount){
        System.out.println("Processing payment of " + amount + " using Stripe");

        System.out.println("API URL: " + apiUrl);
        System.out.println("Enabled: " + enabled);
        System.out.println("Timeout: " + timeout);
        System.out.println("Supported Currencies: " + supportedCurrencies);
    }
}
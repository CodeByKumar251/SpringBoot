package com.conceptandcoding.learningspringboot.Repository;

import com.conceptandcoding.learningspringboot.DTO.PaymentRequest;
import com.conceptandcoding.learningspringboot.Entity.PaymentEntity;
import org.springframework.stereotype.Repository;

@Repository
public class PaymentRepository {

    public  PaymentEntity getPaymentById(PaymentRequest request){
        PaymentEntity paymentModel=executeQuery(request);
        return paymentModel;
    }

    private PaymentEntity executeQuery(PaymentRequest request){
        //connect with DB and fetch the data
        PaymentEntity payment=new PaymentEntity();
        payment.setId(request.getPaymentId());
        payment.setPaymentCurrency("INR");
        payment.setPaymentAmount(100.00);
        return payment;
    }


}

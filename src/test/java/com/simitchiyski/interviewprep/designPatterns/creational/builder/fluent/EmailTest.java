package com.simitchiyski.interviewprep.designPatterns.creational.builder.fluent;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmailTest {
    private static final String EXPECTED_EMAIL_RESULT = "Email{from='from@email.com_', to='to@email.com_', subject='Test subject', content='Test email content'}";

    @Test
    public void from() {
        Email email = Email
                .from("from@email.com_")
                .to("to@email.com_")
                .subject("Test subject")
                .content("Test email content")
                .build();

        assertEquals(EXPECTED_EMAIL_RESULT, email.toString());
        System.out.println("expected=" + EXPECTED_EMAIL_RESULT);
        System.out.println("result=" + email.toString());
    }
}
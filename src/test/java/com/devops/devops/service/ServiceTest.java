package com.devops.devops.service;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class ServiceTest {

    public Service service = new Service();

    @Test
    public void testString() {
        Assert.assertEquals(service.getString(), "Pratibha");
    }

    @Test
    public void testNumber() {
        Assert.assertEquals(service.getNumber(), 12);
    }

    @Test
    public void testBoolean() {
        Assert.assertEquals(service.getBoolean(), true);
    }
}

package com.example.unitarias;

import org.junit.Assert;
import org.junit.Test;

public class FakeAPiTest {
    @Test
    public void testGetAllEmployee() {
        IFakeApi fakeApi = new FakeApi();
        Assert.assertEquals(fakeApi.getEmployees().size(), 3);
    }


}

package org.newmap.test.chapter2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.newmap.chapter2.model.Customer;
import org.newmap.chapter2.service.CustomerService;

import java.util.List;

/**
 * Created by lx.sun on 2016-05-06.
 */
public class CustomerServiceTest {
    private final CustomerService customerService;

    public CustomerServiceTest() {
        this.customerService = new CustomerService();
    }

    @Before
    public void init(){
        //TODO 初始化数据库

    }

    @Test
    public void  getCustomerListTest() throws Exception{
        List<Customer> customerList = customerService.getCustomerList("");
        Assert.assertEquals(2,customerList.size());
    }
}

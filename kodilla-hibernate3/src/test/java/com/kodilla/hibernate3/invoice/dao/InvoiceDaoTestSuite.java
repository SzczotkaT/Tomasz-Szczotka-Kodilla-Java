package com.kodilla.hibernate3.invoice.dao;

import com.kodilla.hibernate3.invoice.Invoice;
import com.kodilla.hibernate3.invoice.Item;
import com.kodilla.hibernate3.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.math.BigDecimal;

@Transactional
@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave(){
        //Given
        Product product = new Product("Book");
        Product product2 = new Product("Pen");
        Product product3 = new Product("Paint");

        Item item = new Item(new BigDecimal(20), 5, new BigDecimal(100));
        Item item2 = new Item(new BigDecimal(2), 10, new BigDecimal(20));
        Item item3 = new Item(new BigDecimal(15), 6, new BigDecimal(90));

        Invoice invoice = new Invoice("2018-10-30/01");

        product.getItems().add(item);
        product2.getItems().add(item2);
        product3.getItems().add(item3);

        invoice.getItems().add(item);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        //When
        invoiceDao.save(item);
        int itemID = item.getId();
        invoiceDao.save(item2);
        int item2ID = item2.getId();
        invoiceDao.save(item3);
        int item3ID = item3.getId();

        Assert.assertNotEquals(0, itemID);
        Assert.assertNotEquals(0, item2ID);
        Assert.assertNotEquals(0, item3ID);
    }
}

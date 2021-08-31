package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private ItemDao itemDao;
    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    @Transactional
    public void testInvoiceDaoSave() {
        //Given
        Product firstProduct = new Product("firstProduct");
        Product secondProduct = new Product("secondProduct");
        Item firstItem = new Item(firstProduct, new BigDecimal("2300"), 4, new BigDecimal("5000"));
        Item secondItem = new Item(secondProduct, new BigDecimal("4500"), 5, new BigDecimal("7000"));
        Item thirdItem = new Item(secondProduct, new BigDecimal("1350"), 2, new BigDecimal("3100"));
        Invoice testInvoice1 = new Invoice("1234");
        Invoice testInvoice2 = new Invoice("1235");
        Invoice testInvoice3 = new Invoice("1236");

        //When
        itemDao.save(firstItem);
        itemDao.save(secondItem);
        itemDao.save(thirdItem);
        testInvoice1.setItem(firstItem);
        testInvoice2.setItem(secondItem);
        testInvoice3.setItem(secondItem);
        invoiceDao.save(testInvoice1);
        invoiceDao.save(testInvoice2);
        invoiceDao.save(testInvoice3);
        int id1 = testInvoice1.getId();
        int id2 = testInvoice2.getId();
        int id3 = testInvoice3.getId();

        //Then
        Assertions.assertNotEquals(0, id1);
        Assertions.assertNotEquals(0, id2);
        Assertions.assertNotEquals(0, id3);
    }
}

package com.example.lesson15;

import com.example.lesson16.model.Item;
import com.example.lesson16.model.Order;
import com.example.lesson16.repository.ItemRepository;
import com.example.lesson16.repository.OrderRepository;
import com.example.lesson16.service.ItemService;
import com.example.lesson16.service.OrderService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;

import java.util.List;

@ExtendWith(MockitoExtension.class)
@ContextConfiguration
class ServiceTest {

    ItemService itemService;

    OrderService orderService;

    @MockBean
    private ItemRepository itemRepo;

    @MockBean
    private OrderRepository orderRepo;

    @Test
    void getItems() {
        Item item1 = new Item();
        item1.setName("Spam");
        Item item2 = new Item();
        item2.setName("Eggs");

        Assertions.assertEquals(item1.getName(), "Spam");
        Assertions.assertEquals(item2.getName(), "Eggs");
    }

    @Test
    void getOrders() {
        Order order = new Order();
        order.setOrderDate(12);

        Assertions.assertEquals(order.getOrderDate(), 12);
    }

}
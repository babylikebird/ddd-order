package com.ddd.order.domain.converter;

import com.ddd.order.domain.entity.OrderItem;
import com.ddd.order.infrastructure.repository.dataobject.OrderItemDO;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Mr.Yangxiufeng
 * @date 2020-03-18 18:12
 */
public class OrderItemConverter {
    public static List<OrderItemDO> toOrderItemDO(List<OrderItem> items){
        List<OrderItemDO> itemDOs = items.stream().map(it -> {
            OrderItemDO itemDO = new OrderItemDO();
            itemDO.setItemCount(it.getCount());
            itemDO.setProductId(it.getProductId());
            itemDO.setItemPrice(it.getItemPrice());
            itemDO.setOrderId(it.getOrderId());
            return itemDO;
        }).collect(Collectors.toList());
        return itemDOs;
    }
}
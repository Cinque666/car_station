package by.station.controller;

import by.com.entity.Order;
import by.station.repository.OrderRepository;
import by.station.service.DeleteWashOrderService;
import by.station.service.WashOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/deleteOrder")
public class DeleteWashOrder {

    private DeleteWashOrderService deleteWashOrderService;

    @Autowired
    public void setDeleteWashOrderService(DeleteWashOrderService deleteWashOrderService) {
        this.deleteWashOrderService = deleteWashOrderService;
    }

    @RequestMapping("/{id}")
    public String getWashOrdersWithDeletion(@PathVariable Integer id, Model model){

        deleteWashOrderService.deleteOrder(id);
        List<Order> orders = deleteWashOrderService.getAllOrders();

        model.addAttribute("version", "wash");
        model.addAttribute("orders", orders);
        return "washOrders";
    }
}

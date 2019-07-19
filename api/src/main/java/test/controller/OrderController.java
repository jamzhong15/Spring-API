package test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import test.model.Customer;
import test.service.FoodOrderService;

import java.util.List;


@Controller // This identifies the controller class

public class OrderController
{
    @Autowired
    private FoodOrderService orderService;


    @PostMapping(path = "/new", consumes = MediaType.APPLICATION_JSON_VALUE)

    public @ResponseBody
    String addCustomer(@RequestBody Customer customer)
    {
        orderService.addCustomer(customer);
        return "Customer Added";
    }

    @PostMapping(path = "/order", consumes = MediaType.APPLICATION_JSON_VALUE)

    public @ResponseBody
    String addFoodItem(@RequestParam int id, @RequestParam String name)
    {
        orderService.addFoodItem(id, name);
        return "Order Added";
    }

    @GetMapping(path = "/find", produces = MediaType.APPLICATION_JSON_VALUE)

    public String findCustomer(@RequestParam Integer id)
    {
        return orderService.getCustomerById(id);
    }

    @DeleteMapping(path = "/delete")

    public String deleteCustomer(@RequestParam Integer id)
    {
        orderService.removeCustomerById(id);
        return "Order Deleted!";
    }

    @GetMapping(path = "/allCustomers")

    public void getAllCustomers(Model model)
    {
        List<String> list = orderService.getAllCustomersString();
        model.addAttribute("customers", list);
    }

    @GetMapping(path = "/customerNames")

    public void getCustomerNames(Model model)
    {
        List<Customer> list = orderService.getAllCustomers();
        model.addAttribute("customers", list);
    }

}

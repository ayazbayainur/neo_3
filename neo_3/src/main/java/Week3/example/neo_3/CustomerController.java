package Week3.example.neo_3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
//import java.util.Optional;

@RestController
@RequestMapping("/api")
public class CustomerController {
    private final CustomerRepository customerRepository;
    private final OrderRepository orderRepository;

    @Autowired
    public CustomerController(CustomerRepository customerRepository, OrderRepository orderRepository){
        this.customerRepository = customerRepository;
        this.orderRepository = orderRepository;
    }
    @PostMapping("/")
    public ResponseEntity<Customer> create(@Valid @RequestBody Customer customer) {
        Customer savedLibrary = customerRepository.save(customer);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(savedLibrary.getId()).toUri();

        return ResponseEntity.created(location).body(savedLibrary);
    }

}

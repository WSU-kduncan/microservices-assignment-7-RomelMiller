@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    // Helper method to get an order by ID
    public OrderDTO getOrderById(int id) {
        // Fetch order from repository
        // Throw custom NotFoundException if not found
        Order order = orderRepository.findById(id).orElseThrow(() -> new NotFoundException("Order not found"));
        return convertToDTO(order);
    }

    // Helper method to create a new order
    public OrderDTO createOrder(OrderDTO orderDTO) {
        // Convert DTO to entity and save
        Order order = convertToEntity(orderDTO);
        order = orderRepository.save(order);
        return convertToDTO(order);
    }
r
    public OrderDTO updateOrder(int id, OrderDTO orderDTO) {
        Order existingOrder = orderRepository.findById(id).orElseThrow(() -> new NotFoundException("Order not found"));
        updateEntity(existingOrder, orderDTO);
        orderRepository.save(existingOrder);
        return convertToDTO(existingOrder);
    }

    // Helper method to delete an order
    public void deleteOrder(int id) {
        Order order = orderRepository.findById(id).orElseThrow(() -> new NotFoundException("Order not found"));
        orderRepository.deleteById(id);
    }

    // Conversion methods (Entity <-> DTO)
    private OrderDTO convertToDTO(Order order) {
    }

    private Order convertToEntity(OrderDTO orderDTO) {

    }

    private void updateEntity(Order order, OrderDTO orderDTO) {
    }
}
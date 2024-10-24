public class OrderDTO {

    @NotNull
    private int id;

    @NotBlank
    private String orderDescription;

    @NotNull
    private Double totalPrice;


}
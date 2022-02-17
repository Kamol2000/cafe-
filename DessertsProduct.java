package by.cafe.models.product;

public class DessertsProduct extends Product{
    private int product_num;

    public DessertsProduct(int product_num) {
        this.product_num = product_num;
    }

    public DessertsProduct(int cost, String name, int product_num) {
        super(cost, name);
        this.product_num = product_num;
    }

    public int getProduct_num() {
        return product_num;
    }

    public void setProduct_num(int product_num) {
        this.product_num = product_num;
    }


    @Override
    public String toString() {
        return "DessertsProduct{" +
                "product_num=" + product_num +
                '}';
    }
}

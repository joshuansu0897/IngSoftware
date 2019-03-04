package brasseria.model;

import java.time.LocalDate;

public class Movimiento {

    private long id;
    private long product_id;
    private long added_amount;
    private long retired_amount;
    private long total;
    private LocalDate createAt;
    private LocalDate updateAt;

    public Movimiento() {
        this.id = -1;
    }

    public Movimiento(long product_id, long added_amount, long retired_amount, long total, LocalDate createAt, LocalDate updateAt) {
        this.id = -1;
        this.product_id = product_id;
        this.added_amount = added_amount;
        this.retired_amount = retired_amount;
        this.total = total;
        this.createAt = createAt;
        this.updateAt = updateAt;
    }

    public Movimiento(long id, long product_id, long added_amount, long retired_amount, long total, LocalDate createAt, LocalDate updateAt) {
        this.id = id;
        this.product_id = product_id;
        this.added_amount = added_amount;
        this.retired_amount = retired_amount;
        this.total = total;
        this.createAt = createAt;
        this.updateAt = updateAt;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(long product_id) {
        this.product_id = product_id;
    }

    public long getAdded_amount() {
        return added_amount;
    }

    public void setAdded_amount(long added_amount) {
        this.added_amount = added_amount;
    }

    public long getRetired_amount() {
        return retired_amount;
    }

    public void setRetired_amount(long retired_amount) {
        this.retired_amount = retired_amount;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public LocalDate getCreateAt() {
        return createAt;
    }

    public void setCreateAt(LocalDate createAt) {
        this.createAt = createAt;
    }

    public LocalDate getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(LocalDate updateAt) {
        this.updateAt = updateAt;
    }
}

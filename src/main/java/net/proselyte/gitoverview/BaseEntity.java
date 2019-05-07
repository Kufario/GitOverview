package net.proselyte.gitoverview;

public class BaseEntity {

    private Long id;


    public Long getID() {
        return id;
    }

    public void setID() {
        this.id = id;
    }

    @Override
    public String toString() {

        return "BaseEnitity{" +
                "id=" + id + "}";
    }

    public boolean isNew() {
        return (this.id == null);
    }



}

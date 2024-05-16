package lk.ijse.gdse.hello.shoe.repository;

import lk.ijse.gdse66.footflex.demo.entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InventoryRepo extends JpaRepository<Inventory,String> {
    List<Inventory> findByDescription(String name);

    Inventory findByCode(String id);
}

package lk.ijse.gdse.hello.shoe.service;

import lk.ijse.gdse66.footflex.demo.dto.SupplierDTO;

import java.util.List;

public interface SupplierService {
    SupplierDTO saveSupplier(SupplierDTO supplierDTO);
    SupplierDTO updateSupplier(SupplierDTO supplierDTO);
    boolean deleteSupplier(String id);
    List<SupplierDTO> getAllSupplier();
    List<SupplierDTO> searchSupplier(String name);
    SupplierDTO searchSupplierById(String id);
    String generateNextId();
}

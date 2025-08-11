SELECT inventory.SKU, inventory.SKU_Description, inventory.WarehouseID, warehouse.WarehouseCity, warehouse.WarehouseState 
FROM warehouse, inventory
WHERE WarehouseCity != ("Atlanta" , "Chicago" ,"Bangor")